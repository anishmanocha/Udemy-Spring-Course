package com.luv2code.springdemo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportConfig.class);
		
		//Nothing we've done here is any different, we've just created our beans outside of the Spring container
		
		Coach swimCoach= context.getBean("swimCoach", Coach.class);
		
		System.out.println(swimCoach.getDailyWorkout());
		
		System.out.println(swimCoach.giveFortune());
		
		context.close();
		
		

	}

}
