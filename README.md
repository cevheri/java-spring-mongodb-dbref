# Getting Started

## Spring Boot MongoDB Example
* Entity
* ManyToOne
* ManyToMany
---
### Run MongoDB on docker
```shell
docker-compose -f src/main/docker/mongodb.yml up 
```
### Build
```
./mvnw clean verify
```
### Run
```shell
mvn spring-boot:run
```
### Call Rest API

You can use : [src/main/requests/rest-request.http](src/main/requests/rest-request.http)

    1.Create Address
    2.Create Department
    3.Create Person
    4.GetAllPerson

see:
```json
{
  "id": "6317285099e3c97d9577699d",
  "firstName": "content",
  "lastName": "content",
  "department": {
    "id": "d1",
    "name": "department1"
  },
  "addresses": [
    {
      "id": "a1",
      "addressLine": "address line 01"
    }
  ]
}
```

---

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.3/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#web)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#using.devtools)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#data.nosql.mongodb)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)

