package com.luv2code.springdemo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeActivityDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportConfig.class);
		
		BasketballCoach basketballCoach= context.getBean("basketballCoach", BasketballCoach.class);
		
		System.out.println("Your fortune is " + basketballCoach.giveFortune());
		
		

	}

}
