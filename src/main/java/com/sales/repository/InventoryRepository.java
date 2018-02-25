package com.sales.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sales.domain.Inventory;

@Repository
public interface InventoryRepository  extends MongoRepository<Inventory, ObjectId>{

	Inventory findByProdInfoBarCodeNumber(Long barcodeNumber);
	

}
