package com.edu.oop.test;

import java.util.Scanner;

import com.edu.oop.NoteBook;

/*
필드에 직접 값을 할당하기 않고
setXxxx(o,o,o)기능을 호출해서 필드초기화를 구동
 */
public class NoteBookAppTest2 {

	public static void main(String[] args) {
		//객체 생성 코드...
		NoteBook n= new NoteBook();	//메모리 올리고 == 객체생성
		
		Scanner sc = new Scanner(System.in);
		System.out.println("일련변호 입력 >>>");
		int s = sc.nextInt();
		System.out.println("브랜드 입력 >>>");
		String b = sc.next();
		System.out.println("가격 입력 >>>");
		double p = sc.nextDouble();
		
		n.setNoteBookField(s, b, p);//호출
		//n.printNoteBookInfo();
		System.out.println(n.getNoteBookInfo());//	
	}
}






