package com.example.demo.lombok;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
@Builder

public class Movie {
	String title;
	String director;
	LocalDate releaseDate;
	
	
}
