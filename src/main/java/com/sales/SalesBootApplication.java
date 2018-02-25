package com.sales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;



@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SalesBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesBootApplication.class, args);
	}
}
