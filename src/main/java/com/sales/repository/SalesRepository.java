package com.sales.repository;

import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sales.domain.CustomerInfo;

@Repository
public interface SalesRepository extends MongoRepository<CustomerInfo, ObjectId>{

	
	
	CustomerInfo findByCustomerPhone(Long phone);
	
	 	
}
