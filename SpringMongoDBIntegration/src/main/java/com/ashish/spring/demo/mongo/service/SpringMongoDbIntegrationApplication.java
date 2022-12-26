package com.ashish.spring.demo.mongo.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ashish.spring.demo.mongo.controller"})
@EntityScan(basePackages = {"com.ashish.spring.demo.mongo.model"})
@EnableMongoRepositories(basePackages = {"com.ashish.spring.demo.mongo.repository"})
public class SpringMongoDbIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoDbIntegrationApplication.class, args);
	}

}
