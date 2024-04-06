package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ServletComponentScan
@EnableJpaRepositories("com.example.demo.persistence.repo") 
@EntityScan("com.example.demo.persistence.model")
@SpringBootApplication 
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}