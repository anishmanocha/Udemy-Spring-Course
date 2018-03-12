package com.luv2code.springdemo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
	
	@Autowired
	@Qualifier("randomFortuneService")
	FortuneService fortuneService;
	
	public TennisCoach() {
		
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
	
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService= fortuneService;
	}
	
	

}
