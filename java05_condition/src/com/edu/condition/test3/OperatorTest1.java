package com.edu.condition.test3;

public class OperatorTest1 {
	public static void main(String[] args) {
		int i = 5;
		int j = 3;
		int num = 98;
		// % ..mod.. 나머지
		System.out.println("연산자 % : " + i%j); // 2
		System.out.println("연산자 / : " + i/j); // 2
		
		/*
		 98
		 두자리수
		 십의 자리: 9
		 일의 자리 8
		 
		 */
		
		System.out.println(num/10); // 2
		System.out.println(num%10); // 2
		
		int k = 10;
		// 1씩 증가 ++, 1씩 감소 --
		System.out.println(k++);
		System.out.println(k);
		
		int m = 10;
		System.out.println(++m);
		System.out.println(m);
		
		Operator1 o1 = new Operator1();
		Operator2 o2 = new Operator2(); 
		System.out.println(o1);
		System.out.println(o2);
		//System.out.println(o1 == o2); //false
		//System.out.println(o1 != o2); //true
		
		/////////////// short circuit //////////////
		System.out.println(o1.test1());
		System.out.println("##########################");
		System.out.println(o1.test1() || o2.test1());
		System.out.println("##########################");
		System.out.println(o1.test1() && o2.test1());
	}
}

class Operator1{
	public boolean test1() {
		System.out.println("test1() calling.....");
		return true;
	}
	public boolean test2() {
		System.out.println("test2() calling.....");
		return false;
	}
}

class Operator2{
	public boolean test1() {
		System.out.println("test1() calling.....");
		return true;
	}
	public boolean test2() {
		System.out.println("test2() calling.....");
		return false;
	}
}
