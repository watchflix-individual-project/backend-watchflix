package com.watchflix.movieSearchservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovieSearchServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieSearchServiceApplication.class, args);
	}

}
