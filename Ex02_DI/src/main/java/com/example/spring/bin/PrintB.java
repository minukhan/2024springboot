package com.example.spring.bin;


public class PrintB implements Printer{
	

	@Override
	public void print(String message) {
		System.out.println("Printer B : " + message);
	}

}
