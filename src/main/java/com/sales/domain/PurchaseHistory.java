package com.sales.domain;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="purchaseHistory")
@TypeAlias("purchaseHistory")
public class PurchaseHistory {

	@Id
	private ObjectId id;
	
	@DBRef
	private ProductInfo productBuyed;
	
	private Date dateOfPurchase;
	
	private Long quanOfProd;
	
	private Double discountAmt;
	
	private Double totAmount;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public ProductInfo getProductBuyed() {
		return productBuyed;
	}

	public void setProductBuyed(ProductInfo productBuyed) {
		this.productBuyed = productBuyed;
	}

	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public Long getQuanOfProd() {
		return quanOfProd;
	}

	public void setQuanOfProd(Long quanOfProd) {
		this.quanOfProd = quanOfProd;
	}

	public Double getDiscountAmt() {
		return discountAmt;
	}

	public void setDiscountAmt(Double discountAmt) {
		this.discountAmt = discountAmt;
	}

	public Double getTotAmount() {
		return totAmount;
	}

	public void setTotAmount(Double totAmount) {
		this.totAmount = totAmount;
	}
	
	
}
