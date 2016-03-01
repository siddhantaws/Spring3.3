package com.manh.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		GreetingService greetingService = (GreetingService) context.getBean("greetingService");
		System.out.println(greetingService.sayHello("Sang Shin", "Good morning!"));
		
		context.close();
	}
}