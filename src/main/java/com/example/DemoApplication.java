package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = "com.example")
@EnableMongoRepositories(basePackages = "com.example.repository")
public class DemoApplication {

  public static void main(String[] args) {
    System.setProperty("spring.config.name", "catalog-service");
    SpringApplication.run(DemoApplication.class, args);
  }
}
