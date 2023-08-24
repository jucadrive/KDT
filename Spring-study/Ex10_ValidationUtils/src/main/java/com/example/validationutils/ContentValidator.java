package com.example.validationutils;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ContentValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		// 검증할 객체의 클래스 타입 정보
		return ContentDto.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "writer", "writer is empty.");
		
		ContentDto dto = (ContentDto) obj;
		
		// 필드가 비어있거나 공백 문자로만 이루어져 있는 경우에
		// "writer" : 유효성 검사를 수행할 필드의 이름, errors 오류를 저장하는 객체
		String sWriter = dto.getWriter();
		if(sWriter.length() < 3) {
			errors.rejectValue("writer", "writer is too short");
		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "content", "content is empty.");
		
		
	}
	

}
