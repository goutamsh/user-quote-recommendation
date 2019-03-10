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

    @GetMapping("/")
    public Iterable<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable int id){
        return userService.getUSerById(id);
    }

    @PostMapping("/")
    public User saveUSer(@RequestBody User user){
        return userService.saveUser(user);
    }

    @PostMapping("/assignCategory")
    public boolean assignCategoryToUser(@RequestBody UserCategoryAddRequest userCategoryAddRequet){

        userService.assignCategoryToUser(userCategoryAddRequet.getUser(), userCategoryAddRequet.getCategories());

        return true;
    }

}
