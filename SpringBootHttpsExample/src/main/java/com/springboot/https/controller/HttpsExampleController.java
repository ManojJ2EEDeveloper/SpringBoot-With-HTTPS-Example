package com.springboot.https.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpsExampleController {
	
	@GetMapping("/hello")
	public String returnHelloWorld() {
		return "Hello World !! Accessing Via Https";
	}

}
