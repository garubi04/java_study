package com.edu.collection3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortTest3 {

	public static void main(String[] args) {
		//1. 
		List<String> names = new ArrayList<>();
		names.add("Luccy");
		names.add("Adams");
		names.add("Juliet");
		names.add("Bob");
		
		System.out.println("정렬전 ==>"+names);
		Collections.sort(names);
		System.out.println("정렬후 ==>"+names);
		//2.
		List<Person> people = new ArrayList<Person>();
		people.add(new Person(11, "Lucy"));
		people.add(new Person(22, "Adams"));
		people.add(new Person(7, "Juliet"));
		people.add(new Person(55, "Bob"));
		System.out.println("정렬전 ==>"+people);
		/*
		Collections.sort(people, new Comparator<Person>() {

			
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getAge()-o2.getAge();
			}
		});  // 안 먹힌다...Person 크래스는 Comparable 인터페이스 상속안받고 있다.
		*/
		System.out.println("정렬후 ==>"+people);
		Collections.sort(people);
		System.out.println(people);
		
	}

}// 


	class Person implements Comparable<Person> {
		private int age;
		private String name;
		public Person() {}
		public Person(int age, String name) {
			super();
			this.age = age;
			this.name = name;
		}
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public String toString() {
			return "Person [age=" + age + ", name=" + name + "]";
		}
		@Override
		public int compareTo(Person p) { //이름순으로 정렬
			
			return -name.compareTo(p.getName()); //오름차순
		}
		
		
	}

