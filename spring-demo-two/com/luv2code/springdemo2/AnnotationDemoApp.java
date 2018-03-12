package com.luv2code.springdemo2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Nothing we've done here is any different, we've just created our beans outside of the Spring container
		
		Coach tennisCoach= context.getBean("tennisCoach", Coach.class);
		
		System.out.println(tennisCoach.getDailyWorkout());
		
		System.out.println(tennisCoach.giveFortune());
		
		

	}

}
