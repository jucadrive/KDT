package com.study.jpa.bookmanager.repository;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;

import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;

import com.study.jpa.bookmanager.domain.Gender;
import com.study.jpa.bookmanager.domain.Member;

@SpringBootTest
@Transactional
public class MemberRepositoryTest {

	@Autowired
	private MemberRepository memberRepository;
	
	@Autowired
	private MemberHistoryRepository memberHistoryRepository;
	
	@Test
	void crudTest() {

		// findAll(), Sort()
//		List<Member> members = memberRepository.findAll(Sort.by(Direction.DESC, "name"));
//		members.forEach(System.out::println);
//		
		// findById
//		List<Member> members2 = memberRepository.findAllById(Lists.newArrayList(1L, 3L, 5L));
//		members2.forEach(System.out::println);
		
		// saveAll()
//		Member member1 = new Member("jack", "jack01");
//		Member member2 = new Member("leon", "leon01");
//		
//		memberRepository.saveAll(Lists.newArrayList(member1, member2));
//		
		// findAll()
//		List<Member> members = memberRepository.findAll();
//		members.forEach(System.out::println);
		
		
//		Member member = memberRepository.findById(1L).orElse(null);
//		
//		System.out.println(member);
		
		// save(), flush()
//		memberRepository.saveAndFlush(new Member("new joo", "newdhzlehzl01"));
		//memberRepository.flush();
//		memberRepository.findAll().forEach(System.out::println);
		
		// count()
//		long count = memberRepository.count();
//		System.out.println(count);
		
		// existsById()
//		boolean exists = memberRepository.existsById(1L);
//		System.out.println(exists);
		
		// delete()
//		memberRepository.delete(memberRepository.findById(1L).orElseThrow(RuntimeException::new));
		
//		// deleteById()
//		memberRepository.deleteById(1L);
//		memberRepository.findAll().forEach(System.out::println);
		
		// deleteAll()
//		memberRepository.deleteAll();
//		memberRepository.findAll().forEach(System.out::println);
		
		// deleteAll(), findAllById()
//		memberRepository.deleteAll(memberRepository.findAllById(Lists.newArrayList(1L, 3L)));
//		memberRepository.findAll().forEach(System.out::println);
		
		// deleteInBatch()
//		memberRepository.deleteInBatch(memberRepository.findAllById(Lists.newArrayList(1L, 3L)));
//		memberRepository.findAll().forEach(System.out::println);
		
		// PageRequest()
//		Page<Member> members = memberRepository.findAll(PageRequest.of(0, 3));
//		
//		System.out.println("page : " + members);
//		System.out.println("totalElements : " + members.getTotalElements());
//		System.out.println("totalPages : " + members.getTotalPages());
//		System.out.println("numberOfElements : " + members.getNumberOfElements());
//		System.out.println("sort : " + members.getSort());
//		System.out.println("size : " + members.getSize());
//		
//		members.getContent().forEach(System.out::println);
		
//		ExampleMatcher matcher = ExampleMatcher.matching()
//									.withIgnorePaths("name")	// name 컬럼 무시
//									.withMatcher("email", endsWith());	// 이메일이 naver.com으로 끝나는 데이터 조회
//		Example<Member> example = Example.of(new Member("john", "naver.com"), matcher);
//		
//		memberRepository.findAll(example).forEach(System.out::println);
		
	}
	
