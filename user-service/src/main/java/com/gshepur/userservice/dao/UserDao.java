package com.gshepur.userservice.dao;

import com.gshepur.userservice.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Integer> {

    User findByFirstNameAndLastName(String firstName, String lastName);
}
