package com.luv2code.springdemo;

public class TennisCoach implements Coach{
	
	FortuneTellerService fortuneTellerService;
	
	public TennisCoach(FortuneTellerService fortuneTellerService) {
		
		this.fortuneTellerService= fortuneTellerService;
	}
	
	public String getDailyWorkout() {
		
		return "Practice your serve 100 times";
	}

	@Override
	public String tellFortune() {
		return this.fortuneTellerService.tellFortune();
	}

}
