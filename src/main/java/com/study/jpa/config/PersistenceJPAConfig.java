package com.study.jpa.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaRepositories(basePackages = {"com.study.jpa.repository"}, entityManagerFactoryRef = "commonEntityManagerFactory", transactionManagerRef = "commonTxManager")
public class PersistenceJPAConfig {

	private String entityPackage = "com.study.jpa.entity";
	private String dialect = "org.hibernate.dialect.MySQL5Dialect";

	private String commonJpaUnit = "commonUnit";
	private String commonHbm2ddlAuto = "none";
	private String commonShowSql = "true";

	@Bean
	public LocalContainerEntityManagerFactoryBean commonEntityManagerFactory(DataSource dataSource) {

		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setPersistenceUnitName(commonJpaUnit);
		emf.setDataSource(dataSource);
		emf.setPackagesToScan(new String[] {entityPackage});

		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		emf.setJpaVendorAdapter(vendorAdapter);
		emf.setJpaProperties(additionalCommonProperties());

		return emf;
	}

	@Bean
	public PlatformTransactionManager commonTxManager(EntityManagerFactory commonEntityManagerFactory) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(commonEntityManagerFactory);
		return transactionManager;
	}

	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}

	Properties additionalCommonProperties() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.hbm2ddl.auto", commonHbm2ddlAuto);
		properties.setProperty("hibernate.dialect", dialect);
		properties.setProperty("hibernate.show_sql", commonShowSql);
		return properties;
	}

}
