package com.sales.domain;



import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="productinfo")
@TypeAlias("productInfo")
public class ProductInfo {

	@Id
	private String id;

	private String productName;

	@Indexed(unique = true)	
	private Long barCodeNumber;
	
	private String barcodeFormat;

	private String prodImgPath;

	private String productDescp;

	private Double CurrProdPrice;
	
	private Double productVerion;
	
	private Double prodDiscPrice;
	
	private Date lastUpdatedOn;
	
	private String productCategory;
	
	 @Version Long version;
 
	 
	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public Date getLastUpdatedOn() {
		return lastUpdatedOn;
	}

	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Long getBarCodeNumber() {
		return barCodeNumber;
	}

	public void setBarCodeNumber(Long barCodeNumber) {
		this.barCodeNumber = barCodeNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}


    

	public String getBarcodeFormat() {
		return barcodeFormat;
	}

	public void setBarcodeFormat(String barcodeFormat) {
		this.barcodeFormat = barcodeFormat;
	}

	public String getProdImgPath() {
		return prodImgPath;
	}

	public void setProdImgPath(String prodImgPath) {
		this.prodImgPath = prodImgPath;
	}

	public Double getProdDiscPrice() {
		return prodDiscPrice;
	}

	public void setProdDiscPrice(Double prodDiscPrice) {
		this.prodDiscPrice = prodDiscPrice;
	}

	public String getProductDescp() {
		return productDescp;
	}

	public void setProductDescp(String productDescp) {
		this.productDescp = productDescp;
	}

	public Double getCurrProdPrice() {
		return CurrProdPrice;
	}

	public void setCurrProdPrice(Double currProdPrice) {
		CurrProdPrice = currProdPrice;
	}

	public Double getProductVerion() {
		return productVerion;
	}

	public void setProductVerion(Double productVerion) {
		this.productVerion = productVerion;
	}
	
}
