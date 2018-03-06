package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {
		
		//Establish connection with Spring Container
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
		//Retrieve apporpriate beans
		Coach coach= context.getBean("trackCoach", Coach.class);
		
		System.out.println(coach.tellFortune());
			
		//Close connection with Spring container
		
		context.close();

	}

}
