package com.edu.datatype.test;

public class DataTypeTest {

	public static void main(String[] args) {
		float salary = 100;
		System.out.println(salary * 100); // float capacity에 들어감
		
		//데이터 타입 비교
		/*
		float salary1 = 100.0;
		System.out.println(salary1);
		*/
		
		double salary1 = 100.0;
		System.out.println(salary1);
		
		float salary2 = 100.0f;
		System.out.println(salary2);
		
		long salary3 = 1230000L;
		System.out.println(salary3);
		
		System.out.println("=============================");
		
		short a,b ;
		a = 1; 
		b= 2;
		short c = (short)(a+b);
		System.out.println(c);
		
		int x = 24;
		//byte b = 24;
	}

}
