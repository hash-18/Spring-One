package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach=context.getBean("myCoach1", Coach.class);
		theCoach.getTraining();
		theCoach.getFortune();
		context.close();
	}

}
