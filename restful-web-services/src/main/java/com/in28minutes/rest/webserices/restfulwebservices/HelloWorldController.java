package com.in28minutes.rest.webserices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	 
	@GetMapping( path="/hellow-world")
	public String HelloWorld () {
		
		return "Hello World";
	}

	@GetMapping( path="/hellow-world-bean")
	public HelloWorldBean HelloWorldBean () {
		
		return new HelloWorldBean("Hello World");
	}
}
