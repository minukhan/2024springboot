package com.example.spring.bin2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@Autowired
	Member member1;
	
	@Autowired
	Member member2;
	
	@Autowired
	@Qualifier("PrintB")
	Printer printer;
	
	@RequestMapping("/")
	public @ResponseBody String root() {
		member1.print();
		member1.setPrinter(printer);
		member1.setName("한민욱");
		member1.setNickname("학생");
		member1.print();
		
		return "annotation";
	}
	
}
