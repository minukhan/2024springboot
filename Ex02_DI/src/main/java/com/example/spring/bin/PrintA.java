package com.example.spring.bin;


public class PrintA implements Printer{
	
	static public void main() {
		
	}

	@Override
	public void print(String message) {
		System.out.println("Printer A : " + message);
	}

}
