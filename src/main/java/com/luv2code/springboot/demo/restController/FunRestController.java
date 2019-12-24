package com.luv2code.springboot.demo.restController;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	// expose "/" that return "Hello World"
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello world ! Time on server is"+ LocalDateTime.now();
	}
}
