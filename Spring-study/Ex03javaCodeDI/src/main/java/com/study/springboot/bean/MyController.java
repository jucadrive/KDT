package com.study.springboot.bean;

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
	@Qualifier("printerB")
	Printer printer;
	@Autowired
	Member member2;
	
	// member1과 member2 필드에는 Member 타입의 빈이 주입되고
	// printer 필드에는 printerB라는 이름의 Printer 타입의 빈이 주입된다.
	
	@RequestMapping("/")
	public @ResponseBody String root() {
		// root() 메서드는 메서드의 반환값이 HTTP 응답 본문에 직접 쓰여지게 됨을 의미한다.
		// 1. Member Bean 가져오기
		member1.print();
		// 2. PrinterB Bean 가져오기
		member1.setPrinter(printer);
		member1.print();
		
		// 3. 싱글톤인지 확인
		if(member1 == member2) {
			System.out.println("동일한 객체이다.");
		} else {
			System.out.println("서로 다른 객체이다.");
		}
		return "Annotation 사용하기";
	}
}
