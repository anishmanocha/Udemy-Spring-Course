package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//Load the spring configuration file/where all Spring objects are located
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*Grabbing the appropriate object/bean from our Spring container (this is the type
		 of bean that juxtaposes the old complicated java beans)*/
		Coach theCoach= context.getBean("myCoach", Coach.class);
		
		//Printing the daily workout that my coach is giving me
		System.out.println(theCoach.getDailyWorkout());
		
		//Opening the spring configuration file is basically like opening an input stream: close it
		context.close();

	}

}
