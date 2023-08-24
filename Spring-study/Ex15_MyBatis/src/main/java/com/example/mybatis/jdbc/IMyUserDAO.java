package com.example.mybatis.jdbc;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IMyUserDAO {
	List<MyUserDTO> list();	// 테이블의 내용을 select 하기 위한 메서드를 정의한다.
}
