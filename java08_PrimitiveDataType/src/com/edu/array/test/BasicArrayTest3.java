package com.edu.array.test;

/*
 * 배열 : Same Data Type
 * 선언 + 생성 + 초기화 ==> 동시에 한번에
 */

public class BasicArrayTest3 {
	public static void main(String[] args) {
		int[ ] scores = {95, 78, 66, 90, 87};
		
		int sum = 0;
		
		//향상된 for문을 이용해서 성적들의 총합 / 평균값을 각각 출력
		for(int score : scores) {
			sum += score;
		}
		
		System.out.println("성적들의 총합 " + sum);
		System.out.println("평균성적 " + sum/scores.length);
	}
 }
