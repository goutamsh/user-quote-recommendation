package com.gshepur.quoteservice.service;

import com.gshepur.dao.CategoryDao;
import com.gshepur.dao.QuoteDao;
import com.gshepur.entity.Category;
import com.gshepur.entity.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuoteService {

    @Autowired
    private QuoteDao quoteDao;

    @Autowired
    private CategoryDao categoryDao;

    public Iterable<Quote> getAllQuotes() {
        return quoteDao.findAll();
    }

    public Optional<Quote> getQuoteById(int id) {
        return quoteDao.findById(id);
    }

    public Quote saveQuote(Quote quote) {
        return quoteDao.save(quote);
    }

    public void assignCategoryToQuote(Quote quote, List<Category> categoryList) {
        Quote quoteEntity = quoteDao.findById(quote.getId()).get();
        for (Category category : categoryList) {
            quoteEntity.getCategories().add(categoryDao.findByName(category.getName()));
        }
        quoteDao.save(quoteEntity);
    }
}
