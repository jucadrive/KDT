package com.example.mybatisparam.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.mybatisparam.dto.*;

public interface ISimpleBbsDao {

	// 리스트 보기
	public List<SimpleBbsDto> listDao();
	
	// 개별 뷰 보기
	public SimpleBbsDto viewDao(String id);
	
	// 글 작성을 위한 insert
	public int writeDao(String writer, String title, String content);
	
	// 글 삭제
	public int deleteDao(@Param("_id") String id);
	// @Param 어노테이션을 사용하여 매개변수의 이름을 지정한다.
}
