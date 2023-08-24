package com.finalproject.book;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class AladinApiServiceTest {

    @Autowired
    private AladinApiService aladinApiService;

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void getDetailsTest() {
        var getDetail = new AladinBookDetailReq();
        getDetail.setItemId("9791192908236");
        var result = aladinApiService.getDetails(getDetail);
        System.out.println(result);
    }

    @Test
    public void saveBookDetailTest() {

        var getResponse = new AladinBookDetailRes();


    }

//    @Test
//    public void searchBookTest() {
//
//        var search = new AladinBookSearchReq();
//        search.setQuery("하울");
//        var result = aladinApiService.searchItems(search);
//
//        System.out.println(result);
//    }

    @Test
    public void searchBooksTest() {

        final List<BookEntity> books = bookRepository.findBooksByTitleContaining("가장 쉬운");
        System.out.println(books);
    }

    @Test
    public void getBookDetailTest() {
        BookEntity book = aladinApiService.getBookDetails("9791186745564");
        System.out.println(book);
    }
}
