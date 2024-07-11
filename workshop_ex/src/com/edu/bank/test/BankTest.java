package com.edu.bank.test;
import java.util.Scanner;
import com.edu.bank.Account;
import com.edu.bank.Customer;

public class BankTest {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("계좌번호를 입력해주세요.\n"); // 입력받기 시작
	int accNumber1 = input.nextInt();
	
	System.out.println("은행명을 입력해주세요.\n");
	String bankName1 = input.next();
	
	System.out.println("잔액을 입력해주세요.\n");
	double balance1 = input.nextDouble();
	
	Customer james = new Customer("James", "Seoul");
	james.createAccount(new Account(accNumber1, bankName1, balance1));
	
	System.out.println("계좌 개설이 완료되었습니다.\n"); // 제임스 개설 완료
	
	System.out.println("계좌번호를 입력해주세요.\n"); // 입력받기 시작
	int accNumber2 = input.nextInt();
	
	System.out.println("은행명을 입력해주세요.\n");
	String bankName2 = input.next();
	
	System.out.println("잔액을 입력해주세요.\n");
	double balance2 = input.nextDouble();
	
	Customer thomas = new Customer("Thomas", "Busan"); 
	thomas.createAccount(new Account(accNumber2, bankName2, balance2));
	
	System.out.println("계좌 개설이 완료되었습니다.\n"); // 토마스 개설 완료
	
	Account jamesAccount = james.getAccount(); //james 계좌 정보 반환
	Account thomasAccount = thomas.getAccount(); // thomas 계좌 정보 반환
	
	// james 입출금 작업 시작
	
	System.out.println("얼마를 입금하시겠습니까?\n");
	double depositAmount = input.nextDouble();
	jamesAccount.deposit(depositAmount);
	
	System.out.println("얼마를 입금하시겠습니까?\n");
	depositAmount = input.nextInt();
	jamesAccount.deposit(depositAmount);
	
	System.out.println("얼마를 출금하시겠습니까?\n");
	double withdrawAmount = input.nextDouble();
	jamesAccount.withdraw(withdrawAmount);
	
	System.out.println(james.name + "님의 정보 : " + james.getCustomerInfo() + "\n" );
	System.out.println(james.name + "님의 잔액 : " + jamesAccount.balance );
	}	
}
