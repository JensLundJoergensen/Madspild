package com.example.demo;

import com.example.demo.Models.Contact;
import com.example.demo.Services.ContactHandler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@SpringBootApplication
public class foodwaste {
ContactHandler handler = new ContactHandler();
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
	public String postContact(@RequestParam MultiValueMap body ) {
		System.out.print(body);
	String result=handler.validateContact(String.valueOf(body.get("firstname")), String.valueOf(body.get("secondname")), String.valueOf(body.get("email")), String.valueOf(body.get("message")), String.valueOf(body.get( "address")), String.valueOf(body.get("postalCode")), String.valueOf(body.get("phoneNumber")));
        if (result.equals("200")) {
			return "success";
			
		} if (result.equals("400")) {
			return "fail";

		}
		return "contact";
	}

		

	@GetMapping("/facts")
	public String facts() {
		// Enter template name
		return "facts";

	}
}
