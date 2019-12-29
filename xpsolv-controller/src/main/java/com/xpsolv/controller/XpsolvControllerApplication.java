package com.xpsolv.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScans(value = { @ComponentScan("com.xpsolv.business.layer.*"), @ComponentScan("com.xpsolv.dao.*") })
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.xpsolv.dao.repositories")
@EntityScan(basePackages = "com.xpsolv.dao.entity")

public class XpsolvControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(XpsolvControllerApplication.class, args);
	}

}
