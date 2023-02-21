package basic;

import java.util.Scanner;

public class IfQuiz04_1 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1을 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.print("정수2을 입력하세요: ");
		int num2 = sc.nextInt();
		System.out.print("정수3을 입력하세요: ");
		int num3 = sc.nextInt();
		 
		int max, mid, min;

		if(num1 > num2 && num1 > num3) { // num1이 max다
			max = num1;
			if(num2 > num3) {
				mid = num2; min = num3;
			} else {
				mid = num3;
				min = num2;
			}
		} else if(num2 > num1 && num2 > num3) { // num2가 max다
			max = num2;
			if(num1 > num3) {
				mid = num1; min = num3;
			} else {
				mid = num3; min = num1;
			}
		} else { // num3가 max다
			max = num3;
			if(num1> num2) {
				mid = num1; min = num2;
			} else {
				mid = num2; min = num1;
			}
		}
		
		System.out.println("-------------------------");
		System.out.println("최댓값: " + max);
		System.out.println("중간값: " + mid);
		System.out.println("최솟값: " + min);
		
		sc.close();
		
		
		
		
	}

}
