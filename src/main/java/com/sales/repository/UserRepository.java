package com.sales.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sales.security.domain.User;

public interface UserRepository extends MongoRepository<User, String>  {

	User findByUsername(String usr);
	
	
}
