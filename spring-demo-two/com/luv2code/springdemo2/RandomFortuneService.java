package com.luv2code.springdemo2;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String giveFortune() {
		int randomNumber= (int) (Math.random() *3);
		
		if(randomNumber <1) {
			return "You are going to have a great day";
		}
		
		else if (randomNumber >= 1) {
			
			return "You are going to meet a lovely soul mate today";
		}
		
		else {
			
			return "You will make a lot of money of day";
		}
		

	}

}
