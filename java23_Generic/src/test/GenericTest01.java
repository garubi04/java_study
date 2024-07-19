package test;

//Generic 사용 안함.
//Box에 뭐든지 담을 수 있도록 설계 했을 때의 상황...
/*
 * 1. 뭐든지 담긴다.
 * 2. 꺼낼때마다 Object Casting 해줘야 한다.
 */
class Box{
	Object content;
	
	public Object selectContent() {
		return content;
	}
}
public class GenericTest01 {
	public static void main(String[] args) {
		Box box = new Box();
		box.content = "곰돌이인형";
		
		String bearDoor = (String)box.selectContent();
		System.out.println("박스 안의 내용물은..." + bearDoor);
	}
}

