package com.example.demo.di;

/*
component는 상자라고 생각하고 클래스를 상자에 넣어두면 이용하고자 할 때 따로 생성자를
이용할 필요 없이 상자에서 꺼내어 쓴다라 생각해보자.
상자에 넣기 위해서는 component 어노테이션을 선언 해주고, 이 상자에서 끄집어내어
사용하기 위해서는 AutoWired 어노테이션을 선언후,
상자에 있는 클래스타입을 사용하여 
변수를 선언해주고, 일반 참조변수를 사용하듯이 메소드를 호출해주면 됨.
*/
//@Component
public class Dog implements Animal{

	@Override
	public void sound() {
		System.out.println("크르릉");
	}
	

}
