package com.example.initbinder;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@RequestMapping("/")
	public @ResponseBody String root() {
		return "Valid_initBinder (3)";
	}
	
	@RequestMapping("/insertForm")
	public String insert1() {
		return "createPage";
	}
	
	@RequestMapping("/create")
	public String insert2(@ModelAttribute("dto") @Validated ContentDto contentDto, 
												BindingResult result) {
		// BindingResult 객체는 유효성 검증 결과를 담는 객체
		String page = "createDonePage";
		System.out.println(contentDto);
			
		// 유효성 검증 수행
		ContentValidator validator = new ContentValidator();
		validator.validate(contentDto, result);
		// ContentValidator 객체를 사용하여 contentDto를 유효성 검증한다.
		
		// 에러가 있다면 result 변수에 담는다
		// result 객체가 오류를 포함하고 있는지 확인하는
		if(result.hasErrors()) {	
			if(result.getFieldError("writer") != null) {
				// writer 필드에 대한 오류를 가져오는
				System.out.println("1 : " + result.getFieldError("writer").getCode());
			}
			
			if(result.getFieldError("content") != null) {
				System.out.println("2 : " + result.getFieldError("content").getCode());
			}
			page = "createPage";
		}	// 유효성 검증에 실패한 경우에는 page 변수를 "createPage"로 설정
			// @Validated는 메서드 매개변수에 적용
			// @Valid는 객체의 프로퍼티 유효성 검증에 사용
		return page;
	}
	// 데이터 바인더 초기화를 위한
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new ContentValidator());
	}	// ContentValidator를 바인더에 등록하고 설정한다.
}		
// 유효성 검증을 수행하는건 똑같다
// @Validated는 스프링의 기능에 의존하고,
// @Valid는 자바 표준에 의존한다는 점에서 차이가 있다.
