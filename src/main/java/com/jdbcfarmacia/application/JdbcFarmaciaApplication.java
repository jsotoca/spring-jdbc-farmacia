package com.jdbcfarmacia.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.jdbcfarmacia.controllers", "com.jdbcfarmacia.repositories", "com.jdbcfarmacia.entities" })
//@EntityScan("com.jdbcfarmacia.entities")
public class JdbcFarmaciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcFarmaciaApplication.class, args);
	}

}
