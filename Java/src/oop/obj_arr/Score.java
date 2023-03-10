package oop.obj_arr;

public class Score {

	/*
    - 이름, 국어, 영어, 수학, 총점, 평균(double)을
     담을 수 있는 객체를 디자인하세요.

    - 학생의 모든 정보를 한 눈에 확인할 수 있게
     scoreInfo() 메서드를 선언해 주세요.
     메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.
     void로 작성

    - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
	 */
	private String name;
	private int kScore;
	private int eScore;
	private int mScore;
	private int total;
	private double average;

	public Score() {}

	public Score(String name, int kScore, int eScore, int mScore) {
//		super(); // 있어도 없어도.,,
		this.name = name;
		this.kScore = kScore;
		this.eScore = eScore;
		this.mScore = mScore;
		this.total = kScore + eScore + mScore;
		this.average = this.total / 3.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getkScore() {
		return kScore;
	}

	public void setkScore(int kScore) {
		this.kScore = kScore;
	}

	public int geteScore() {
		return eScore;
	}

	public void seteScore(int eScore) {
		this.eScore = eScore;
	}

	public int getmScore() {
		return mScore;
	}

	public void setmScore(int mScore) {
		this.mScore = mScore;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public void scoreInfo() {
		System.out.printf("%s의 국어: %d점 \n영어: %d점 \n수학: %d점\n총점: %d점 평균: %.2f\n"
				, name, kScore, eScore, mScore, total, average);
	}









}
