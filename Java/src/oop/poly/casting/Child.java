package oop.poly.casting;

public class Child extends Parent {

	public int n2; //자식 고유의 멤버 변수
	
	@Override
	public void method1() { //부모에게 물려받은 메서드에서 오버라이드 한 메서드
		System.out.println("재정의한 1번 메서드 호출!");
	}

	public void method3() { //자식 고유의 메서드
		System.out.println("자식 고유의 3번 메서드 호출!");
	}
	
	
	
	
}




