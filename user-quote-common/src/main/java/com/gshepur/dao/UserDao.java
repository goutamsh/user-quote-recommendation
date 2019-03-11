package com.gshepur.dao;

import com.gshepur.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Integer> {

    User findByFirstNameAndLastName(String firstName, String lastName);

    User findByIdOrFirstNameAndLastName(Integer id, String firstName, String lastName);
}
