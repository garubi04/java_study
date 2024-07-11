package com.edu.oop.test;
import com.edu.oop.Greet;

/*
 1. Greet 클래스 객체 생성
 	--> Greet 클래스의 구성요소를 메모리에 올린다.
 
 2. 구성 요소 사용(접근)
 	필드 --> 값 할당
 	메소드 --> 호출
 */
public class GreetTest {

	public static void main(String[] args) {
		//ctrl + shift + o :: 자동 import
		Greet g = new Greet();
		g.target = "284기 여러분";
		g.message = "안녕~~^^";
		
		g.sayHello(); // Calling Method
	}

}
