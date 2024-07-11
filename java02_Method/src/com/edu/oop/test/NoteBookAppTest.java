package com.edu.oop.test;

import com.edu.oop.NoteBook;

/*
 1. NoteBook 객체생성 n
 	== NoteBook의 멤버(4)를 메모리 올린다.
 2. 접근
    필드 --> 값할당
    메소드 --> 호출
 */
public class NoteBookAppTest {

	public static void main(String[] args) {
		//객체 생성 코드...
		NoteBook n= new NoteBook();		
		NoteBook n2=new NoteBook();
		
		n.serialNumber = 111;
		n.brand = "LG Gram";
		n.price = 1700000.0;
		
		
		n2.serialNumber = 222;
		n2.brand = "HP";
		n2.price = 1350000.0;
		
		n = n2;
		
		
		System.out.println(n);
		System.out.println(n2);
		/////////////////////////	
		n.printNoteBookInfo();
		n2.printNoteBookInfo();		
		
	}
}






