package com.kmrl.transit.controller;

import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;



@Configuration
public class JpaConfig {

	/*
	 * @Autowired private DataSource dataSource;
	 * 
	 * @Bean public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
	 * LocalContainerEntityManagerFactoryBean em = new
	 * LocalContainerEntityManagerFactoryBean(); em.setDataSource(dataSource);
	 * em.setPackagesToScan("com.example.domain"); // Change to your domain package
	 * em.setJpaVendorAdapter(new HibernateJpaVendorAdapter()); return em; }
	 * 
	 * @Bean public JpaTransactionManager transactionManager(EntityManagerFactory
	 * entityManagerFactory) { JpaTransactionManager transactionManager = new
	 * JpaTransactionManager();
	 * transactionManager.setEntityManagerFactory(entityManagerFactory); return
	 * transactionManager;     }
	 */
}
