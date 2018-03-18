package com.sales.configurations;

//@Configuration

//@PropertySource("classpath:/com/${my.placeholder:default/path}/app.properties")
public class MongoConfiguration  {/*extends AbstractMongoConfiguration*//*


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
	        MongoClient mongoClient = new MongoClient("mongodb://heroku_4cbsf2xz:4l509i1mbrlc78nu0fmp0b8q1c@ds117729.mlab.com:17729/heroku_4cbsf2xz");
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
		return new MongoClient("mongodb://heroku_4cbsf2xz:4l509i1mbrlc78nu0fmp0b8q1c@ds117729.mlab.com:17729/heroku_4cbsf2xz");
	}

	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return "salesDb";
	}

*/
}