package com.self.bank;

public class Account {
	private int balance;
	
	public Account() {}

	public Account(int balance) {
		this.balance = balance;
	}
	

	public int getBalance() {
		return balance;
	}
	
	public void withdraw(double amt) {  // 출금 
		balance -= amt;
	}
	
	public void deposit(double amt) { // 입금
		balance += amt;
	}
	
	public String toString() {
		return balance+"";
	}
	
}
