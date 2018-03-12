package com.luv2code.springdemo2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PracticeActivityFortuneService implements FortuneService {
	
	@Value("${foo.fortunes}")
	private String[] listOfFortunes;

	@Override
	public String giveFortune() {
		int randomNumber= (int) (Math.random() *3);
		
		if(randomNumber <1) {
			return listOfFortunes[0];
		}
		
		else if (randomNumber >= 1) {
			
			return listOfFortunes[1];
		}
		
		else {
			
			return listOfFortunes[0];
		}
	}

}
