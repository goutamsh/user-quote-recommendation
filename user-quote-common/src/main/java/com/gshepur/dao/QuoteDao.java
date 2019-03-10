package com.gshepur.dao;

import com.gshepur.entity.Quote;
import org.springframework.data.repository.CrudRepository;



public interface QuoteDao extends CrudRepository<Quote, Integer> {

}
