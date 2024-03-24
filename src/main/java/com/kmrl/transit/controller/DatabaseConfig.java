package com.kmrl.transit.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DatabaseConfig {
	
	
	@Value("${spring.datasource.url}")
    private String dataSourceUrl1;

    @Value("${spring.datasource.username}")
    private String dataSourceUsername1;

    @Value("${spring.datasource.password}")
    private String dataSourcePassword1;

    @Value("${spring.datasource.driver-class-name}")
    private String dataSourceDriverClassName1;

    @Value("${spring.datasource.second.url}")
    private String dataSourceUrl2;

    @Value("${spring.datasource.second.username}")
    private String dataSourceUsername2;

    @Value("${spring.datasource.second.password}")
    private String dataSourcePassword2;

    @Value("${spring.datasource.second.driver-class-name}")
    private String dataSourceDriverClassName2;

    @Bean(name = "dataSource1")
    public DataSource dataSource1() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(dataSourceUrl1);
        dataSource.setUsername(dataSourceUsername1);
        dataSource.setPassword(dataSourcePassword1);
        dataSource.setDriverClassName(dataSourceDriverClassName1);
        return dataSource;
    }

    @Bean(name = "dataSource2")
    public DataSource dataSource2() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(dataSourceUrl2);
        dataSource.setUsername(dataSourceUsername2);
        dataSource.setPassword(dataSourcePassword2);
        dataSource.setDriverClassName(dataSourceDriverClassName2);
        return dataSource;
    }

    @Bean(name = "jdbcTemplate1")
    public JdbcTemplate jdbcTemplate1(@Qualifier("dataSource1") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean(name = "jdbcTemplate2")
    public JdbcTemplate jdbcTemplate2(@Qualifier("dataSource2") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}

