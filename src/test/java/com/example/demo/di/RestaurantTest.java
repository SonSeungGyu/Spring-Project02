package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RestaurantTest {
	
	@Autowired
	Restaurant restaurant;
	
	@Autowired
	Chef chef;
	
	
	@Test
	void test() {
		//레스토랑 인스턴스의 주소
		System.out.println("restaurant: " + restaurant);
		
		//쉐프 인스턴스의 주소
		System.out.println("chef: " + chef);
		
		//레스토랑의 쉐프와 레스토랑테스트의 쉐프는 같은 객체를 참조.
		System.out.println("레스토랑의 쉐프" + restaurant.chef2);
	}
	
}
