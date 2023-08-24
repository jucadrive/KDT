package com.example.validationutils;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@RequestMapping("/")
	public @ResponseBody String root() {
		return "ValidationUtils (2)";
	}
	
	@RequestMapping("/insertForm")
	public String insert1() {
		return "createPage";
	}
	
	@RequestMapping("/create")
	public String insert2(@ModelAttribute("dto") ContentDto contentDto, 
												BindingResult result) {
		// BindingResult 객체는 유효성 검증 결과를 담는 객체
		String page = "createDonePage";
		System.out.println(contentDto);
			
		// 유효성 검증 수행
		ContentValidator validator = new ContentValidator();
		validator.validate(contentDto, result);
		
		// ContentValidator 객체를 사용하여 contentDto를 유효성 검증한다.
		if(result.hasErrors()) {	// 유효성 검증 결과에 오류가 있는지 확인
			page = "createPage";
		}	// 유효성 검증에 실패한 경우에는 page 변수를 "createPage"로 설정
		
		return page;
	}	// page 변수를 반환하여 요청에 대한 응답으로 사용
}		// 유효성 검증에 실패하지 않았다면 "createDonePage"가 반환된다.
		// 실패한 경우에는 "createPage"가 반환된다.
