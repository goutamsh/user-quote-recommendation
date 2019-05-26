/*
package com.gshepur.userrecommendationservice.controller;


import com.gshepur.entity.Quote;
import com.gshepur.entity.User;
import com.gshepur.userrecommendationservice.dto.UserQuoteRequest;
import com.gshepur.userrecommendationservice.dto.UserQuoteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user_quote_using_service_registry")
public class UserQuoteUsingServiceRegistry {

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/getDetails")
    private UserQuoteResponse getUserQuoteDetails(@RequestBody UserQuoteRequest userQuoteRequest){

        UserQuoteResponse userQuoteResponse = new UserQuoteResponse();
        userQuoteResponse.setUser( discoveryClient.getInstances("user-service").get(0). restTemplate.getForObject("http://localhost:8091/users/"+userQuoteRequest.getUser().getId(), User.class));
        userQuoteResponse.setQuote(restTemplate.getForObject("http://localhost:8090/quotes/"+userQuoteRequest.getQuote().getId(),Quote.class));
        return userQuoteResponse;
    }
}
*/
