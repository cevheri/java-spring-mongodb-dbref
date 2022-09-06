package com.cevher.mongodb.mongodbref.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Getter
@Setter
@Document(collection = "department")
public class Department implements Serializable {
    @Id
    private String id;
    @Field("name")
    private String name;
}
