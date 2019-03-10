package com.gshepur.quoteservice.dao;

import com.gshepur.quoteservice.model.Quote;
import org.springframework.data.repository.CrudRepository;



public interface QuoteDao extends CrudRepository<Quote, Integer> {

}
