package chap2_CJH.quiz02;

public class MainClass {

	public static void main(String[] args) {

		Car myCar = new Car("마이카");
		
		myCar.setSpeed(100);
		System.out.println("-----------------");
		myCar.engineStart();
		myCar.setMode('D');
		myCar.setSpeed(100);
		
		System.out.println("-----------------");
		myCar.engineStop();
		myCar.setSpeed(0);
		myCar.setMode('P');
		myCar.engineStop();
		
		
		
	}

}