	@Test
	void select() {
		System.out.println(memberRepository.findByName("joo"));
		
		// findBy, getBy, readBy, queryBy, searchBy, streamBy, findMemberBy, findFirst1By, findTop1By
		// 쿼리문의 조건에 어긋나면 해당 구문은 무시됨
//		System.out.println("findByEmail : " + memberRepository.findByEmail("joo01@naver.com"));
//		System.out.println("getByEmail : " + memberRepository.getByEmail("joo01@naver.com"));
//		System.out.println("readByEmail : " + memberRepository.readByEmail("joo01@naver.com"));
//		System.out.println("queryByEmail : " + memberRepository.queryByEmail("joo01@naver.com"));
//		System.out.println("searchByEmail : " + memberRepository.searchByEmail("joo01@naver.com"));
//		System.out.println("streamByEmail : " + memberRepository.streamByEmail("joo01@naver.com"));
//		System.out.println("findMemberByEmail : " + memberRepository.findMemberByEmail("joo01@naver.com"));
//		
//		System.out.println("findTop1ByName : " + memberRepository.findTop1ByName("joo"));
//		System.out.println("findFirst1ByName : " + memberRepository.findFisrt1ByName("joo"));
		
		// And, Or 연산자를 활용한 쿼리문
//		System.out.println("findByEmailAndName : " + memberRepository.findByEmailAndName("joo01@naver.com", "jooo"));
//		System.out.println("findByEmailOrName : " + memberRepository.findByEmailOrName("joo03@naver.com", "jason"));
		
		// after, before를 활용한 쿼리문 : after의 경우 인자보다 큰 경우를 조회함. before의 경우 인자보다 작은 경우를 조회함
//		System.out.println("findByCreatedAtAfter : " + memberRepository.findByCreatedAtAfter(LocalDateTime.now().minusDays(1L)));
//		
//		System.out.println("findByIdAfter : " + memberRepository.findByIdAfter(4L));
//		System.out.println("findByIdBefore : " + memberRepository.findByIdBefore(4L));
		
		// greaterThan, lessThan : after, before와 동일한 쿼리문. greaterThan, lessThan이 더 범용적이다.
//		System.out.println("findByCreatedAtGreaterThan : " + 
//				memberRepository.findByCreatedAtGreaterThan(LocalDateTime.now().minusDays(1L)));
		
//		System.out.println("findByCreatedAtGreaterThanEqual : " + 	// Equal이 붙으면 >=, <=, 없으면 >, <
//				memberRepository.findByCreatedAtGreaterThanEqual(LocalDateTime.now().minusDays(1L)));
//		
//		System.out.println("findByCreatedAtBetween : " + 	// between 쿼리문은 양 끝단의 값을 포함하고 있다
//				memberRepository.findByCreatedAtBetween
//				(LocalDateTime.now().minusDays(1L), LocalDateTime.now().plusDays(1L)));
//		
//		System.out.println("findByIdBetween : " + 	// between 쿼리문은 양 끝단의 값을 포함하고 있다
//				memberRepository.findByIdBetween(1L, 3L));
		
		// 빈 값에 대한 조회
		System.out.println("findByIdISNotNull : " + memberRepository.findByIdIsNotNull());
		
		// Not Empty : 문자열이 아닌 컬렉션 프로퍼티에서만 사용할 수 있다
//		System.out.println("findByAddressIsNotEmpty : " + memberRepository.findByAddressIsNotEmpty());
		
		// In, Not In : Or 조건과 유사함.
		System.out.println("findByNameIn : " + memberRepository.findByNameIn(Lists.newArrayList("joo", "momo")));
		
		// startingWith, endingWith, contains, like
		System.out.println("findByNameStartingWith : " + memberRepository.findByNameStartingWith("jo"));
		System.out.println("findByNameEndingWith : " + memberRepository.findByNameEndingWith("oo"));
		System.out.println("findByNameContains : " + memberRepository.findByNameContains("om"));
		
		System.out.println("findByNameLike : " + memberRepository.findByNameLike("%om%"));
		
	}
	
	@Test
	void pagingAndSortingTest() {
		System.out.println("findTop1ByName : " + memberRepository.findTop1ByName("joo"));
		
		// asc : 정순, desc : 역순
		System.out.println("findTop1ByNameOrderByIdDesc : " + memberRepository.findTop1ByNameOrderByIdDesc("joo"));
		System.out.println("findFirstByNameOrderByIdDescEmailAsc" 
				+ memberRepository.findFirstByNameOrderByIdDescEmailAsc("joo"));
		
		// paging and sort
		System.out.println("findFirstByNameWithSortParams : " + 
				memberRepository.findFirstByName("joo", Sort.by(Order.desc("id"), Order.asc("email"))));
		
		System.out.println("findByNameWithPaging : " + memberRepository.findByname
				("joo", PageRequest.of(0, 1, Sort.by(Order.desc("id")))).getContent());
	}
	
	@Test
	void insertAndUpdateTest() {
		Member member = new Member();
		member.setName("joo");
		member.setEmail("joo03@naver.com");
		
		memberRepository.save(member);
		
		Member member2 = memberRepository.findById(1L).orElseThrow(RuntimeException::new);
		member2.setName("joooooo");
		
		memberRepository.save(member2);
	}
	
	@Test
	void enumTest() {
		Member member = memberRepository.findById(1L).orElseThrow(RuntimeException::new);
		member.setGender(Gender.MALE);
		
		memberRepository.save(member);
		
		memberRepository.findAll().forEach(System.out::println);
		
		System.out.println(memberRepository.findRawRecord().get("gender"));
	}
	
	@Test
	void listenerTest() {
		Member member = new Member();
		member.setEmail("joo04@naver.com");
		member.setName("joo");
		
		memberRepository.save(member);	// insert 이벤트 발생
		
		Member member2 = memberRepository.findById(1L).orElseThrow(RuntimeException::new);
		member2.setName("jooooo");
		
		memberRepository.save(member2);	// update 이벤트 발생
		
		memberRepository.deleteById(4L);	// delete 이벤트 발생
	}
	
	@Test
	void prePersistTest() {
		Member member = new Member();
		member.setEmail("juca01@naver.com");
		member.setName("juca");
//		member.setCreatedAt(LocalDateTime.now());	// don't repeat yourself, dry 원칙
//		member.setUpdatedAt(LocalDateTime.now());	// don't repeat yourself, dry 원칙
		
		memberRepository.save(member);
		
		System.out.println(memberRepository.findByEmail("juca01@naver.com"));
	}
	
	@Test
	void preUpdateTest() {
		Member member = memberRepository.findById(1L).orElseThrow(RuntimeException::new);
		
		System.out.println("as-is : " + member);
		
		member.setName("joo22");
		memberRepository.save(member);
		
		System.out.println("to-be : " + memberRepository.findAll().get(0));
	}
	
	@Test
	void memberHistoryTest() {
		Member member = new Member();
		member.setEmail("juca01@naver.com");
		member.setName("juca-new");
		
		memberRepository.save(member);	// insert 이벤트 발생
		
		member.setName("juca-new-new");
		
		memberRepository.save(member);	// update 이벤트 발생
		
		memberHistoryRepository.findAll().forEach(System.out::println);
		
		
	}
	
	
}
