package com.gshepur.userrecommendationservice.config;

import com.gshepur.dao.UserDao;
import com.gshepur.entity.Category;
import com.gshepur.entity.Quote;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableJpaRepositories(basePackageClasses = {UserDao.class})
@EntityScan(basePackageClasses = {UserDao.class, Category.class, Quote.class})
public class BeanConfig {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
        return restTemplateBuilder.build();
    }
}
