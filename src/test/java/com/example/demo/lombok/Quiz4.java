package com.example.demo.lombok;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Quiz4 {
	@Test
	void test() {
		Movie movie1 = Movie.builder().title("괴물").director("봉준호").releaseDate(LocalDate.of(2023, 11, 22)).build();
		Movie movie2 = Movie.builder().title("명량").director("김선균").releaseDate(LocalDate.of(2022, 1, 2)).build();
		Movie movie3 = Movie.builder().title("집으로").director("이준호").releaseDate(LocalDate.of(2023, 12, 25)).build();
		
		System.out.println(movie1);
		System.out.println(movie2);
		System.out.println(movie3);
	}
}
