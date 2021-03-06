package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	FortuneTellerService fortuneTellerService;
	
	public TrackCoach(FortuneTellerService fortuneTellerService) {
		
		this.fortuneTellerService=fortuneTellerService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String tellFortune() {
		return "Just do it " + this.fortuneTellerService.tellFortune();
	}
	
	public void doMyStartupStuff() {
		
		System.out.print("Track coach: inside method doStartupStuff");
	}
	
	public void doMyDestroyStuff() {
		
		System.out.println("Track coach: inside destroy stuff method");
	}

}
