package com.gshepur.userservice.service;

import com.gshepur.userservice.dao.CategoryDao;
import com.gshepur.userservice.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryDao categoryDao;


    public Iterable<Category> getAllCategories() {
        return categoryDao.findAll();
    }

    public Optional<Category> getCategoryById(int id) {
        return categoryDao.findById(id);
    }

    public Category saveCategory(Category category) {
        return categoryDao.save(category);
    }
}
