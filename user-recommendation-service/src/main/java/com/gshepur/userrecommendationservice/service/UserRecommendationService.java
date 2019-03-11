package com.gshepur.userrecommendationservice.service;

import com.gshepur.dao.CategoryDao;
import com.gshepur.dao.QuoteDao;
import com.gshepur.dao.UserDao;
import com.gshepur.entity.Category;
import com.gshepur.entity.Quote;
import com.gshepur.entity.User;
import com.gshepur.userrecommendationservice.dto.UserRecommendationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRecommendationService {


    @Autowired
    private UserDao userDao;

    public UserRecommendationResponse getQuotesForUser(User user) {

        UserRecommendationResponse userRecommendationResponse = new UserRecommendationResponse();
        userRecommendationResponse.setUser(user);
        User userEntity = userDao.findByIdOrFirstNameAndLastName(user.getId(), user.getFirstName(), user.getLastName());

        for(Category category: userEntity.getCategories()){
            for(Quote quote: category.getQuotes()){
                if(!userRecommendationResponse.getQuotes().contains(quote)){
                    userRecommendationResponse.getQuotes().add(quote);
                }
            }

        }
        return userRecommendationResponse;
    }
}
