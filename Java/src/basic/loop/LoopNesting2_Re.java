package basic.loop;

import java.util.Scanner;

public class LoopNesting2_Re {

	public static void main(String[] args) {

		/*
        - 정수를 하나 입력받아서 
         해당 숫자까지의 모든 소수를 가로로 출력하고, 
         그 소수들의 개수를 구하는 로직을 작성합니다.

        ex)
        입력받은 수 -> 30
        소수: 2 3 5 7 11 13 17 19 23 29
        소수의 개수: 10개
        */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int count2 = 0;
		System.out.print("입력값의 소수 :");
		
		for(int i=2; i<=num; i++) {
			
			int count = 0;
			for(int k=1; k<=i; k++) {
				if(i%k==0) {
					count++;
				}
			}
			if(count==2) {
				count2++;
				System.out.print("  " + i);
			}
		}
		System.out.print("\n소수의 개수: " + count2);
		
		
		
//		
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수 입력: ");
//		int num = sc.nextInt();
//		int count2 = 0;
//		System.out.print("소수: ");
//		
//		
//		for(int i=2; i<=num; i++) {
//			
//			int count = 0;
//			for(int j=1; j<=i; j++) {
//				if(i % j==0) {
//					count++;
//				}
//			}
//			if(count == 2) {
//				count2++;
//				System.out.print(" "+i);
//			}
//			
//		}
//		System.out.println("\n소수의 개수: " + count2);
//		
//		
//		System.out.println("---------------------------");
//		
	
		
		
		
		
		

	}

}





