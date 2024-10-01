package com.example.spring.tv3;

public class Samsungtv implements Tv{
	
	public Samsungtv() {
		System.out.println("==========> Samsung TV");

	}
	public void turnOn() {
		System.out.println("Samtv 전원킨다");
	}
	public void turnOff() {
		System.out.println("Samtv 전원끈다");
	}
	public void soundUp() {
		System.out.println("Samtv 소리킨다");
	}
	public void soundDown() {
		System.out.println("Samtv 소리끈다 ");
	}
	
}
