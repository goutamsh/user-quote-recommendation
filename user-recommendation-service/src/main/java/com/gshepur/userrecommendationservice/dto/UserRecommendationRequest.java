package com.gshepur.userrecommendationservice.dto;

import com.gshepur.entity.User;

public class UserRecommendationRequest {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
