package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception {
		return "lombok 사용하기";
	}
	
	@RequestMapping("/test1")
	public String test1(Member member, Model model) {
		System.out.println(member);
		member.setId("Son");
		member.setName("손오공");
		return "test1";
	}
}
