package com.example.restaurant.naver;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.restaurant.naver.dto.SearchImageReq;
import com.example.restaurant.naver.dto.SearchLocalReq;


@SpringBootTest
public class NaverClientTest {
	
	@Autowired
	private NaverClient naverClient;
	
	@Test
	public void SearchLocalTest() {
		
		var search = new SearchLocalReq();
		search.setQuery("갈비집");
		
		var result = naverClient.SearchLocal(search);
		System.out.println(result);
	}
	
	@Test
	public void searchImageTest() {
		var search = new SearchImageReq();
		search.setQuery("파스타");
		
		var result = naverClient.SearchImage(search);
		System.out.println(result);
	}
}
