package com.springboot.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeLeafController {
	@RequestMapping("/")
public String welcome() {
	return "index";//refers to index.html
}
}
