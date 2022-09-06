package com.cevher.mongodb.mongodbref.repository;

import com.cevher.mongodb.mongodbref.entity.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, String> {

}
