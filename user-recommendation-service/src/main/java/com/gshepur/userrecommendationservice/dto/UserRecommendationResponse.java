package com.gshepur.userrecommendationservice.dto;

import com.gshepur.entity.Quote;
import com.gshepur.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserRecommendationResponse {

    private User user;

    private List<Quote> quotes = new ArrayList<>();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Quote> getQuotes() {
        return quotes;
    }

}
