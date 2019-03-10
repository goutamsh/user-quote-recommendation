package com.gshepur.userservice;

import com.gshepur.dao.CategoryDao;
import com.gshepur.dao.UserDao;
import com.gshepur.entity.Category;
import com.gshepur.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = {UserDao.class, CategoryDao.class})
@EntityScan(basePackageClasses = {User.class, Category.class})
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
