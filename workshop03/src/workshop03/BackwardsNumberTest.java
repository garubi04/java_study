package workshop03;

import java.util.Scanner;

public class BackwardsNumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		
		while(true) {
			System.out.println("1 이상의 숫자를 입력하세요");
			input = sc.nextInt();
			if(input >= 1) {
				while(input > 0) {
					System.out.print(input + " ");
					input--;
				}
				
				break;
			}
			else {
				System.out.println("1 이상의 숫자를 입력하세요.");
			}
		}
	}
}
