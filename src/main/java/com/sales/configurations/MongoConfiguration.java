package com.sales.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories
//@PropertySource("classpath:/com/${my.placeholder:default/path}/app.properties")
public class MongoConfiguration  {//extends AbstractMongoConfiguration{


	 @Autowired
     Environment env;
	
	/* @Bean
	 public WriteConcernResolver writeConcernResolver() {
	     return action -> {
	         System.out.println("Using Write Concern of Acknowledged");
	         return WriteConcern.ACKNOWLEDGED;
	     };
	 }
	
	 

	    @Bean
	    public MongoTemplate mongoTemplate() throws Exception {
	        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
	        return mongoTemplate;
	    }*/
	 /*
	 @Bean
	    public MongoDbFactory mongoDbFactory() {
		 MongoClientURI uri = new MongoClientURI("mongodb://heroku_4cbsf2xz:4l509i1mbrlc78nu0fmp0b8q1c@ds117729.mlab.com:17729/heroku_4cbsf2xz");
			
	      // MongoClient mongoClient = new MongoClient(uri);
	       MongoClient mongoClient = new MongoClient("127.0.0.1");
	        return new SimpleMongoDbFactory(mongoClient, "salesApp");
	    }
	@Override
	public MongoClient mongoClient() {
		MongoClientURI uri = new MongoClientURI("mongodb://heroku_4cbsf2xz:4l509i1mbrlc78nu0fmp0b8q1c@ds117729.mlab.com:17729/heroku_4cbsf2xz");
		//MongoCredential userCredentials = new MongoCredential("", "");
	 //	return new MongoClient(uri);
		return new MongoClient("127.0.0.1");
	}

	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return "salesDb";
	}*/

}