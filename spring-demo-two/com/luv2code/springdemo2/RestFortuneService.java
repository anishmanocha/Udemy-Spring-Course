package com.luv2code.springdemo2;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {

	@Override
	public String giveFortune() {
		
		return "We are inside of the REST fortune service";
	}

}
