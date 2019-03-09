package com.gshepur.quoteservice.dao;

import com.gshepur.quoteservice.model.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface AuthorDao extends CrudRepository<Author, Integer> {


}
