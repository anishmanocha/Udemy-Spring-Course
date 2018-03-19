package com.luv2code.springdemo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	@Bean
	public Coach swimCoach() {
		
		SwimCoach swimCoach= new SwimCoach(sadFortuneService());
		return swimCoach;
	}
	
	@Bean
	public SadFortuneService sadFortuneService() {
		
		return new SadFortuneService();
	}
	
	@Bean
	public Coach basketballCoach() {
		
		return new BasketballCoach(tiredFortuneService());
	}
	
	@Bean 
	public FortuneService tiredFortuneService() {
		
		return new TiredFortuneService();
	}

}
