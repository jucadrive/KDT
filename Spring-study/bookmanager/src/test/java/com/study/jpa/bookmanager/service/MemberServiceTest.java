package com.study.jpa.bookmanager.service;


import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.study.jpa.bookmanager.domain.Member;
import com.study.jpa.bookmanager.repository.MemberRepository;

@SpringBootTest
public class MemberServiceTest {

	@Autowired
	private MemberService memberService;
	
	@Autowired
	private MemberRepository memberRepository;
	
	@Test
	void test() {
		memberService.put();
		
//		System.out.println(">>> " + memberRepository.findByEmail("newMember@naver.com"));
		memberRepository.findAll().forEach(System.out::println);
	}
}
