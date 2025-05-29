package com.CapStone.blinkitservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BlinkItBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlinkItBackEndApplication.class, args);
	}

	@GetMapping("/")
	public String welcome() {
		return "Welcome to BlinkIt Backend Service! Use /auth/signin to login or /auth/signup to register.";
	}

}
