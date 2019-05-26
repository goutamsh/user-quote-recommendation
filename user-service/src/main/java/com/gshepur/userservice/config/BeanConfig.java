package com.gshepur.userservice.config;

import com.gshepur.dao.CategoryDao;
import com.gshepur.dao.UserDao;
import com.gshepur.entity.Category;
import com.gshepur.entity.User;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackageClasses = {UserDao.class, CategoryDao.class})
@EntityScan(basePackageClasses = {User.class, Category.class})
public class BeanConfig {
}
