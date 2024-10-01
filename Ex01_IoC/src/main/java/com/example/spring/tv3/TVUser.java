package com.example.spring.tv3;

public class TVUser {

	public static void main(String[] args) {
		Lgtv tv = new Lgtv();
		Samsungtv Samtv = new Samsungtv();
		
		tv.turnOn();
		tv.turnOff();
		tv.soundUp();
		tv.soundDown();
		Samtv.turnOn();
		Samtv.turnOff();
		Samtv.soundUp();
		Samtv.soundDown();
		
	}

}
