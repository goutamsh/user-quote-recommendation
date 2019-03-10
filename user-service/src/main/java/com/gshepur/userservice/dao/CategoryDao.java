package com.gshepur.userservice.dao;

import com.gshepur.userservice.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryDao extends CrudRepository<Category, Integer>{

    Category findByName(String name);
}
