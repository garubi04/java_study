package com.edu.condition.test1;
import java.util.Random;
//Formaing 출력하기
public class PrintFormatTest4 {

	public static void main(String[] args) {
		Random r = new Random();
		String result = "";
		
		System.out.println("=================큰수? 혹은 작은수? ===================");
		//0~99사이의 정수
		int num = r.nextInt(100);
		
		if(num>50) result= "큰수";
		else result= "작은수";
		
		System.out.println(num + "은 " + result + "이다");
		System.out.printf("%d은(는) %s 이다.%n", num, result);
		
		System.out.println("\n################## 삼항 연산자 ####################");
		System.out.println("=================짝수? 혹은 홀수? ===================");
		
		int num2 = r.nextInt(10); //0~9 임의의 정수
		/*
		if(num2 % 2 == 0) result = "짝수";
		else result = "홀수";
		*/
		
		result = (num2 % 2 == 0) ? "짝수" : "홀수";
		System.out.printf("%d은(는) %s 이다.%n", num2, result);
		
	}

}