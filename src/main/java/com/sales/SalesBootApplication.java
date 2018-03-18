package com.sales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;



@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableMongoRepositories(basePackages = "com.sales.repository")
public class SalesBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesBootApplication.class, args);
	}
}
