package com.luv2code.springdemo2;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PracticeActivityFortuneService implements FortuneService {
	
	@Value("${foo.fortunes}")
	private String[] listOfFortunes;
	
	public PracticeActivityFortuneService() {
		
		System.out.println("Creating the bean for a PracticeActivityFortuneService");
	}

	@Override
	public String giveFortune() {
		int randomNumber= (int) (Math.random() *2);
		
		if(randomNumber <1) {
			return listOfFortunes[0];
		}
		
		else if (randomNumber >= 1) {
			
			return listOfFortunes[0];
		}
		
		else {
			
			return listOfFortunes[0];
		}
	}
	
	@PostConstruct
	public void readFortunes() {
		
		for (int i=0; i<listOfFortunes.length; i++) {
			
			System.out.println("The fortunes are " + listOfFortunes[i]);
		}
	}

}
