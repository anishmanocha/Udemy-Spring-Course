package com.luv2code.springdemo2;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	
	@Override
	public String giveFortune() {
		
		return "You are very very lucky";
	}

}
