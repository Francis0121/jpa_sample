package com.study.jpa.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;

/**
 * Created by francis on 2015. 12. 1..
 */
@Configuration
@Import({JDBCDatasourceConfig.class, PersistenceJPAConfig.class})
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class),
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Configuration.class)}, basePackages = {"com.study.jpa"})
public class RootApplication {
}
