package com.example.demo.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;


@AllArgsConstructor
@ToString
@Builder
public class Student {
	int stuNum;
	String name;
	int age;
}
