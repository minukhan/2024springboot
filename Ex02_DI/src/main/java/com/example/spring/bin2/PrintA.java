package com.example.spring.bin2;

import org.springframework.stereotype.Component;

@Component("PrintA")
public class PrintA implements Printer{


	@Override
	public void print(String message) {
		System.out.println("Printer A : " + message);
	}

}
