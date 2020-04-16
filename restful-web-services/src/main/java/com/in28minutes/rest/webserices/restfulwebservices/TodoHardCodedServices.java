package com.in28minutes.rest.webserices.restfulwebservices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardCodedServices {
	
	private static List<Todo> todos = new ArrayList();
	private static int idCounter = 0;
	
	static {
		todos.add(new Todo(++idCounter , "is28minats","learn new java", new Date() , false));
		todos.add(new Todo(++idCounter , "is28minats","learn new dance", new Date() , false));
		todos.add(new Todo(++idCounter , "is28minats","learn new angular", new Date() , false));
		todos.add(new Todo(++idCounter , "is28minats","learn new java5", new Date() , false));
	}

	public List<Todo> findAll() {
		return todos;
	}
}
