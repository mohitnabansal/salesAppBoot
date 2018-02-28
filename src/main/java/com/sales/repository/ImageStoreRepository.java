package com.sales.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sales.domain.ImageStore;

@Repository
public interface ImageStoreRepository extends MongoRepository<ImageStore, ObjectId>{

}
