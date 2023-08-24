package com.example.firstproject.dto;
import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;
@AllArgsConstructor
@ToString
public class ArticleForm {
	private String title; // 제목을 받을 필드
	private String content; // 내용을 받을 필드
	private Long id; // id필드 추가
	public Article toEntity() {
		//return new Article(null, title, content);
		return new Article(id, title, content);
	}
}//@AllArgsConstructor
//클래스의 모든 필드를 파라미터로 받는 생성자를 자동으로 생성해줍니다
//모든 필드를 매개변수로 가지는 생성자를 작성할 필요 없이 자동으로 생성됩니다.