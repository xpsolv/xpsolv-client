package com.xpsolv.dao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
public class XpsolvDaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(XpsolvDaoApplication.class, args);
	}

}
