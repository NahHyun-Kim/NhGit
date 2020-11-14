package Prac;

public class interface_prac {

	/* 
	 * 인터페이스는 100% 다형성을 보장한다.
	 * 모든 메서드는 불완전하여야 하며, 구현된 메서드를 가질 수 없다.
	 * 그래서 반드시 부모가 가진 메서드를 자식에서 override를 해야하고,
	 * 그러면 오류가 나지 않고 자식 클래스에서 재정의한 메서드가 실행되기 때문에
	 * 100% 다형성을 보장한다.
	 * 다형성이란 부모가 내린 같은 명령에 대해 자식들이 각자 다르게 또는 다양하게 반응하는 것을 말한다.
	 * 추상 클래스를 활용하는 경우에는 일부만 보장되며(자식 객체 간의 연관성이 어느정도 있을때 사용함)
	 * 인터페이스는 두 자식 클래스가 크게 관련이 없다 하더라도 (ex. radio과 tv의 인터넷 지원 여부는 상반된다.)
	 * 사용할 수 있다.
	 * 
	 * 인터페이스만 있으면 하위 클래스의 동작 방식을 몰라도 동작시킬 수 있다
	 * ex) api, 제3의 api를 사용할 때 핵심 클래스를 모르더라도 인터페이스를 통해 동작시킬 수 있다.
	 * 
	 *인터페이스는 다중 상속 형태를 지원한다. (보통 자바는 단일 상속 형태 사용)
	 *--> 우회적으로 사용할 수 있는 것이 인터페이스임.

	 *  */
}
