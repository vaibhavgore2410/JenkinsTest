package com.gore.HttpsUrlConnect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class JenkinsTestApplication {

	public static Logger logger=LoggerFactory.getLogger(JenkinsTestApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(JenkinsTestApplication.class, args);
	}

	@PostConstruct
	public void init() {
		logger.info("Initialized JenkinsTest App");
	}
	
	@GetMapping("/hi")
	public String greet() {
		logger.info("Greeting invoked");
		return "Hey there!";
	}

}
