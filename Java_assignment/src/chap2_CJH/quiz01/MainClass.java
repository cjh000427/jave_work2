package chap2_CJH.quiz01;

public class MainClass {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.age = "30";
		s1.name = "홍길동";
		s1.studentId = "a001";
		Teacher t1 = new Teacher();
		t1.age = "50";
		t1.name = "김철수";
		t1.subject = "수학";
		Employee e1 = new Employee();
		e1.age = "25";
		e1.name = "박영희";
		e1.department = "영업부";
		
		System.out.println(s1.info());
		System.out.println(t1.info());
		System.out.println(e1.info());
		
		
		
		
		
	}

}
