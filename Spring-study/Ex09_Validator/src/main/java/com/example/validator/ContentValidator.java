package com.example.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ContentValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		// 검증할 객체의 클래스 타입 정보
		return ContentDto.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		
		ContentDto dto = (ContentDto) obj;
		
		String sWriter = dto.getWriter();
		
		// 값이 null이거나 빈 문자열인지, 공백을 제거한 후 isEmpty() 메서드로 확인한다.
		if(sWriter == null || sWriter.trim().isEmpty()) {
			System.out.println("Writer is null or empty");
			errors.rejectValue("writer", "trouble");
		}	// Errors 객체의 rejectValue 메서드를 사용하여 "writer" 필드 이름과
			// "trouble" 에러 코드를 등록
		
		String sContent = dto.getContent();
		if(sContent == null || sContent.trim().isEmpty()) {
			System.out.println("Content is null or empty");
			errors.rejectValue("content", "trouble");
		}
	}
	

}
