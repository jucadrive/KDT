package com.study.jpa.bookmanager.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.study.jpa.bookmanager.domain.Member;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;


public interface MemberRepository extends JpaRepository<Member, Long> {
	Set<Member> findByName(String name);
	
	// findBy, getBy, readBy, queryBy, searchBy, streamBy, findMemberBy, findFirst1By, findTop1By
	// 쿼리문의 조건에 어긋나면 해당 구문은 무시됨
	Member findByEmail(String email);
	
	Member getByEmail(String email);
	
	Member readByEmail(String email);
	
	Member queryByEmail(String email);
	
	Member searchByEmail(String eamil);
	
	Member streamByEmail(String email);
	
	Member findMemberByEmail(String email);
	
	List<Member> findFisrt1ByName(String name);
	List<Member> findTop1ByName(String name);
	
	// And, Or 연산자를 활용한 쿼리문
	List<Member> findByEmailAndName(String email, String name);
	
	List<Member> findByEmailOrName(String email, String name);
	
	// after, before를 활용한 쿼리문
	List<Member> findByCreatedAtAfter(LocalDateTime yesterday);
	
	List<Member> findByIdAfter(Long id);
	List<Member> findByIdBefore(Long id);
	
	// greaterThan, lessThan : greaterThan() = 인자보다 큰 값(인자 포함 x), lessThan() = 인자보다 작은 값(인자 포함 x)
	
	List<Member> findByCreatedAtGreaterThan(LocalDateTime yesterday);
	
	// equal이 붙으면 인자 포함
	List<Member> findByCreatedAtGreaterThanEqual(LocalDateTime yesterday);
	
	// between은 양 끝단 범위 포함
	List<Member> findByCreatedAtBetween(LocalDateTime yesterday, LocalDateTime tomorrow);
	
	List<Member> findByIdBetween(Long id1, Long id2);
	
	// isNotNull, isNotEmpty
	List<Member> findByIdIsNotNull();
	
//	List<Member> findByAddressIsNotEmpty();
	
	// In, Not IN
	List<Member> findByNameIn(List<String> names);
	
	// startingWith, endingWith, contains, like
	List<Member> findByNameStartingWith(String name);
	List<Member> findByNameEndingWith(String name);
	List<Member> findByNameContains(String name);
	List<Member> findByNameLike(String name);
	
	// is : 특별한 역할은 없음. 가독성 향상을 위해 제공
	Set<Member> findMemberByNameIs(String name);
	Set<Member> findMemberByName(String name);
	Set<Member> findMemberByNameEquals(String name);
	
	List<Member> findTop1ByNameOrderByIdDesc(String name);	// 아이디 기준 역순으로 제일 위의 이름을 가지고 온다.
	
	List<Member> findFirstByNameOrderByIdDesc(String name);
	
	List<Member> findFirstByNameOrderByIdDescEmailAsc(String name);	// 아이디의 역순, 이메일의 정순으로 name을 가져온다.
	
	// sort
	List<Member> findFirstByName(String name, Sort sort);
	
	// paging
	Page<Member> findByname(String name, Pageable pageable);
	
	@Query(value = "select * from member limit 1;", nativeQuery = true)
	Map<String, Object> findRawRecord();
}
