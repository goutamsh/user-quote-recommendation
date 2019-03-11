package com.gshepur.userrecommendationservice.controller;

import com.gshepur.userrecommendationservice.dto.UserRecommendationRequest;
import com.gshepur.userrecommendationservice.dto.UserRecommendationResponse;
import com.gshepur.userrecommendationservice.service.UserRecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user_recommendation")
public class UserRecommendationController {

    @Autowired
    private UserRecommendationService userRecommendationService;

    @PostMapping("/")
    public UserRecommendationResponse getRecommendationForUser(@RequestBody UserRecommendationRequest userRecommendationRequest){


        return  userRecommendationService.getQuotesForUser(userRecommendationRequest.getUser());
    }
}
