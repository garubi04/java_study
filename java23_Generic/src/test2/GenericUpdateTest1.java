package test2;

import java.util.List;
import java.util.ArrayList;

class Box<T>{ //T라는 클래스는 실제로 존재하지 않지만 Type을 의미한다.
	T content; //Box에는 T타입의 내용들의 담겨진다. T타입은 나중(사용시)에 구체적인 타입으로 대체된다.
	
	public T selectContent() {
		return content;
	}
}
public class GenericUpdateTest1 {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.content = "곰인형";
		
		String bear = box.selectContent();
		System.out.println("담겨진 것은 " + bear); //Object Casting을 할 필요 없다.
		
		List<Integer> list = new ArrayList<>();
		list.add(10); //Auto Boxing
		list.add(20);
		list.add(30);
		
		System.out.println(list); //10, 20, 30... UnBoxing
	}
}
