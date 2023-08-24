package com.study.springboot.bean;

import org.springframework.stereotype.Component;

@Component("printerA")
// 해당 클래스의 인스턴스는 "printerA"라는 이름으로 빈으로 등록
// 의존성 주입을 받을 수 있다.
public class PrinterA implements Printer {

	@Override
	public void print(String message) {
		System.out.println("Printer A : " + message);
	}
	
	
	
	
}
