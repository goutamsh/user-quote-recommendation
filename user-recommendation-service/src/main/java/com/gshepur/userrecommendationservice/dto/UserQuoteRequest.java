package com.gshepur.userrecommendationservice.dto;

import com.gshepur.entity.Quote;
import com.gshepur.entity.User;

public class UserQuoteRequest {

    private User user;

    private Quote quote;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }
}
