package basic.loop;

import java.util.Scanner;

public class WhileQuiz_My {

	public static void main(String[] args) {

		/*
		 양의 정수를 하나 입력 받은 후, 그 수만큼 3의 배수를 출력하세요
		 ex) 5 입력시 3,6,9,12,15 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수를 입력하세요: ");
		int num1 = sc.nextInt();
		int i = 1;
		
		while(i <= num1) {
			System.out.println(i*3);
			i++;
		}
		
		
		
		
		
		
		

	}

}
