package com.edu.vo.test;
import com.edu.vo.Programmer;
import com.edu.vo.NoteBook;
/*
 * 1.객체생성 
 * 2.메소드 호출
 */

public class ProgrammerTest {

	public static void main(String[] args) {
		/*
		 * 1. james 라는 개발자를 생성
		 *    thomas 라는 개발자를 생성
		 * 2. james가 HP 노트북을 구매
		 * 	  thomas가 LG 노트북을 구매
		 * 
		 * 3. thomas가 구매한 노트북의 가격과 브랜드명을 출력
		 * 4. james의 연봉을 출력
		 * 5. thomas의 급여를 인상.... 최종적인 연봉을 출력
		 */
		
		
	/*
		Programmer ProgrammerJ = new Programmer("James", "Java", 100, "", 0);
		Programmer ProgrammerT = new Programmer("Thomas", "Java", 100, "", 0);
		
		NoteBook noteBookLG = new NoteBook(123, "LG", 500000);
		NoteBook noteBookHP = new NoteBook(456, "HP", 500000);
		
		ProgrammerJ.buyNoteBook(noteBookHP);
		ProgrammerT.buyNoteBook(noteBookLG);
		
		System.out.println(ProgrammerJ.getNoteBookInfo());
		System.out.println(ProgrammerT.getNoteBookInfo());
		
	*/
		
		Programmer james = new Programmer("James", "Python", 30000.0F, "Texas", 100);
		Programmer thomas = new Programmer("Thomas", "Vue.js", 45000.0F, "WhiteWood", 100);
		
		
		//나쁜 예 (작동은 O)
		NoteBook nb1 = new NoteBook(111, "HP", 170);
		james.buyNoteBook(nb1);
		
		//좋은 예
		thomas.buyNoteBook(new NoteBook(222, "SAMSUNG", 150));
		
		System.out.println("======= Thomas가 구입한 노트북 정보입니다. =======");
		
		NoteBook tomasNoteBook = james.getNoteBook();
		System.out.println(tomasNoteBook.getNoteBookInfo());
		
		System.out.println("======= James의 연봉 정보입니다. =======");
		System.out.println(james.getAnnualSalary());
		
		System.out.println("======= Thomas의 급여인상분을 반영한 연봉 정보입니다. =======");
		thomas.raiseSalary(50);
		System.out.println(thomas.getAnnualSalary());

	}

}
