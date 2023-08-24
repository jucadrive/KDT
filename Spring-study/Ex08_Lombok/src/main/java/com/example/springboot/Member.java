package com.example.springboot;

import lombok.Data;

@Data
public class Member {

	private String id;
	private String name;
}

// @Data는 Lombok 라이브러리에서 제공하는 어노테이션이다.
// Lombok이 자동으로 Getter, Setter, toString(), hashCode() 메서드를 추가 및 오버라이딩 해준다.
// @Data 어노테이션을 사용하면, 클래스의 필드에 대한 Getter와 Setter 메서드를
// 작성할 필요없이 자동으로 생성된다.
// toString() 메서드를 사용하여 객체를 문자열로 표현하거나
// equals() 및 hashCode() 메서드를 사용하여 객체의 동등성을 비교할 수 있다.
