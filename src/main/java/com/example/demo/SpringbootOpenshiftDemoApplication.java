package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootOpenshiftDemoApplication {
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome to Openshift";
	}
	
	@GetMapping("/{input}")
	public String congrats(@PathVariable String input) {
		return "Hello " + input + " Your application is deployed successfully";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootOpenshiftDemoApplication.class, args);
	}

}
