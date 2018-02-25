package com.sales.domain;

import java.util.List;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="inventory")
@TypeAlias("inventory")
public class Inventory {

	private String id;
	
	@DBRef
	private ProductInfo prodInfo;
	
	@DBRef
	private List<ProductInfo> versionHistory;

	 @Version Long version;

	 
	 
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public ProductInfo getProdInfo() {
		return prodInfo;
	}

	public void setProdInfo(ProductInfo prodInfo) {
		this.prodInfo = prodInfo;
	}

	public List<ProductInfo> getVersionHistory() {
		return versionHistory;
	}

	public void setVersionHistory(List<ProductInfo> versionHistory) {
		this.versionHistory = versionHistory;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	
	
	
}
