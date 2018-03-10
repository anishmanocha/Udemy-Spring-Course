package com.luv2code.springdemo2;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Run 5 miles";
	}

}
