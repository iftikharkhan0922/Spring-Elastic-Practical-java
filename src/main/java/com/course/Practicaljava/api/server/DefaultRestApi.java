package com.course.Practicaljava.api.server;

import java.time.LocalTime;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class DefaultRestApi {
	
	private Logger Log = LoggerFactory.getLogger(DefaultRestApi.class);
	
	@GetMapping(value = "/Welcome")
	public String Welcome() {
		Log.info(StringUtils.join("Hello", " this is", " Spring Boot", " Rest API" ));
		return "Welcome to Spring Boot.";
	} // End Welcome()
	
	@GetMapping(value = "/time")
	public String time() {
		return LocalTime.now().toString();
	} // End time()

} // End class.
