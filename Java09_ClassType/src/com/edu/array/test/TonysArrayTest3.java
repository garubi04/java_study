package com.edu.array.test;

import com.edu.vo.NoteBook;
import com.edu.vo.Programmer;

/*
 * Bob의 설계...
 */

public class TonysArrayTest3 {
	public static void main(String[] args) {
		
		NoteBook[ ] noteBooks = {
			new NoteBook(111, "HP", 150),
			new NoteBook(222, "LG Gram", 170),
			new NoteBook(333, "SAMSUNG", 200)
		};
		
		Programmer bob = new Programmer("Bob");
		
		bob.buyNoteBooks(noteBooks);
		
		System.out.println("============ Bob's NoteBook Information ============\n");
		NoteBook[] returns = bob.getNoteBooks();
		
		for(NoteBook nb : returns)
			nb.printNoteBookInfo();
	}
}
