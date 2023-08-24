package com.example.simplebbs.dao;

import java.util.List;

import com.example.simplebbs.dto.SimpleBbsDto;

public interface ISimpleBbsDao {

	// 리스트 보기
	public List<SimpleBbsDto> listDao();
	
	// 개별 뷰 보기
	public SimpleBbsDto viewDao(String id);
	
	// 글 작성을 위한 insert
	public int writeDao(String writer, String title, String content);
	
	// 글 삭제
	public int deleteDao(String id);
}
