package com.example.spring.tv3;

public class Lgtv implements Tv{
	
	public Lgtv() {
		System.out.println("==========> LG TV");

	}
	public void turnOn() {
		System.out.println("LG 전원킨다");
	}
	public void turnOff() {
		System.out.println("LG 전원끈다");
	}
	public void soundUp() {
		System.out.println("LG 소리킨다");
	}
	public void soundDown() {
		System.out.println("LG 소리끈다 ");
	}
	
}
