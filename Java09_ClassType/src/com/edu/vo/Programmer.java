package com.edu.vo;
/*
 * Programmer가 여러 대의 NoteBook을 구매하기 위해서는 
 * 반드시 필드에 NoteBook 타입이 아닌
 * NoteBook [] 선언되어야 한다.
 */

public class Programmer {
	//생성자 주입
	String name;
	String mainSkill;
	float salary;
	String address;
	int bonus;
	
	/////////////////// Has a Relation /////////////////////
	
	NoteBook noteBook;
	NoteBook [] NoteBooks;
	
	public Programmer() {}
	
	public Programmer(String name, String mainSkill, float salary, String address, int bonus) {
		this.name = name;
		this.mainSkill = mainSkill;
		this.salary = salary;
		this.address = address;
		this.bonus = bonus;
	}
	
	public Programmer(String name) {
		this.name = name;
	}
	
	public void buyNoteBook(NoteBook noteBook) { //Worker -> 순서는 중요하지 않음
		this.noteBook = noteBook;
	}
	

	public void buyNoteBooks(NoteBook[] noteBooks) {
		NoteBooks = noteBooks;
	}
	
	public NoteBook[] getNoteBooks() {
		return NoteBooks;
	}

	public String getNoteBookInfo() {
		return name+","+mainSkill+", "+salary;
	}
	
	// 기능을 추가..
	// 개발자의 연봉을 리턴하는 기능
	public float getAnnualSalary () { 
		return salary * 12 + bonus;
	}
	// 개발자의 급여를 기존보다 50만원 더 인상하는 급여 
	public void raiseSalary(int amount) {
		//salary = salary + amount;
		salary += amount;
	}
	
	
} //class
