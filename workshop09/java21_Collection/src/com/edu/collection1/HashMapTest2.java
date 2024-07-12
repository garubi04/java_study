package com.edu.collection1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * 				Map
 * 				|
 * 				HashMap
 * 				key  -  value 쌍으로 저장
 * 				(중복 x)  (중복 o)
 * 				순서는 없다.
 */
public class HashMapTest2 {

	public static void main(String[] args) {
		Map<String, Integer> map= new HashMap<>();
		map.put("강호동", 90);// Boxing -컴파일러가 자동으로 Interger 타입으로 변환해준다.
		map.put("이수근", 80);
		map.put("서장훈", 95);
		map.put("김희철", 80);
		
		/*1. 키 값들을 뽑아서 
		 *2. 반복문을 통해서 키값에 해당하는 점수를 뽑고
		 *3. 최정족으로 모든 성적의 합과 평균을 구하라
		 * 
		 */
		System.out.println("============keyset()================");
		int total =0;
		for(String key : map.keySet()) {
			int score =map.get(key); // unboxing-  컴파일러가 자동으로 Interger값을 int로 변환해준다.
			total+= score;
			System.out.println("모든 사람들의 성적의 총합은 "+total+"점 입니다.");
			System.out.println("모든 사람들의 성적의 평균은 "+total/map.size()+"점 입니다.");
		}
		System.out.println("============values()================");
		
		int sum=0;
		for(int v : map.values())  sum+= v;
		System.out.println("모든 사람들의 성적의 총합은 "+sum+"점 입니다.");
		System.out.println("모든 사람들의 성적의 총합은 "+sum/map.size()+"점 입니다.");
		
		System.out.println("============Collections================");
		System.out.println("최고 성적은 "+Collections.max(map.values())+"점 입니다.");
		System.out.println("최저 성적은 "+Collections.min(map.values())+"점 입니다.");
		Collections.max(map.values());
		
		
		
		
	}//main

}//class
