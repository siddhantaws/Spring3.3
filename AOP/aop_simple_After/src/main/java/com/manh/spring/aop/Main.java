package com.manh.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		GreetingService greetingService = (GreetingService) context.getBean("greetingService");
		greetingService.sayHello("Sang Shin", "Good morning!");
		try {
			greetingService.sayHello2("Sang Shin,", "Good evening!");
		} catch (Exception e) {

		} finally {
			context.close();
		}
	}
}
