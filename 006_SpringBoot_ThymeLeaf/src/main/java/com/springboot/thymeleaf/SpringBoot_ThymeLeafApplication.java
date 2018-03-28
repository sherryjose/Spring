package com.springboot.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages= {"com.springboot.thymeleaf.controller"})//give {} even if 1 string input...
public class SpringBoot_ThymeLeafApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBoot_ThymeLeafApplication.class, args);
	}
}
