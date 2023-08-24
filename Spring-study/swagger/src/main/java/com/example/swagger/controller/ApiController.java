package com.example.swagger.controller;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.swagger.dto.UserRequest;
import com.example.swagger.dto.UserResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;

@Api(tags = {"API 정보를 제공하는 Controller"})
@RestController
@RequestMapping("/api")
public class ApiController {

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@ApiImplicitParams({
				@ApiImplicitParam(name = "x", value = "x 값", required = true, dataType = "int" ,paramType = "path"), 
				@ApiImplicitParam(name = "y", value = "y 값", required = true, dataType = "int", paramType = "query")
			})
	@GetMapping("/plus/{x}")
	public int plus(@PathVariable int x, @RequestParam int y) {
		
		return x + y;
	}
	
	@ApiResponse(code = 502, message = "사용자의 나이가 10살 이하일 때")
	@ApiOperation(value = "사용자의 이름과 나이를 리턴하는 메서드")
	@GetMapping("/user")
	public UserResponse user(UserRequest userRequest) {
		
		return new UserResponse(userRequest.getName(), userRequest.getAge());
	}
	
	@PostMapping("/user")
	public UserResponse userPost(@RequestBody UserRequest req) {
		
		return new UserResponse(req.getName(), req.getAge());
	}
}
