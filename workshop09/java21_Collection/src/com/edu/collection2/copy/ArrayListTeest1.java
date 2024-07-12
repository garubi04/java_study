package com.edu.collection2.copy;

import java.util.ArrayList;

import com.edu.vo.Person;

public class ArrayListTeest1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // 기본 10칸짜리 리스트
		// <> generic : 안에 저장된 객체의 타입을 알려주는 역할
		//add
		list.add(new Person(11, "AA"));
		list.add(new Person(22, "BB"));
		list.add(new Person(33, "CC"));
		list.add(new Person(44, "DD"));
		list.add(new Person(55, "EE"));
		
		System.out.println(list); //자동으로 overrriding
		System.out.println(list.size());
		//size는 들어있는 개수  capacity는 총 용량
		list.trimToSize(); //size와 capacity가 동일해진다.
		
		//리스트에 있는 사람중에서 2번째 사람의 정보를 출력
		Person secondPerson = (Person)list.get(1); // get() : 해당 인덱스에 들어있는 객체를 반환하는 기능
		//Object Casting
		//리시트에 들어있는 사람들 평균 나이를 구해서 출력
		int sum=0;
		for(Object o : list) {
			sum += ((Person)o).getAge();
			
			System.out.println("평균연령은 "+sum/list.size());
		}
		
		
		
		
	}//main

}//class
