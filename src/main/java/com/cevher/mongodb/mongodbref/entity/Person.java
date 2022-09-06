package com.cevher.mongodb.mongodbref.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Document(collection = "person")
public class Person implements Serializable {
    @Id
    private String id;
    @Field("first_name")
    private String firstName;
    @Field("last_name")
    private String lastName;
    @Field("department")
    private Department department;
    @DBRef
    @Field("addresses")
    private Set<Address> addresses = new HashSet<>();
}
