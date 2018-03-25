/*
 * *
 *  * Copyright (c) 2015 Ivan Hristov
 *  * <p/>
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  * <p/>
 *  * http://www.apache.org/licenses/LICENSE-2.0
 *  * <p/>
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.sales.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.sales.configurations.MongoConfiguration;
import com.sales.repository.UserRepository;
import com.sales.security.domain.User;

//@Service
public class MongoDBAuthenticationProvider{ /*extends AbstractUserDetailsAuthenticationProvider {


	@Autowired
    private UserRepository userRepository;
	

	 @Autowired
	 private MongoConfiguration mongoClient;

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {

    }

    @Override
    protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
       
    	
    	 User mongoUserDetails = null ;

        try {
    		// TODO Auto-generated method stub
    		MongoDatabase database = mongoClient.mongoDbFactory().getDb();
    		MongoCollection<Document> collection = database.getCollection("user");
    		 Document document = collection.find(Filters.eq("username",username)).first();
    		 if(document!=null) {
    	             username = document.getString("username");
    	            
    	            String password = document.getString("password");
    	            List<String> authorities = (List<String>) document.get("authorities");
    	             mongoUserDetails = new MongoUserDetails(username,password,authorities.toArray(new String[authorities.size()]));
    	            return mongoUserDetails;
    	        }
    		 
    	      
    	    
        	return	userRepository.findByUsername(username);	
        } catch (Exception repositoryProblem) {
            throw new InternalAuthenticationServiceException(repositoryProblem.getMessage(), repositoryProblem);
        }

        if (mongoUserDetails == null) {
            throw new InternalAuthenticationServiceException(
                    "UserDetailsService returned null, which is an interface contract violation");
        }
		//return mongoUserDetails;
       
    }*/
}