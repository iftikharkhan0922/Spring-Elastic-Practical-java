package com.course.Practicaljava.api.server;

import java.time.LocalTime;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class DefaultRestApi {
	
	@GetMapping(value = "/Welcome")
	public String Welcome() {
		System.out.println(StringUtils.join("Hello", " this is", " Spring Boot", " Rest API" ));
		return "Welcome to Spring Boot.";
	} // End Welcome()
	
	@GetMapping(value = "/time")
	public String time() {
		return LocalTime.now().toString();
	} // End time()

} // End class.
