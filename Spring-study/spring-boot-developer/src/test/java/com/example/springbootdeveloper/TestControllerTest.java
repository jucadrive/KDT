package com.example.springbootdeveloper;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@AutoConfigureMockMvc
class TestControllerTest {
	
	@Autowired
	protected MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext context;
	
	@Autowired
	private MemberRepository memberRepository;
	
	@BeforeEach
	public void mockMvcSetUp() {
		// MockMvc 객체를 생성하는데 필요한 WebApplicationContext를 설정
		this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@AfterEach
	public void cleanUp() {
		memberRepository.deleteAll();
	}
	
	@DisplayName("getAllMembers : 아티클 조회에 성공합니다.")
	@Test
	void getAllMembers() throws Exception {
		// given : 테스트 실행을 준비하는 단계
		final String url = "/test";
		Member savedMember = memberRepository.save(new Member(1L, "홍길동"));
		
		// when : 테스트를 진행하는 단계
		// perform 요청을 전송하는 메서드
		final ResultActions result = mockMvc.perform(get(url)
				.accept(MediaType.APPLICATION_JSON))
				.andDo(print());	// 테스트 결과 출력
		// accept 요청을 보낼 때 무슨 타입으로 응답을 받을지 결정하는 메서드
		
		// then : 테스트 결과를 검증하는 단계
		result.andExpect(status().isOk())
			  .andExpect(jsonPath("$[0].id").value(savedMember.getId()))
			  .andExpect(jsonPath("$[0].name").value(savedMember.getName()));
	}	// jsonPath : json 응답값의 값을 가져오는 역할을 하는 메서드
		// andExpect : 응답을 검증한다.
}
