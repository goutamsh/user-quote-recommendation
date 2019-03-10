package com.gshepur.userservice.service;

import com.gshepur.dao.CategoryDao;
import com.gshepur.dao.UserDao;
import com.gshepur.entity.Category;
import com.gshepur.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private CategoryDao categoryDao;


    public Iterable<User> getAllUsers() {
        return userDao.findAll();
    }

    public Optional<User> getUSerById(int id) {
        return userDao.findById(id);
    }

    public User saveUser(User user) {
        return userDao.save(user);
    }

    public void assignCategoryToUser(User user, List<Category> categories) {

        User userEntity = userDao.findByFirstNameAndLastName(user.getFirstName(), user.getLastName());
        for (Category category: categories) {
            Category categoryEntity = categoryDao.findByName(category.getName());
            userEntity.getCategories().add(categoryEntity);
        }
        userDao.save(userEntity);
    }
}
