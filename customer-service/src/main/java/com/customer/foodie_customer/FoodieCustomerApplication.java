package com.customer.foodie_customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableEurekaClient
@SpringBootApplication
public class FoodieCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodieCustomerApplication.class, args);
	}
	
	
	
	@LoadBalanced
	@Bean
	public RestTemplate getRestTemplate() {
		
		return new RestTemplate();
	}

}
