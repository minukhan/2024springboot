package com.example.spring.tv3;

public class TVUser {

	public static void main(String[] args) {
//		Lgtv tv = new Lgtv();
//		Samsungtv Samtv = new Samsungtv();
		
		BeanContainer container = new BeanContainer();
		
		Tv tv = (Tv) container.getBean("SonyTv");
		
		
		
		tv.turnOn();
		tv.turnOff();
		tv.soundUp();
		tv.soundDown();

		
	}

}
