package basic;

import java.util.Scanner;

public class IfQuiz05 {

	public static void main(String[] args) {

		/*
		 # 국어, 영어, 수학 점수를 각각 입력받아서
		  평균을 구해 보세요.(평균은 소수점 첫째 자리까지 출력)
		  평균이 90점이 넘는다면, 다시 한 번 조건을 검색해서
		  95 ~ 100 -> A+
		  94 ~ 90 -> A0
		  80점대는 B, 70점대는 C, 60점대는 D, 나머지는
		  모두 F 처리하시면 됩니다. (100점이 만점)

		  ex)
		  평균 점수: 95.5
		  당신의 학점은 A+ 입니다.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("국어 점수: ");
		double point1 = sc.nextDouble();
		System.out.print("영어 점수: ");
		double point2 = sc.nextDouble();
		System.out.print("수학 점수: ");
		double point3 = sc.nextDouble();

		double avg = (point1 + point2 + point3) / 3;
		String point ;
		
		if(avg >= 95) { //A+ 인 경우
			point = "A+";
		} else if(avg >= 90) { //A0 인 경우
			point = "A0";
		} else if(avg >= 80) { //B 인 경우 
			point = "B";
		} else if(avg >= 70) { //C 인 경우 
			point = "C";
		} else if(avg >= 60) { //D 인 경우 
			point = "D";
		} else { //F 인 경우
			point = "F";
		}

		System.out.printf("평균 점수:  %.1f\n", avg);
		System.out.println("당신의 학점은 " + point + "입니다.");


		sc.close();



	}

}
