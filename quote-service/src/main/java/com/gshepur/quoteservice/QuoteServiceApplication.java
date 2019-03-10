package com.gshepur.quoteservice;

import com.gshepur.dao.AuthorDao;
import com.gshepur.dao.CategoryDao;
import com.gshepur.dao.QuoteDao;
import com.gshepur.dao.UserDao;
import com.gshepur.entity.Author;
import com.gshepur.entity.Quote;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = {QuoteDao.class, AuthorDao.class})
@EntityScan(basePackageClasses = {Quote.class, Author.class})
public class QuoteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuoteServiceApplication.class, args);
	}

}
