package com.onlinefood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.onlinefood.bean")
@EnableJpaRepositories(basePackages = "com.onlinefood.repository")
public class OnlineFoodApplication {

	
		public static void main(String[] args) {
			SpringApplication.run(OnlineFoodApplication.class, args);
			System.out.println("Server running on port number 9090");
		}


}
