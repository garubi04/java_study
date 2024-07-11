package com.edu.array.test2;

/*
 배열은 사이즈는 불변하지만
 다른 배열의 데이터를 카피해서 사용할 수 있다
 System.arraycopy() 함수를 사용한다.
 ::
 1. 여러개의 값을 하나로 묶는 기능... 전제조건 SameDataType
 2. 배열은 사이즈 변경 불가... Resizing이 안된다.
 3. 사이즈가 다른 배열의 요소 값을 copy해올 수는 있다.
 4. 배열은 객체다...... 클래스 타입이 제공되지 않는...
 */

public class ArrayTest1 {
	public static void main(String[] args) {
		int[ ] target = {1,2,3,4,5,6}; //사이즈가 6
		int[ ] source = {10,9,8,7,6,5,4,3,2,1};
		
		//source 데이터를 카피해서.... 8,6,7,5,4,3 copy | target 처음부터 끝까지...
		//target 1,2,3,4,5,6 --> 8,7,6,5,4,3
		//System.arraycopy()
		
		System.arraycopy(source, 2, target, 0, target.length);
		for(int number : target)
			System.out.print(number + " ");
	}
}