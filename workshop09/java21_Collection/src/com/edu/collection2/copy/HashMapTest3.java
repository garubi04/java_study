package com.edu.collection2.copy;

import java.util.ArrayList;
import java.util.HashMap;

import com.edu.vo.Customer;

public class HashMapTest3{

	public static void main(String[] args) {
		HashMap<String ,Customer> map = new HashMap<>();
		map.put("111", new Customer("111", 11, "AAA"));
		map.put("222", new Customer("222", 22, "BBB"));
		map.put("333", new Customer("333", 33, "CCC"));
		
		//map에 들어있는 사람중에서 222
		System.out.println(map.get("222"));
		
		//2. 이름이 CCC인 사람을 찾아서 그 사람의 나이를 콘솔로 출력
		for(Customer c : map.values()) {
			if(c.getName().equals("CCC")) {
				System.out.println(c.getAge());
			}
			else continue;
		}
		//3. map에 있는 사람 중에서 최고연령과 최소연령의 사람을 각각 출력
		
	
	}//main

}
