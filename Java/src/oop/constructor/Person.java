package oop.constructor;

public class Person {

	String name;
	int age;
	int tall;
	
	Person() {}
	
	
	Person(String pName, int pAge, int pTall) {
		name = pName;
		age = pAge;
		tall = pTall;
	}
	
	
	
	void info() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("키: " + tall);
	}
	
}
