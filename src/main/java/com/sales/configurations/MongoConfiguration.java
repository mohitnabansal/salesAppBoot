package com.sales.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.WriteConcernResolver;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;
import com.mongodb.WriteConcern;

@Configuration
@EnableMongoRepositories(basePackages = "com.sales.repository")
//@PropertySource("classpath:/com/${my.placeholder:default/path}/app.properties")
public class MongoConfiguration extends AbstractMongoConfiguration{


	 @Autowired
     Environment env;
	
	 @Bean
	 public WriteConcernResolver writeConcernResolver() {
	     return action -> {
	         System.out.println("Using Write Concern of Acknowledged");
	         return WriteConcern.ACKNOWLEDGED;
	     };
	 }
	
	 @Bean
	    public MongoDbFactory mongoDbFactory() {
	        MongoClient mongoClient = new MongoClient("localhost", 27017);
	        UserCredentials userCredentials = new UserCredentials("", "");
	        return new SimpleMongoDbFactory(mongoClient, "salesApp");
	    }

	    @Bean
	    public MongoTemplate mongoTemplate() throws Exception {
	        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
	        return mongoTemplate;
	    }
	@Override
	public MongoClient mongoClient() {
		//MongoCredential userCredentials = new MongoCredential("", "");
		return new MongoClient("127.0.0.1");
	}

	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return "salesDb";
	}

}
