# HelloWorldCompare
Compare How many space need different programming languages in Docker Images.
Application always the same. Hello World over rest endpoint with a simple test.

![img.png](img.png)

##Ranking

### 1. Java (Spring Boot) 

---
####Docker Image Size => 208 MB (Traditional Docker Build)
  
- Runtime: adoptopenjdk/openjdk15:alpine-jre => 191MB
- Application: Java 15 / Spring Boot 2.4.5 => 17 MB
  
####Docker Image Size => 208 MB (Layered Docker Build)

- Runtime: adoptopenjdk/openjdk15:alpine-jre => 191 MB
- Application: Java 15 / Spring Boot 2.4.5 => 17 MB