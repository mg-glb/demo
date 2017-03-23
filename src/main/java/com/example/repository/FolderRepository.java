package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.entity.Folder;

public interface FolderRepository extends MongoRepository<Folder, String> {

}
