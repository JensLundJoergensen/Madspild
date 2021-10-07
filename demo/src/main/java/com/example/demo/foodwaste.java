package com.example.demo;

import com.example.demo.Services.ContactHandler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@SpringBootApplication
public class foodwaste {
ContactHandler uggabug = new ContactHandler();
	public static void main(String[] args) {
		SpringApplication.run(foodwaste.class, args);
	}

	@GetMapping("/")
	public String root() {
		// Enter template name
		return "root";
	}

	@GetMapping("/contact")
	public String contact() {
		// Enter template name
		return "contact";
	}

	// TODO Handle POST on /contact route

	@PostMapping("/contact")
	public void postContact() {
		int result=uggabug.validateContact(firstName, lastName, email, message, address, postalCode, phoneNumber)

	}

	@GetMapping("/facts")
	public String facts() {
		// Enter template name
		return "facts";
	}
	
	
}
