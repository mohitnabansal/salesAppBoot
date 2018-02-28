package com.sales.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="imageStore")
@TypeAlias("imageStore")
public class ImageStore {

	@Id
	private String Id;
	
	private String image64;
	
	private String imageDescp;
	
	private String imgMetaData;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getImage64() {
		return image64;
	}

	public void setImage64(String image64) {
		this.image64 = image64;
	}

	public String getImageDescp() {
		return imageDescp;
	}

	public void setImageDescp(String imageDescp) {
		this.imageDescp = imageDescp;
	}

	public String getImgMetaData() {
		return imgMetaData;
	}

	public void setImgMetaData(String imgMetaData) {
		this.imgMetaData = imgMetaData;
	}
	
	
}
