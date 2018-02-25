package com.sales.domain;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="customerInfo")
@TypeAlias("customerInfo")
public class CustomerReivews {

	@Id
	private ObjectId id;
	
	private String review;
	
	@DBRef
	private ProductInfo reviewAbout;
	
	private Date dateOfReview;
	
	private String reviewMode;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public ProductInfo getReviewAbout() {
		return reviewAbout;
	}

	public void setReviewAbout(ProductInfo reviewAbout) {
		this.reviewAbout = reviewAbout;
	}

	public Date getDateOfReview() {
		return dateOfReview;
	}

	public void setDateOfReview(Date dateOfReview) {
		this.dateOfReview = dateOfReview;
	}

	public String getReviewMode() {
		return reviewMode;
	}

	public void setReviewMode(String reviewMode) {
		this.reviewMode = reviewMode;
	}
	
	
}
