package com.example.jdbctemplate.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MyUserDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<MyUserDTO> list() {
		
		String query = "select * from myuser";
		List<MyUserDTO> list = jdbcTemplate.query(	// SQL 쿼리를 실행하고 결과를 가져오는 기능
				query, new BeanPropertyRowMapper<>(MyUserDTO.class));
		
		// 실행할 SQL 쿼리 문자열이며, 두 번째 매개변수는 결과를 매핑할 RowMapper 객체이다.
		// MyUserDTO.class는 매핑할 대상 객체의 클래스를 나타낸다.
		// query() 메서드는 SQL 쿼리를 실행하고 결과를 가져와서 List<MyUserDTO> 형태로 반환
		// 각 행은 MyUserDTO 클래스의 객체로 변환되어 리스트에 저장된다.
		// <>는 제네릭의 타입 파라미터를 나타낸다.
		// <> 안에 타입 파리미터를 생략할 경우, 컴파일러가 해당 파라미터의 타입을 추론한다.
		// 컴파일러가 자동으로 MyUserDTO 타입을 추론하여 사용한다.
		
		// for(UserDTO my : list) {
		// System.out.println(my);
		// }
		
		return list;
	}
	
}
