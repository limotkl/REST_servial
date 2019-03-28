package com.testService.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstWebServiceController {
	
	@RequestMapping(method = RequestMethod.GET,path = "/first-service")
	public String hello(){
		
		return "First Web Service";
	}
	
	@RequestMapping(method = RequestMethod.GET,path = "/second-service")
	public String second_hello(){
		
		return "Second Web Service";
	}
	
	
	@RequestMapping(method = RequestMethod.GET,path = "/third-service")
	public String third_hello(){
		
		return "Third Web Service";
	}
	@GetMapping(path ="/first-service/printname/{name}")
	public String firstPath(@PathVariable String name){
		
		return "Forst Path" + name;
	}
	
	
}
