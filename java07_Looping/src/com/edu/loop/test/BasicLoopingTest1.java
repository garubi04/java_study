package com.edu.loop.test;
/*
 * for | while | do while
   for(초기식 ; 조건식 ; 증감식)
 */
public class BasicLoopingTest1 {

	public static void main(String[] args) {
		System.out.println("=========== for ===========");
		for(int i=0; i<10; i++) {
			System.out.println("Hello for Looping" + i);
		}
		System.out.println("========== while ==========");
		int i = 10;
		while(i>0) {
			System.out.println("Hello for Looping" + i);
			i--;
		}
		int j = 10;
		do {
			System.out.println("Hello do while Looping");
			j++;
		}while(j<10);

	}

}
