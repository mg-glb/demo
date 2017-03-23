package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.entity.Category;

public interface CategoryRepository extends MongoRepository<Category, String> {

}
