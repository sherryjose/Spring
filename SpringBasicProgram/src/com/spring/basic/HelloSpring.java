package com.spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Training t=(Training) context.getBean("trainingBean");
	
	String topic=t.getTrainingtopic();
	System.out.println(topic);
}
}