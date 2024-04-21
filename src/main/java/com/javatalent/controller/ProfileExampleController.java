package com.javatalent.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileExampleController {
	@Value("${message}")
	String message;
	
	@GetMapping("/hello")
	public String printMessage() {
		return "Hello" + message;
	}

}
