package com.sales.domain;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="customerRequest")
@TypeAlias("customerRequest")
public class CustomerRequests {

	@Id
	private ObjectId id;
	
	private String request;
	
	private Date dateOfRequest;
	
	private String modeOfRequest;
	
	private boolean isRequestFulfilled;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public Date getDateOfRequest() {
		return dateOfRequest;
	}

	public void setDateOfRequest(Date dateOfRequest) {
		this.dateOfRequest = dateOfRequest;
	}

	public String getModeOfRequest() {
		return modeOfRequest;
	}

	public void setModeOfRequest(String modeOfRequest) {
		this.modeOfRequest = modeOfRequest;
	}

	public boolean isRequestFulfilled() {
		return isRequestFulfilled;
	}

	public void setRequestFulfilled(boolean isRequestFulfilled) {
		this.isRequestFulfilled = isRequestFulfilled;
	}
	
	
}
