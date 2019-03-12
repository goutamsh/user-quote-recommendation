package com.gshepur.userservice.controller;

import com.gshepur.entity.User;
import com.gshepur.userservice.dto.UserCategoryAddRequest;
import com.gshepur.userservice.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("users")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;


    @GetMapping(path = "/", produces = "application/json")
    public Iterable<User> getAllUsers(){
        LOGGER.info("Request to fetch all users");
        return userService.getAllUsers();
    }


    @GetMapping(path = "/{id}", produces = "application/json")
    public Optional<User> getUserById(@PathVariable int id){
        LOGGER.info("Request to fetch user by ID: {}", id);
        return userService.getUSerById(id);
    }

    @PostMapping(path = "/", produces = "application/json")
    public User saveUSer(@RequestBody User user){
        return userService.saveUser(user);
    }

    @PostMapping(path = "/assignCategory", produces = "application/json")
    public Boolean assignCategoryToUser(@RequestBody UserCategoryAddRequest userCategoryAddRequet){

        userService.assignCategoryToUser(userCategoryAddRequet.getUser(), userCategoryAddRequet.getCategories());

        return true;
    }

}
