package com.edu.loop.test;
/*
 * 반복문을 이용해서 1~100까지의 총합을 구하는 로직을 작성
 * 반복문 안에서 조건을 하나 추가
 */

public class LoopingBreakTest2 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(sum >  500)
				break;
			sum += i;
		}
		System.out.println("총합 : " + sum);
	}
}
