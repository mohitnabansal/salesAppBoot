package com.sales.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sales.domain.ProductInfo;

@Repository
public interface ProductInfoRespository extends MongoRepository<ProductInfo, ObjectId>{

	List<ProductInfo> findByproductNameLike(String prod);
	
	ProductInfo findByBarCodeNumber(Long barcodeNumber);
}
