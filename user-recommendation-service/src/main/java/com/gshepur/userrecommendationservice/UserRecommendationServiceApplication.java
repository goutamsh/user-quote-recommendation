package com.gshepur.userrecommendationservice;

import com.gshepur.dao.UserDao;
import com.gshepur.entity.Category;
import com.gshepur.entity.Quote;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDiscoveryClient
public class UserRecommendationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRecommendationServiceApplication.class, args);
	}

}
