package com.edu.condition.test2;

public class NoBreakSwtichTest2 {
	public static void main(String[] args) {
		//8~11사이의 임의의 값이 할당되도록 로직을 작성
		int time = (int)(Math.random()*3) +8 ;
		System.out.println(time);
		switch (time) {
		case 8:
			System.out.println("출근 준비를 합니다.");
			break;
		case 9:
			System.out.println("회사 도착 Safe~~~.");
			break;
		case 10:
			System.out.println("오전 업무를 봅니다");
			break;
		case 11:
			System.out.println("외근 나갑니다.");
	}//switch
	}
}
