package com.gshepur.dao;


import com.gshepur.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorDao extends CrudRepository<Author, Integer> {


    Author findByName(String name);
}
