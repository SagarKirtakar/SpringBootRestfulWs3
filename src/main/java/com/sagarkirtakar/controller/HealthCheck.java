package com.sagarkirtakar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
	
	@GetMapping("/check-health")
	public String checkHealth() {
		return "Health is Ok!";
	}
	
	@GetMapping("/greet")
	public String greet() {
		return "Welcome.!";
	}

}
