package com.example.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Catalog {
  @Id
  private String id;
  private String displayName;
  private List<Category> rootCategories;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public List<Category> getRootCategories() {
    return rootCategories;
  }

  public void setRootCategories(List<Category> rootCategories) {
    this.rootCategories = rootCategories;
  }
}
