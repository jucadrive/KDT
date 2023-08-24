package com.example.springbootdeveloper;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {	// 컨트롤러(Controller)에서 호출하여 사용된다.
	
	@Autowired
	MemberRepository memberRepository;
	
	public void test() {
		memberRepository.save(new Member(1L, "A"));
		
		// 회원 객체를 생성하여 데이터베이스에 저장한다.
		Optional<Member> member = memberRepository.findById(1L);
		// 아이디가 1L인 회원을 조회한다.
		List<Member> allMembers = memberRepository.findAll();
		// 저장된 모든 회원을 조회하여 리스트로 반환한다.
		memberRepository.deleteById(1L);
		// 아이디가 1L인 회원을 데이터베이스에서 삭제한다.
	}	// test() 메서드는 JUnit 테스트를 위해 작성된 것이다.
		// given - when - then 패턴을 사용한다.
		// 테스트 실행을 준비하는 given
		// 테스트를 진행하는 when
		// 테스트 결과를 검증하는 then
}
