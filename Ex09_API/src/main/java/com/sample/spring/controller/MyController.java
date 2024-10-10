package com.sample.spring.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/hello")
	public String hello() {
		return "get-hello";
	}
	@PostMapping("/hello")
	public String posthello() {
		return "post-hello";
	}
	
	@PutMapping("/hello")
	public String puthello() {
		return "Put-hello";
	}
	@DeleteMapping("/hello")
	public String deletehello() {
		return "delete-hello";
	}
	
	@GetMapping("/test/param")
	public @ResponseBody String requestParam(
			@RequestParam ("name") String name,
			@RequestParam ("age") Integer age
			) {
		return "hello, request Param, i am " + name + ", " + age;
	}
	
	@GetMapping("/test/path/{name}/{age}")
	public @ResponseBody String requestPath(
			@PathVariable("name") String name,
			@PathVariable("age") Integer age
			) {
		return "hello, request Path, i am " + name + ", " + age;
	}
	
	@PostMapping("/test")
	public @ResponseBody String requestBody(
			 RequestDto request
			) {
		return "hello, request Path, i am " + request.getName() + ", " + request.getAge();
	}
	
}












