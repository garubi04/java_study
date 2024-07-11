package com.edu.capsule.test;
import com.edu.capsule.MyDate;
import java.util.Scanner;

public class MyDateTest {
	public static void main(String[] args) {
		MyDate md = new MyDate();
		//md.month = 13;
		//md.day = 33;
		Scanner input = new Scanner(System.in);
		System.out.println("월을 입력해주세요.\n"); // 입력받기 시작
		int month = input.nextInt();
		System.out.println("일을 입력해주세요.\n"); // 입력받기 시작
		int day = input.nextInt();
		
		if(md.setMonth(month) && md.setDay(day)) {
			System.out.println("Today is " + md.getMonth() + "월 " + md.getDay() + "일 입니다.");
		}
		
		else
			System.out.println("invalid data!");
		
	}
}
