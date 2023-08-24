package com.example.springbootdeveloper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{

}

// DB에서 데이터를 가져오는 퍼시스턴스 계층 역할을 하게 된다.
// 기본적인 CRUD(Create, Read, Update, Delete) 작업을 지원하는 인터페이스이다.
// save() : 엔티티를 저장하거나 수정한다.
// findById() : 주어진 ID로 엔티티를 찾는다.
// findAll() : 모든 엔티티를 조회한다.
// deleteById() : 주어진 ID로 엔티티를 삭제한다.

// 컨트롤로 프리젠테이션 계층 HTTP 요청을 받아 비즈니스 계층으로 전송
// 서비스 비즈니스 계층 비즈니스 로직을 처리(통상적인 앱 기능)
// 리포지토리 퍼시스턴스 계층 < - > 데이터 베이스
// 리포지토리 : 퍼시스턴스 계층을 실제 구현한 것

// main
// 실제 코드를 작성하는 공간

// test
// 프로젝트 테스트 코드를 작성하는 공간

// build.gradle
// 빌드 설정 파일
// settings.gradle
// 빌드할 프로젝트의 정보 설정 파일

// 스프링과 스프링부트의 차이점
// 스프링은 개발에 필요한 환경을 수동 구성, 스프링 부트는 자동 구성
// 내장 WAS의 유무 : 스프링 부트는 처음부터 WAS를 가지고 있다.(tomcat)

// 스프링 컨테이너
// 스프링 안에서 동작하는 빈 생성 및 관리 주체

// 빈
// 스프링 컨테이너가 생성하고 관리하는 객체

/*
 * @RestController : 클래스가 라우터 역할을 할 수 있게 해주는 어노테이션
 * @GetMapping : /test GET 요청을 처리
 * @RestController의 근본은 @Component 어노테이션
 * @Component 어노테이션은 Spring 프레임워크에서 Bean으로 등록할 클래스를 표시하는데 사용된다.
 * @Component 어노테이션은 @Repository, @Service, @Controller 등의
 * 다른 스프링 어노테이션들도 내부적으로 포함하고 있다.
 */

// JUnit은 자바 언어를 위한 테스트 프레임워크로서, 자동화된 단위 테스트를 작성
// AssertJ 검증 라이브러리
// Mockito 테스트에 사용할 가짜 객체인 목 객체를 쉽게 만들고 검증할 수 있는 프레임워크
 