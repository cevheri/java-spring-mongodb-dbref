package com.cevher.mongodb.mongodbref.repository;

import com.cevher.mongodb.mongodbref.entity.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {

//    @Query("{}")
//    List<Person> findAll();
}
