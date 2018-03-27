package com.springboot.mysql.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/snacks")
public class SnacksController {
	
	@RequestMapping("/welcome")
public String welcome()
{
	return "Welcome to Free Snacks Hub!!";
}
	@RequestMapping("/welcome/free")
	public String welcomeFree()
	{
		return "You win 12 free Cheese Crust Pizzas!!";
	}
}
