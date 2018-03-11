package com.luv2code.springdemo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
	
	FortuneService fortuneService;
	
	@Autowired
	public TrackCoach(FortuneService fortuneService) {
		
		this.fortuneService= fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5 miles";
	}
	
	public FortuneService getFortuneService() {
		return this.fortuneService;
	}
	
	public String giveFortune() {
		return this.fortuneService.giveFortune();
	}

}
