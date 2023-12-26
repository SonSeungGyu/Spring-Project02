package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Quiz3 {
	@Test
	void test() {
		Student stu1 = Student.builder().stuNum(1001).name("둘리").age(15).build();
		Student stu2 = Student.builder().stuNum(1002).name("또치").age(17).build();
		Student stu3 = Student.builder().stuNum(1003).name("도우너").age(19).build();
		
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu3);
		
		
	}
}
