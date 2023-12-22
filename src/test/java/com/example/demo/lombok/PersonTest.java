package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//스프링 환경 만들기
@SpringBootTest
public class PersonTest {
	
	@Test
	void test() {
		Person person1 = new Person();//디폴트생성자
		
		person1.setName("둘리");//setter
		person1.setAge(12);
		
		System.out.println(person1.getName());//getter
		System.out.println(person1.getAge());
		
		Person person2 = new Person("또치",15); //모든 멤버변수
		System.out.println(person2.toString()); //재정의
	}
	
	
}


