package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class foodwaste {

	public static void main(String[] args) {
		SpringApplication.run(foodwaste.class, args);
	}

	@GetMapping("/contact")
	public String contact() {
		// Enter template name
		return "contact";
	}

	@GetMapping("/facts")
	public String facts() {
		// Enter template name
		return "facts";
	}

}
