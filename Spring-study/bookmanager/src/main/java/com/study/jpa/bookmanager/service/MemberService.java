package com.study.jpa.bookmanager.service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.jpa.bookmanager.domain.Member;
import com.study.jpa.bookmanager.repository.MemberRepository;

@Service
public class MemberService {
	@Autowired
	private EntityManager entityManager;
	@Autowired
	private MemberRepository memberRepository;

	@Transactional
	public void put() {	// 비영속 상태, 메서드 호출이 종료되고 나면 영속화 되지 않고 가비지 컬렉터에 의해 사라짐.
		Member member = new Member();
		member.setName("newMember");
		member.setEmail("newMember@naver.com");
		
//		memberRepository.save(member);	repository의 save 메서드를 사용하면 영속성 객체가 된다. 내부적으로 entity manager가 있어서.
		
		entityManager.persist(member); // 영속화, 영속성 컨텍스트에서 관리하게 된다. 
		// setter를 통해서 객체의 정보가 변경되면 transaction이 종료되는 시점에 save()를 호출하지 않아도 db에 반영된다.
		
		// 준영속 상태, detached 상태
		entityManager.detach(member);	// 더 이상 영속성 컨텍스트에서 관리하지 않게 된다.
		
		member.setName("newMemberAfterPersist");
		entityManager.merge(member);
		entityManager.flush();
		entityManager.clear();
		
		Member member2 = memberRepository.findById(1L).get();
		entityManager.remove(member2);	// id 1에 대한 데이터 삭제.
		
		member2.setName("joooooo");	// 삭제된 인스턴스에 대해 merge할 수 없다.
		entityManager.merge(member2);
		
	}
	// 엔티티 생명주기. 비영속, 준영속, 영속, 삭제
	// 영속성 컨텍스트의 관리 하에 더티 체크, 쓰기 지연, 조회에 대한 1차 캐시 제공. 개발자에 대한 편의성 제공
	// 편의성으로 인해 예기치 않은 동작을 하는 경우도 있음
	
	
}
