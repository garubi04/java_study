package com.edu.loop.test;

public class LoopingBreakTest3 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) continue;
			sum+=i;
		}
		System.out.printf("1부터 100까지의 홀수값 총합은 %d", sum);
	}
}
