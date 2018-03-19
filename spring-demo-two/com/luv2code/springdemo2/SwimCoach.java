package com.luv2code.springdemo2;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		
		this.fortuneService=fortuneService;
		
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm up";
	}

	@Override
	public String giveFortune() {
		return this.fortuneService.giveFortune();
	}

}
