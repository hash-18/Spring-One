package com.spring.core;


public class CricketCoach implements Coach {

	FortuneService fortuneService;
	
	//Constructor Injection
	public CricketCoach(FortuneService fortuneService) {
		System.out.println("Constructor injection");
		this.fortuneService = fortuneService;
	}

	public void getTraining() {
		System.out.println("Practice Batting");
	}

	public void getFortune() {
		fortuneService.getFortune();
		
		
	}

	public CricketCoach() {
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Setter Injection");
		this.fortuneService = fortuneService;
	}

}
