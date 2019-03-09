package com.gshepur.quoteservice.service;

import com.gshepur.quoteservice.dao.QuoteDao;
import com.gshepur.quoteservice.model.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuoteService {

    @Autowired
    private QuoteDao quoteDao;

    public Iterable<Quote> getAllQuotes() {
        return quoteDao.findAll();
    }

    public Optional<Quote> getQuoteById(int id) {
        return quoteDao.findById(id);
    }

    public Quote saveQuote(Quote quote) {
        return quoteDao.save(quote);
    }
}
