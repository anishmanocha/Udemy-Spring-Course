package com.luv2code.springdemo2;

public class SadFortuneService implements FortuneService {

	@Override
	public String giveFortune() {
		return "Today is a sad day";
	}

}
