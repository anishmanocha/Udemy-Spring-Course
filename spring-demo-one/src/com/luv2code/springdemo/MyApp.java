package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		/*Create on the coach interface, not the implementation
		So we can scale our application similarly for any type of coach (Baseball, Track, etc.)
		However, we lack configurability: we cannot easily swap out the TrackCoach below
		because it is hard coded.  The way the Spring framework addresses this problem is that
		it will allow us to swap in any type of coach at this point, when reading from an XML
		file.  I believe this is what Chad was saying when he was saying that the creation
		of our objects is delegated outside the scope of our class*/
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach= context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.tellFortune());
		
		
		context.close();
		
		

	}

}
