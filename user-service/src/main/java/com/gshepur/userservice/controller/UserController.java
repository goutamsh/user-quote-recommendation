package com.gshepur.userservice.controller;

import com.gshepur.entity.User;
import com.gshepur.userservice.dto.UserCategoryAddRequest;
import com.gshepur.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping(path = "/", produces = "application/json")
    public Iterable<User> getAllUsers(){
        return userService.getAllUsers();
    }


    @GetMapping(path = "/{id}", produces = "application/json")
    public Optional<User> getUserById(@PathVariable int id){
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
