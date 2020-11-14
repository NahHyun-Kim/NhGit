package kr.poly;

//단독적 기능을 하는 객체 생성이 불가능하다.
//추상클래스(불완전한객체, 장애객체) --> Animal ani = new Animal();
public abstract class Animal extends Object {

	//Dog, Cat --> eat()
	public abstract void eat(); //추상메서드==> 불완전한 메서드, 장애메서드

	public void move() { //구현메서드 : Cat, Dog가 비슷한 클래스라면 서로 가져도 문제가 되지 않음.
		System.out.println("무리를 지어서 이동한다.");
	}
	
	/*
	 * public Animal() { super(); }
	 */
}
