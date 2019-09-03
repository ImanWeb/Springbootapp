package com.javatechnie.jenkins.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkins1Application {
	
	@GetMapping("/message")
	public String getMessage() {
		return "Visit to the school!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkins1Application.class, args);
	}

}
