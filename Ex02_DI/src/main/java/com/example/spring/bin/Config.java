package com.example.spring.bin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Member member1() {
		
		Member member1 = new Member();
		
		member1.setName("한민욱");
		member1.setNickname("도사");
		member1.setPrinter(new PrintA());
		
		return member1;
		
	}
	
	@Bean(name = "hello")
	public Member member2() {

		return new Member("홍길동","장군",new PrintA());
		
	}
	
}
