package com.edu.oop;
/*
 특정한 대상에게 
 인삿말을 콘솔로 출력하는 기능을 가지고 있는 클래스
 --------------------------------------
 변수(값이 저장되는 공간)
 target 
 message 
 ---------
 메소드
 sayHello()
 */

public class Greet {
	//field
	public String target;
	public String message;
	
	//method 정의 = 선언부 + 구현부
	public void sayHello() { // 선언부
		System.out.println(target + ", " + message); // 구현부
	} // sayHello() = Worker Method
 	
}
