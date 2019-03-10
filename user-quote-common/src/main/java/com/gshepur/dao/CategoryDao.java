package com.gshepur.dao;

import com.gshepur.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryDao extends CrudRepository<Category, Integer>{

    Category findByName(String name);
}
