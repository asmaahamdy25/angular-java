package com.in28minutes.rest.webserices.restfulwebservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoResources {
	
	@Autowired
	private TodoHardCodedServices todoService ;
	
	@GetMapping("/users/{username}/todos")
	public List<Todo> getallTodos(@PathVariable String username){
		return todoService.findAll();
	}
}
