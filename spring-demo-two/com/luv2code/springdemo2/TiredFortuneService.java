package com.luv2code.springdemo2;

public class TiredFortuneService implements FortuneService {

	@Override
	public String giveFortune() {
		return "I'm too tired to give a fortune right now";
	}

}
