package com.luv2code.springdemo;

public interface Coach {
	
	public String getDailyWorkout();
	
	/*Because coaches rely on FortuneTellerService as a dependency, coaches must be able to implement
	 methods characteristic of the dependencies methods*/
	public String tellFortune();

}
