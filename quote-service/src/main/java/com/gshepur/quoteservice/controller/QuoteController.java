package com.gshepur.quoteservice.controller;

import com.gshepur.entity.Quote;
import com.gshepur.quoteservice.dto.QuoteCategoryAddRequest;
import com.gshepur.quoteservice.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("quotes")
public class QuoteController {

    @Autowired
    private QuoteService quoteService;

    @Autowired
    private DiscoveryClient discoveryClient;

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

    @PostMapping("/assignCategory")
    public Boolean assignCategoryToQuote(@RequestBody QuoteCategoryAddRequest quoteCategoryAddRequest){

        quoteService.assignCategoryToQuote(quoteCategoryAddRequest.getQuote(), quoteCategoryAddRequest.getCategoryList());
        return true;
    }

    @GetMapping("/services/{applicationName}")
    public List<ServiceInstance> serviceInstaceByAppNAme(@PathVariable String applicationName){
        return this.discoveryClient.getInstances(applicationName);
    }

}
