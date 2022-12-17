package com.example.microservicetwoclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
public class MicroserviceTwoClientApplication {
	@Primary
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}




	public static void main(String[] args) {
		SpringApplication.run(MicroserviceTwoClientApplication.class, args);
	}

}
