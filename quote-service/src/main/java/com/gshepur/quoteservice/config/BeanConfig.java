package com.gshepur.quoteservice.config;

import com.gshepur.dao.AuthorDao;
import com.gshepur.dao.QuoteDao;
import com.gshepur.entity.Author;
import com.gshepur.entity.Quote;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackageClasses = {QuoteDao.class, AuthorDao.class})
@EntityScan(basePackageClasses = {Quote.class, Author.class})
public class BeanConfig {
}
