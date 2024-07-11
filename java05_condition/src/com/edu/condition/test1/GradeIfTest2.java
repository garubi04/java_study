package com.edu.condition.test1;
import java.util.Scanner;

/*
 * GraadeIfTest1 코드는 컴파일 시점에 실제값 88이 입력되는 코드...프로그램이 아니다.
 * 실행시점에 값이 입력되도록 Scanner를 생성해서 값을 입력받아서 보겠다.
 * 
 * 학생이름 | 해당 학생의 점수를 입력
 * 조건을 그대로 작성
 * 하승현 , C Grade... 출력되도록 로직을 추가
 */

public class GradeIfTest2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요.\n");
		String studentName = input.next();
		
		System.out.println("점수를 입력해주세요.\n");
		int grade = input.nextInt();
		
		
		if (grade >=90 & grade <= 100) {
			System.out.println(studentName + ", " + "A grade");
		}else if (grade >=80 & grade < 90) {
			System.out.println(studentName + ", " + "B grade");
		}else if (grade >=70 & grade < 80) {
			System.out.println(studentName + ", " + "C grade");
		}else {
			System.out.println(studentName + ", " + "Try Again");
		}
	}

}
