package com.luv2code.springdemo;

public class RandomFortuneService implements FortuneTellerService{
	
	public String tellFortune() {
		
		String[] arrayOfFortunes= {"First Fortune", "Second Fortune", "Third Fortune"};
		
		if (Math.random() <.33) {
			
			return arrayOfFortunes[0];
		}
		
		else if (Math.random() >= .33 && Math.random() <=.66) {
			
			return arrayOfFortunes[1];
		}
		
		else {
			
			return arrayOfFortunes[2];
		}
		
		
	}

}
