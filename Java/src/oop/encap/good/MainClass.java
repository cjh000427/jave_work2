package oop.encap.good;

public class MainClass {

	public static void main(String[] args) {

		MyBirth my = new MyBirth();
		
//		my.year = 1992; (x)
		my.setYear(2000);
		
		my.setMonth(4);
		
		my.setDay(27);
		
		System.out.printf("내 생일은 %d년 %d월 %d일 입니다."
					, my.getYear("abc1234"), my.getMonth(), my.getDay());
		
		
		
		
		
	}

}






