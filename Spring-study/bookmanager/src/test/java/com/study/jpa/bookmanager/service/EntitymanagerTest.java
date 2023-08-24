package com.study.jpa.bookmanager.service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.study.jpa.bookmanager.domain.Member;
import com.study.jpa.bookmanager.repository.MemberRepository;

@SpringBootTest
@Transactional	// 1차 캐시를 이용할 수 있다.쿼리문을 각각 실행이 아닌 한 번에 실행하게 해줌(아이디 값 이용)
public class EntitymanagerTest {

	@Autowired
	private EntityManager entityManager;
	
	@Autowired
	MemberRepository memberRepository;
	
	@Test
	void entityManagerTest() {
		System.out.println(entityManager.createQuery("select m from Member m").getResultList());
	}
	
	@Test
	void cacheFindTest() {
		System.out.println(memberRepository.findById(1L).get());
		System.out.println(memberRepository.findById(1L).get());
		System.out.println(memberRepository.findById(1L).get());
	}
	
	@Test
	void cacheFindTest2() {
		Member member = memberRepository.findById(1L).get();
		member.setName("joooooo");
		
		memberRepository.save(member);
		
		System.out.println("-------------------");
		
		member.setEmail("joooooooooooo@naver.com");
		
		memberRepository.save(member);
		
		System.out.println(memberRepository.findAll());
		
//		memberRepository.flush();
		
		
//		System.out.println(">>> 1 : " + memberRepository.findById(1L).get());
//		
//		memberRepository.flush();
//		
//		System.out.println(">>> 2 : " + memberRepository.findById(1L).get());
		
		// 클래스 상단에 @Transactional이 있으면 위 테스트 코드 실행 시 update는 한 번만 일어남
		// entity cache에서 merge 하고 flush()를 통해 db에 반영하는데 update는 한 번만 일어난다.
		// 클래스 상단에 @Transactional이 없으면 update는 save()의 개수만큼 발생한다.
		// save()에 이미 @Transactional이 있기 때문에 각각 하나의 transaction이 된다.
		// flush()
		// 영속성 캐시에 쌓여서 아직 반영되지 않은 entity 변경 사항을 해당 메서드 실행 시점에 db에 반영하는 역할을 한다.
		// 자주 사용하는 것은 지양하고, 개발자가 원하는 타이밍에 db에 변경사항을 적용할 수 있다.
	}
}

// 영속성 캐시가 flush 되어서 db에 반영되는 것은
// 1. 명시적으로 flush()를 호출하는 시점
// 2. 트랜잭션이 끝나서 해당 쿼리가 커밋되는 시점
// 3. jpql 쿼리가 실행되는 시점

// 영속성 캐시, 영속성 컨텍스트, flush(), 쓰기 지연
