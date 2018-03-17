package com.luv2code.springdemo2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//Load Spring config file
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Grab beans from Spring container
		
		//Each of these objects, when tennisCoach is declared as a prototype scope, will point to distinct objects in memory
		
		Coach theCoach= context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach= context.getBean("tennisCoach", Coach.class);
		
		//See where each of the coaches is stored in memory
		
		if (theCoach==alphaCoach) {
			
			System.out.print("The two are the same coach!");
		}
		
		else {
			
			System.out.println("These are two different coaches: ");
			
			System.out.println("The coach is stored is memory at " + theCoach);
			
			System.out.println("The alpha coach is stored is memory at " + alphaCoach);
		}
		
		//Remember, it's almost important to close our input streams.  In this case, we're reading from the Spring container.
		
		context.close();
		
		

	}

}
