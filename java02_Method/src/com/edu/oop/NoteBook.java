package com.edu.oop;
/*
 * Notebook의 정보를 저장하고 있는 클래스
 */
public class NoteBook {
	//field 선언
	public int serialNumber;
	public String brand;
	public double price;
	
	public NoteBook(){	} //기본 생성자
	
	//명시적 생성자..setter 기능과 동일
	public NoteBook(int serialNumber, String brand, double price) {
		//필드초기화
		this.serialNumber = serialNumber;
		this.brand=brand;
		this.price = price;
	}
	
	//기능 추가...필드에 값을 할당,주입, setter(inject)
	/*
	 field와 local V의 이름이 동일할때 이 둘을 구분하기 위해서 필드앞에 this를 지정
	 this는 해당 객체의 주소값을 참조하고 있다.
	 */
	public void setNoteBookField(int serialNumber, String brand, double price) {
		this.serialNumber = serialNumber;
		this.brand=brand;
		this.price = price;
	}
	
	//기능 추가...필드에 주입된 값을 받아옴, getter(reading)
	public String getNoteBookInfo() {
		return serialNumber +","+brand+", "+ price;
	}
	
	//method 정의(선언 + 구현부)
	//void : 반환타입 - 해당 기능을 수행한수 반환되는 데이타가 없다는 의미의 반환타입
	public void printNoteBookInfo() {
		int size = 100;
		System.out.println(size+","+serialNumber+","+brand+","+price);
	}	
}
