package com.example.validannotation;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ContentDto {
	private int id;
	
	// writer 프로퍼티가 null이 아니어야 한다.
	// null인 경우에는 "writer is null"이라는 메시지 발생
	// 비어있는 경우에는 "writer is empty"라는 메시지 발생
	@NotNull(message = "writer is null")
	@NotEmpty(message = "writer is empty.")
	@Size(min = 3, max = 10, message = "writer min 3, max 10")
	private String writer;
	
	@NotNull(message = "content is null")
	@NotEmpty(message = "content is empty")
	private String content;
}
