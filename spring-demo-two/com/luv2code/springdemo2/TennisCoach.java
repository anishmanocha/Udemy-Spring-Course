package com.luv2code.springdemo2;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
	
	@Override
	public String getDailyWorkout() {
		return "Hit 100 balls";
	}

}
