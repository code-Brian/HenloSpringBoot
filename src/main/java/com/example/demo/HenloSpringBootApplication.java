package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class HenloSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HenloSpringBootApplication.class, args);
	}
	
	@RequestMapping("/")
	public String index() {
		return "Henlo Spring Frens";
	}

}
