package com.cevher.mongodb.mongodbref.controller;

import com.cevher.mongodb.mongodbref.entity.Address;
import com.cevher.mongodb.mongodbref.entity.Department;
import com.cevher.mongodb.mongodbref.entity.Person;
import com.cevher.mongodb.mongodbref.repository.AddressRepository;
import com.cevher.mongodb.mongodbref.repository.DepartmentRepository;
import com.cevher.mongodb.mongodbref.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ResourceController {

    private final AddressRepository addressRepository;
    private final PersonRepository personRepository;
    private final DepartmentRepository departmentRepository;


    @GetMapping("/addresses/{id}")
    public Address findAddressById(@PathVariable String id){
        return addressRepository.findById(id).orElse(new Address());
    }
    @GetMapping("/departments/{id}")
    public Department findDepartmentById(@PathVariable String id){
        return departmentRepository.findById(id).orElse(new Department());
    }
    @GetMapping("/people/{id}")
    public Person findPersonById(@PathVariable String id){
        return personRepository.findById(id).orElse(new Person());
    }

    @GetMapping("/addresses")
    public List<Address> findAllAddresses(){
        return addressRepository.findAll();
    }
    @GetMapping("/departments")
    public List<Department> findAllDepartments(){
        return departmentRepository.findAll();
    }
    @GetMapping("/people")
    public List<Person> findAllPerson(){
        return personRepository.findAll();
    }

    @PostMapping("/addresses")
    public Address createAddress(@RequestBody Address address){
        return addressRepository.save(address);
    }
    @PostMapping("/departments")
    public Department createDepartment(@RequestBody Department department){
        return departmentRepository.save(department);
    }
    @PostMapping("/people")
    public Person createPerson(@RequestBody Person person){
        return personRepository.save(person);
    }


}
