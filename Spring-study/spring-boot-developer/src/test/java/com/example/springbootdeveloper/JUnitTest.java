package com.example.springbootdeveloper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {

	@DisplayName("1 + 2는 3이다")
	@Test
	public void junitTest() {
		int a = 1;
		int b = 2;
		int sum = 3;
		Assertions.assertEquals(a + b, sum);
	}
	// 두 값이 동일한지를 비교하는 JUnit의 단언문이다.
	// JUnit으로 작성된 테스트는 기본적으로 콘솔에 출력되지 않는다.
}
