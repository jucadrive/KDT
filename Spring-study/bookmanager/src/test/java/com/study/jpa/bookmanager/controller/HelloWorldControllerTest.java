package com.study.jpa.bookmanager.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.jpa.mapping.JpaMetamodelMappingContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest
@MockBean(JpaMetamodelMappingContext.class)
public class HelloWorldControllerTest {

	@Autowired
	MockMvc mockMvc;
	
	@Test
	void helloworld() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/hello-world"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string("hello-world"));
	}
	
}
