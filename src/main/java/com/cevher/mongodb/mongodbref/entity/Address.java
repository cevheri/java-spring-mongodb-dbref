package com.cevher.mongodb.mongodbref.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Getter
@Setter
@Document(collection = "address")
public class Address implements Serializable {
    @Id
    private String id;
    @Field("address_line")
    private String addressLine;
}
