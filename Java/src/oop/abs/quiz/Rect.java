package oop.abs.quiz;

public class Rect extends Shape {

	private int width;
	private int height;
	

	//	public Rect(String name) {
	//		super(name);
	//		// TODO Auto-generated constructor stub
	//	}

	//	- Circle 객체를 생성할 때, 반지름도 받아서 초기화 할 수 있는
	//    생성자를 선언해 주세요.
	//    Rect 객체를 생성할 때, 이름과 변의 길이를 받도록 처리해 주세요.

	public Rect(String name, int r) {
		super(name, r);
	}
	
	public Rect(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}

//	@Override
//	public double getArea() {
//		if(this.getR() != 0) {
//			return this.getR()*this.getR();
//		} else (this.getR() == 0) {
//			return width * height;
//		}
//	}

	
	
	public double getArea() {
		return this.getR()*this.getR();
	}
	
	
	
	
	
	
	

}
