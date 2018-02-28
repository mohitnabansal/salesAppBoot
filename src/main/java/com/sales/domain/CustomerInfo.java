package com.sales.domain;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="customerInfo")
@TypeAlias("customerInfo")
public class CustomerInfo {

	@Id
	private String id;
	
	private String name;
	
	@Indexed
	private String emailId;
	
	private Date dob;
	private Integer age;
	private String gender;
	private String address;
	private Long customerPhone;
	private String pincode;
	
	@Version Long version;
	
	@DBRef
	private List<PurchaseHistory> purchaseHist;
	
	@DBRef
	private List<CustomerReivews> customerReiviews;
	
	@DBRef
	private List<CustomerRequests> custRequest;
		
	@DBRef
	private ImageStore customerImg;
	
	public Long getVersion() {
		return version;
	}
	public void setVersion(Long version) {
		this.version = version;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
		
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<PurchaseHistory> getPurchaseHist() {
		return purchaseHist;
	}
	public void setPurchaseHist(List<PurchaseHistory> purchaseHist) {
		this.purchaseHist = purchaseHist;
	}
	public List<CustomerReivews> getCustomerReiviews() {
		return customerReiviews;
	}
	public void setCustomerReiviews(List<CustomerReivews> customerReiviews) {
		this.customerReiviews = customerReiviews;
	}
	public List<CustomerRequests> getCustRequest() {
		return custRequest;
	}
	public void setCustRequest(List<CustomerRequests> custRequest) {
		this.custRequest = custRequest;
	}
	
	

	public ImageStore getCustomerImg() {
		return customerImg;
	}
	public void setCustomerImg(ImageStore customerImg) {
		this.customerImg = customerImg;
	}
	public Long getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(Long customerPhone) {
		this.customerPhone = customerPhone;
	}

	
}
