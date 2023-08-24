package com.study.jpa.bookmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.jpa.bookmanager.repository.BookRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService {
	
	// Bean을 주입할 때 @Autowired를 이용한 필드 주입은 요즘에는 권장되지 않고 대신 생성자 주입을 권장
	private final BookRepository bookRepository;	
	
}
