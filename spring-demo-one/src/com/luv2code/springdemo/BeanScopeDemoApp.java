package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//Establish connection with Spring Container
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
		//Retrieve apporpriate beans
		Coach coach= context.getBean("trackCoach", Coach.class);
		
		Coach sameCoach= context.getBean("trackCoach", Coach.class);
		
		if (coach == sameCoach) {
			
			System.out.println("This proves that the life span of a bean is by default that of a singleton");
		}
		
		/*If we change the scope to be prototype, aka, every time we grab a coach from the Spring container, it's a different coach,
		we'll be pointing to different places in memory*/
		System.out.println("Memory location of first coach " + coach);
		System.out.println("Memory location of other coach " + sameCoach);
		
		//Close connection with Spring container
		
		context.close();

	}

}
