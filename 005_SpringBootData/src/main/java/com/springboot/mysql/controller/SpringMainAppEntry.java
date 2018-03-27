package com.springboot.mysql.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.annotation.DirtiesContext;

@SpringBootApplication
//@ComponentScan(basePackages= {"com.springboot.mysql.controller"})
//@EnableJpaRepositories(basePackages= {"com.springboot.mysql.repository"})
//@EntityScan(basePackages= {"com.springboot.mysql.entity.UseWater"})
@DirtiesContext
public class SpringMainAppEntry {
public static void main(String[] args) {
	SpringApplication.run(SpringMainAppEntry.class, args);
}
} 
