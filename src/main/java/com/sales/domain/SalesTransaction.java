package com.sales.domain;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="salesTrans")
@TypeAlias("salesTrans")
public class SalesTransaction {
	
	@Id
	private ObjectId id;
	
	@DBRef
	private List<PurchaseHistory> listOfProd;

	@DBRef
	private CustomerInfo customer;
	
	
	private Long totalAmount;
	
	private Long totalQty;
	
	private Long discount;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public List<PurchaseHistory> getListOfProd() {
		return listOfProd;
	}

	public void setListOfProd(List<PurchaseHistory> listOfProd) {
		this.listOfProd = listOfProd;
	}

	public CustomerInfo getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerInfo customer) {
		this.customer = customer;
	}

	public Long getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Long getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(Long totalQty) {
		this.totalQty = totalQty;
	}

	public Long getDiscount() {
		return discount;
	}

	public void setDiscount(Long discount) {
		this.discount = discount;
	}
	
	
}
