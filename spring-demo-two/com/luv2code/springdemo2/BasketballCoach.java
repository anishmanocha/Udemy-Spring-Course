package com.luv2code.springdemo2;

public class BasketballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BasketballCoach(FortuneService fortuneService) {
		
		this.fortuneService= fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Make 100 shots";
	}

	@Override
	public String giveFortune() {
		return fortuneService.giveFortune();
	}

}
