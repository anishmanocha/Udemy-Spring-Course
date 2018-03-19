package com.luv2code.springdemo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimCoachDemoApp {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportConfig.class);
		
		SwimCoach theCoach= context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println("My email is " + theCoach.getEmail());
		
		System.out.println("The team name is " + theCoach.getTeam());
		
		context.close();
	}

}
