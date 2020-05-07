package com.myproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class MyProjectController {
	
	@GetMapping("/test")
	public String sendTest() {
		System.out.println("I am here ...");
		return "Hello User";
	}

}
