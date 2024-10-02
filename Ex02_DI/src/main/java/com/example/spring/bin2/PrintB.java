package com.example.spring.bin2;

import org.springframework.stereotype.Component;

@Component("PrintB")
public class PrintB implements Printer{
	

	@Override
	public void print(String message) {
		System.out.println("Printer B : " + message);
	}

}
