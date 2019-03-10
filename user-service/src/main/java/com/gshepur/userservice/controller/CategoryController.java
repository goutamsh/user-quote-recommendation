package com.gshepur.userservice.controller;

import com.gshepur.entity.Category;
import com.gshepur.userservice.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/")
    public Iterable<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public Optional<Category> getCategoryById(@PathVariable int id){
        return categoryService.getCategoryById(id);
    }

    @PostMapping("/")
    public Category saveCategory(@RequestBody Category category){
        return categoryService.saveCategory(category);
    }
}
