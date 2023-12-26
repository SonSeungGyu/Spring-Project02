package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Quiz2 {
	@Test
	void test() {
		//디폴트 생성자 생성 후 setter, getter 이용해 호출
		Car car1 = new Car();
		car1.setModel("소나타");
		car1.setCompany("현대");
		car1.setColor("blue");
		System.out.println(car1.getModel());
		System.out.println(car1.getCompany());
		System.out.println(car1.getColor());
		
		//모든 멤버변수를 받는 생성자
		Car car2 = new Car("k5","기아","black");
		System.out.println(car2.toString());

		//Builder를 이용해 멤버변수에 값을 할당
		Car car3 = Car.builder().model("무쏘").company("쌍용").color("red").build();
		System.out.println(car3);
	}
}
