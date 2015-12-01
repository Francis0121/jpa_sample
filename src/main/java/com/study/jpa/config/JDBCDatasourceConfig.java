package com.study.jpa.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JDBCDatasourceConfig {

	private String mysqlDriver = "com.mysql.jdbc.Driver";
	private String defaultAutoCommit = "false";

	private String dburl =
	        "jdbc:mysql://127.0.0.1:3306/study?useEncoding=true&characterEncoding=UTF-8&autoReconnect=true&connectTimeout=500&socketTimeout=5000&failOverReadOnly=false&maxReconnects=10&zeroDateTimeBehavior=convertToNull";
	private String user = "root";
	private String password = "";
	private int maxIdle = 2;
	private int maxTotal = 10;
	private int minIdle = 2;
	private int initalSize = 2;
	private long minEvictableIdleTime = 1000;

	@Bean(destroyMethod = "close")
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(mysqlDriver);
		dataSource.setUrl(dburl);
		dataSource.setUsername(user);
		dataSource.setPassword(password);
		dataSource.setInitialSize(initalSize);
		dataSource.setMaxIdle(maxIdle);
		dataSource.setMaxTotal(maxTotal);
		dataSource.setMinIdle(minIdle);
		dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTime);
		dataSource.setDefaultAutoCommit(new Boolean(defaultAutoCommit));
		return dataSource;
	}
}
