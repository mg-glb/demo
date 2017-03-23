package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.entity.Media;

public interface MediaRepository extends MongoRepository<Media, String> {

}
