package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookTest {
	
	@Test
	void test() {
		//디폴트 생성자
		Book book1 = new Book();
		book1.setTitle("스프링");
		book1.setPrice(20005);
		book1.setBrand("나라출판사");
		book1.setPages(1002);
		
		//모든 멤버변수를 초기화하는 생성자
		Book book2 = new Book("자바",20000,"메가",200);
		
		//Builder를 이용한 생성
		Book book3 = Book.builder().title("나라").price(2000).brand("금성").pages(300).build();
		Book book4 = Book.builder().build();
		
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		System.out.println(book4.toString());
		
	}
}
