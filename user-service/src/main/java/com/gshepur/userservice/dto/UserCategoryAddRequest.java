package com.gshepur.userservice.dto;

import com.gshepur.userservice.model.Category;
import com.gshepur.userservice.model.User;

import java.util.List;

public class UserCategoryAddRequest {

    private User user;

    private List<Category> categories;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
