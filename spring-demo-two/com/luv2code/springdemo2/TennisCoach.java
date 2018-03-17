package com.luv2code.springdemo2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
	
	
	FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(@Qualifier("practiceActivityFortuneService") FortuneService theFortuneService) {
		
		fortuneService= theFortuneService;
		
		System.out.println("Inside the default constructor for a Tennis Coach");
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Hit 100 balls";
	}

	public FortuneService getFortuneService() {
		return this.fortuneService;
	}
	
	public String giveFortune() {
		return this.fortuneService.giveFortune();
	}
	
	@PostConstruct
	public void examplePostConstructMethod() {
		
		System.out.println("Hello, I am a tennis coach at your service");
	}
	
	@PreDestroy 
	public void examplePreDestroyMethod() {
		
		System.out.println("Good bye, my dear student.  This is where we part");
	}
	
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService= fortuneService;
	}
	
	

}
