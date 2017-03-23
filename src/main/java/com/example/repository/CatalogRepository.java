package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.entity.Catalog;

public interface CatalogRepository extends MongoRepository<Catalog, String> {

}
