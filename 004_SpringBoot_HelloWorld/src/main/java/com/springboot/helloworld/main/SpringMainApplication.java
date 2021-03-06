package com.springboot.helloworld.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.springboot.helloworld.controller"})//mention parent package explicitly
public class SpringMainApplication {
public static void main(String[] args) {
	SpringApplication.run(SpringMainApplication.class, args);
}
}
