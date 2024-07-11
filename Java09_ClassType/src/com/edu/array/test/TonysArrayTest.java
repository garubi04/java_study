package com.edu.array.test;

class Contact2{
	String name;

	public Contact2(String name) {
		this.name = name;
	}
	
	public void printName() {
		System.out.println(name+ ".....print!!");
	}
	
}

class ContactService2{
	public void sendMessage(String msg) {
		//Bob's code...Contact Type Array
		Contact[ ] contacts = new Contact[10];
		int x = 0;
		while(x<10) {
			contacts[x] = new Contact(msg);
			System.out.println(contacts[x] + "Person...");
			contacts[x].printName();
			x++;
		}
	}
}

public class TonysArrayTest {

	public static void main(String[] args) {
		Contact2 contactRef = null;
		int x = 0;
		while (x<10) {
			contactRef = new Contact2("PersonName..." + contactRef);
			System.out.println("Contact2 Reference...." + contactRef);
			x++;
		}
	contactRef.printName();
	}

}
