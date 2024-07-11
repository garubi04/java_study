package com.edu.bank;

public class Account {
	public int accNumber;
	public String bankName;
	public double balance;
	
	public Account() {} // 명시적
	
	public Account(int accNumber, String bankName, double balance) { //계좌
		this.accNumber = accNumber;
		this.bankName = bankName;
		this.balance = balance;
	}
	
	public void withdraw(double amt) {  // 출금 
		balance -= amt;
	}
	
	public void deposit(double amt) { // 
		balance += amt;
	}
	
	public String getAccountInfo() {
		return accNumber+","+bankName+","+balance;
	}
	
	public double getBalanceInfo() {
		return balance;
	}
}
