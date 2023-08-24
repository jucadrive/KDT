package com.example.springbootdeveloper;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false)
	private Long id;
	
	@Column(name = "name", nullable = false)
	private String name;
}

// @Getter 어노테이션은 클래스의 필드에 대한 getter 메서드를 자동으로 생성한다.
// @GeneratedValue : JPA에서 엔티티의 주키를 자동으로 생성할 때 사용
// strategy 속성을 통해 주키 생성 전략을 지정
// GenerationType.IDENTITY 전략은 데이터베이스에서 자동으로 주키를 생성하도록 하는 전략