package com.cevher.mongodb.mongodbref.repository;

import com.cevher.mongodb.mongodbref.entity.Address;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends MongoRepository<Address, String> {

}
