package com.gshepur.quoteservice.controller;

import com.gshepur.quoteservice.model.Quote;
import com.gshepur.quoteservice.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("quotes")
public class QuoteController {

    @Autowired
    private QuoteService quoteService;

    @GetMapping("/")
    public Iterable<Quote> getAllQuotes(){
        return quoteService.getAllQuotes();
    }

    @GetMapping("/{id}")
    public Optional<Quote> getQuoteById(@PathVariable int id){
        return quoteService.getQuoteById(id);
    }

    @PostMapping("/")
    public Quote saveQuote(@RequestBody Quote quote){
        return quoteService.saveQuote(quote);
    }

}
