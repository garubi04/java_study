package com.edu.condition.test2;
/*
 * static한 기능을 가지고 있는
 * Math클래스의 메소드 random()을 사용
 */

public class DiceIfTest1 {
	public static void main(String[] args) {
		//num이라는 변수에 1~6사이의 임의의 값이 할당되도록 로직을 작성
		int num = (int)(Math.random()*6) +1;
		System.out.println(num);
		if(num==1) System.out.println("Dice 1");
		if(num==2) System.out.println("Dice 2");
		if(num==3) System.out.println("Dice 3");
		if(num==4) System.out.println("Dice 4");
		if(num==5) System.out.println("Dice 5");
		else System.out.println("Dice 6");
	}

}