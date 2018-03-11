package com.luv2code.springdemo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
	
	
	FortuneService fortuneService;
	
	
	/*Remember at the beginning of run time, Spring creates a TennisCoach object in the background, which is 
	why sysoute gets called, managing FortuneService dependencies via setter injection*/
	public TennisCoach() {
		
		System.out.println("Inside the default constructor for a Tennis Coach");
	}
	
	/*@Autowired
	public TennisCoach(FortuneService fortuneService) {
		
		this.fortuneService=fortuneService;
	}*/
	
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
	
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService= fortuneService;
	}
	
	

}
