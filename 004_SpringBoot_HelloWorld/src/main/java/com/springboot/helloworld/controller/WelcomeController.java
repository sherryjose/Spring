package com.springboot.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@RequestMapping("/snacks/getall")
public String welcome()
{
	return "Go and have a cake party!!";
}
}
