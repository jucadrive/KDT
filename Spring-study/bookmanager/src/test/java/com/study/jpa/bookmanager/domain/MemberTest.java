package com.study.jpa.bookmanager.domain;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

public class MemberTest {

	@Test
	void test() {
		Member member = new Member();
		member.setEmail("dhzlehzl01");
		member.setName("joo");
		member.setCreatedAt(LocalDateTime.now());
		member.setUpdatedAt(LocalDateTime.now());

//        User user1 = new User(null, "martin", "martin@fastcampus.com", LocalDateTime.now(), LocalDateTime.now());
		Member member2 = new Member("juca", "juca01");

		Member member3 = Member.builder()
            .name("maria")
            .email("maria01")
            .build();

        System.out.println(">>> " + member.toString());
	}
}
