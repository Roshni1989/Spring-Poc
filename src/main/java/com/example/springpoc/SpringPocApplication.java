package com.example.springpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SpringPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPocApplication.class, args);
	}

}
