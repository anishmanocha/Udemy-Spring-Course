package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	public FortuneTellerService fortuneTellerService;
	
	public BaseballCoach(FortuneTellerService fortuneTellerService) {
		
		this.fortuneTellerService= fortuneTellerService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String tellFortune() {
		return this.fortuneTellerService.tellFortune();
	}
	

}
