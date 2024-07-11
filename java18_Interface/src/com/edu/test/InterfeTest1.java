package com.edu.test;//Bird.class X

import com.edu.child.Bird;
import com.edu.child.AirPlane;

import com.edu.parent.Flyer;

public class InterfeTest1 {
	public static void main(String[] args) {
		//Flyer f=  new Flyer();
		Flyer f=  new Bird(); 
		//Polymorphism...부모타입으로 자식객체를 생성
		/*
		   1. Object Casting
		   2. Virtual Method Invocation
		 */
		System.out.println(((Bird) f).layEggs()); //1
		f.land();//2
		
		////////////////////////////////////////////////
		
		Flyer f2 = new AirPlane();
		f2.fly();
		f2.land();
		
		Flyer[ ] f3 = new Flyer[3];
		
	}
}
