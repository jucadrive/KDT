package com.example.springbootdeveloper;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitCycleTest {
	
	@BeforeAll
	static void beforeAll() {	// 모든 테스트가 실행되기 이전에 딱 한 번 호출
		System.out.println("@BeforeAll");
	}

	@BeforeEach
	public void beforeEach() {	// 각 테스트 메서드가 실행되기 전에 호출되는
		System.out.println("@BeforEach");
	}
	
	@Test
	public void test1() {	// 실제 테스트 메서드
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}
	
	@Test
	public void test3() {
		System.out.println("test3");
	}
	
	@AfterAll
	static void afterAll() {	// 모든 테스트가 실행된 이후에 딱 한 번 호출되는
		System.out.println("@AfterAll");
	}
	
	@AfterEach
	public void afterEach() {	// 각 테스트 메서드가 실행된 후 호출되는
		System.out.println("@AfterEach");
	}
	
}
