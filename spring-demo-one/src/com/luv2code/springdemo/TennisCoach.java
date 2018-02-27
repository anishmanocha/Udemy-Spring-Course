package com.luv2code.springdemo;

public class TennisCoach implements Coach{
	
	FortuneTellerService fortuneTellerService;
	
	String name;
	
	String emailAddress;
	
	public TennisCoach() {
		
		
	}
	
	public void setName(String name) {
		
		this.name=name;
	}
	
	public void setEmailAddress(String emailAddress) {
		
		System.out.println("The email has been injected");
		
		this.emailAddress= emailAddress;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public String getEmailAddress() {
		
		return this.emailAddress;
	}
	
	
	public String getDailyWorkout() {
		
		return "Practice your serve 100 times";
	}
	
	public void setFortuneTellerService(FortuneTellerService fortuneTellerService) {
		
		System.out.println("Inside setter method");
		
		this.fortuneTellerService= fortuneTellerService;
	}

	@Override
	public String tellFortune() {
		return "You will love tennis: " + this.fortuneTellerService.tellFortune();
	}

}
