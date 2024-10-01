package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.spring.bin.Config;
import com.example.spring.bin.Member;

@SpringBootApplication
public class Ex02DiApplication {

	public static void main(String[] args) {
		// IOC 컨테이너를 생성하는 함수임. 
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		// getBean 을 이용하여 Bean이라고 등록해놨던 함수를 가져오는 것 이다.
		Member member1 = (Member) context.getBean("member1");
		member1.print();
		// @Bean(name = "hello") 이런식으로 어노테이션을 사용했다면 이름을 이렇게 사용할 수 있음. 
		// member1 과 member2 위 아래 코드는 같은거임.
		Member member2 = (Member) context.getBean("hello",Member.class);
		member2.print();
		
	}

}
