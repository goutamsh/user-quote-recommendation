package com.gshepur.quoteservice.dao;

import com.gshepur.quoteservice.model.Quote;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface QuoteDao extends CrudRepository<Quote, Integer> {

}
