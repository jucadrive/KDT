package com.study.springboot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Member {

	@Value("홍길동")
	private String name;
	
	@Value("도사")
	private String nickname;
	
	@Autowired // 해당 타입의 빈이 자동으로 주입된다.
	@Qualifier("printerA")// 같은 타입의 여러 빈 중에서 특정 빈을 선택하여 주입하고 싶을 때 사용한다. 여러 클래스 중에서 printerA라는 이름의 빈이 printer 필드에 주입된다.
	private Printer printer;
	
	public Member() {}
	
	public Member(String name, String nickname, Printer printer) {
		this.name = name;
		this.nickname = nickname;
		this.printer = printer;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Printer getPrinter() {
		return printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	public void print() {
		printer.print("Hello " + name + " : " + nickname);
	}
}
