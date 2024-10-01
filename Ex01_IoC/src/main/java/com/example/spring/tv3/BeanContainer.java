package com.example.spring.tv3;

public class BeanContainer {
	public Object getBean(String id) {
		
		if(id.equals("lg")) {
			return new Lgtv();
		}
		else if(id.equals("samsung")) {
			return new Samsungtv();
		}
		else if(id.equals("SonyTv")) {
			return new SonyTv();
		}
		return null;
	}
}
