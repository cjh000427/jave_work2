package chap2_CJH.quiz01;

public class Student extends Person {

	String studentId;
	
	public String info() {
		return super.info() + " 학번: " + studentId;
	}
	
}
