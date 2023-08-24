package com.study.springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.study.springboot.bean.Member;
import com.study.springboot.bean.Printer;
import com.study.springboot.bean.Config;

public class JavaCodeDIApplication {

	public static void main(String[] args) {
		// SpringApplication.run(JavaCodeDIApplication.class, args)
		
		// 1. IoC 컨테이너 생성
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		// 2. Member Bean 가져오기
		Member member1 = (Member) context.getBean("member1");
		member1.print();
		
		// 3. Member Bean 가져오기
		Member member2 = context.getBean("hello", Member.class);
		member2.print();
		
		// 4. PrinterB Bean 가져오기
		Printer printer = context.getBean("printerB", Printer.class);
		member1.setPrinter(printer);
		member1.print();
		
		
		// 5. 싱글톤인지 확인
		if(member1 == member2) {
			System.out.println("동일한 객체입니다.");
		} else {
			System.out.println("서로 다른 객체입니다.");
		}
	}

}

/*
 * @SpringBootApplication
 * @SpringBootApplication 어노테이션은
 * @Configuration
 * @EnableAutoConfiguration
 * @ComponentScan 세 가지 어노테이션을 합친 것으로 볼 수 있다.
 * @Configuration : 현재 클래스가 스프링의 설정 파일임을 나타낸다
 * @EnableAutoConfiguration : 스프링 부트의 자동 설정 기능을 활성화한다.
 * @ComponentScan : 이 어노테이션이 위치한 패키지와 그 하위 패키지에서
 * @Component, @Service, @Repository, @Controller 등이 붙은 클래스를 찾아서
 *  스프링 어플리케이션 컨텍스트에 빈으로 등록한다.*/
