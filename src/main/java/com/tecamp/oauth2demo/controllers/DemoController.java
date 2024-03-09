package com.tecamp.oauth2demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class DemoController {
	
	@GetMapping(value = "/home")
	@ResponseStatus(HttpStatus.OK)
	public String getHome() {
		return "home";
	}
}
