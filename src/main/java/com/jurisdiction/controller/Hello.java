package com.jurisdiction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@GetMapping("/")
	private String hello() {
		return "hello world";
	}
	
	
}
