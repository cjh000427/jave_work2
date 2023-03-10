package chap2_CJH.quiz01;

public class Teacher extends Person {

	String subject;
	
	public String info() {
		return super.info()+ "과목: " + subject;
	}
	
	
	
}
