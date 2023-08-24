package com.example.restaurant.naver.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchImageRes {
	
	private String lastBuildDate;	
	private int total;	
	private int start;	
	private int display;
	private List<SearchImageItem> items;
	
	// 내부 클래스
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public static class SearchImageItem {
		private String title;
		private String link;
		private String thumbnail;
		private String sizeheight;
		private String sizewidth;
	}
}
