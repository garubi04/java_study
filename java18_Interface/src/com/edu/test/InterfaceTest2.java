package com.edu.test;

class Unit{
	int currentHP; //유닛의 체력
	int x; //유닛의 x좌표
	int y; //유닛의 y좌표
}

interface Movable{
	void move(int x, int y);
	void jump(int height);
}

interface Attckable{
	void attack(Unit u);
}

interface Fightable extends Movable, Attckable{
	//3개
}
class Fighter extends Unit implements Fightable{

	@Override
	public void move(int x, int y) {	
		
	}
	@Override
	public void jump(int height) {		
		
	}
	@Override
	public void attack(Unit u) {
		
	}	
}
public class InterfaceTest2 {
	public static void main(String[] args) {
		
		Fighter f = new Fighter();
		if(f instanceof Unit)
			System.out.println("f는 Unit 의 자손입니다.");
		if(f instanceof Fightable)
			System.out.println("f는 Fightable 의 자손입니다.");
		if(f instanceof Movable)
			System.out.println("f는 Movable 의 자손입니다.");
		if(f instanceof Attckable)
			System.out.println("f는 Attckable 의 자손입니다.");
		if(f instanceof Object)
			System.out.println("f는 Object 의 자손입니다.");
	}

}






