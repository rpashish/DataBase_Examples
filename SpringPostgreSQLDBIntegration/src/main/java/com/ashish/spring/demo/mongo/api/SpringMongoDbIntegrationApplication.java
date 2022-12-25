package com.ashish.spring.demo.mongo.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.ashish.spring.demo.mongo.repository"})
@EntityScan(basePackages = {"com.ashish.spring.demo.mongo.model"})
@ComponentScan(basePackages = {"com.ashish.spring.demo.mongo.controller"})
public class SpringMongoDbIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoDbIntegrationApplication.class, args);
	}

}
