package com.example.spring.tv3;

public class SonyTv implements Tv {

	@Override
	public void turnOn() {
		System.out.println("Sony 전원키기");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Sony 전원끄기");
		
	}

	@Override
	public void soundUp() {
		System.out.println("Sony 소리키기");
		
	}

	@Override
	public void soundDown() {
		System.out.println("Sony 소리내리기");
		
	}
	
	
	
}
