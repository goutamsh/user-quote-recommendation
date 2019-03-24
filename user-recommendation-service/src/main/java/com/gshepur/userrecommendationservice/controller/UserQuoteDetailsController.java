package com.gshepur.userrecommendationservice.controller;

import com.gshepur.entity.Quote;
import com.gshepur.entity.User;
import com.gshepur.userrecommendationservice.dto.UserQuoteRequest;
import com.gshepur.userrecommendationservice.dto.UserQuoteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user_quote")
public class UserQuoteDetailsController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/getDetails")
    private UserQuoteResponse getUserQuoteDetails(@RequestBody UserQuoteRequest userQuoteRequest){

        UserQuoteResponse userQuoteResponse = new UserQuoteResponse();
        userQuoteResponse.setUser(restTemplate.getForObject("http://localhost:8091/users/"+userQuoteRequest.getUser().getId(), User.class));
        userQuoteResponse.setQuote(restTemplate.getForObject("http://localhost:8090/quotes/"+userQuoteRequest.getQuote().getId(),Quote.class));
        return userQuoteResponse;
    }
}
