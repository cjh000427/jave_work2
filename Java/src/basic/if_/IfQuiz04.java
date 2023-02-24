package basic.if_;

import java.util.Scanner;

public class IfQuiz04 {

	public static void main(String[] args) {

		/*
		 - 정수 3개를 입력 받습니다.
		 - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.

		 # max, mid, min이라는 변수를 미리 선언하셔서
		  판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
		  마지막에 한번에 출력하시면 되겠습니다.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("정수1을 입력하세요: ");
		int max = sc.nextInt();
		System.out.print("정수2을 입력하세요: ");		
		int mid = sc.nextInt();
		System.out.print("정수3을 입력하세요: ");
		int min = sc.nextInt();

		if(max > mid) {
			if(max > min && mid > min) {
				System.out.printf("최댓값: %d\n" + "중간값: %d\n" + "최솟값: %d\n", max, mid, min);
			} else if(max > min && mid < min) {
				System.out.printf("최댓값: %d\n" + "중간값: %d\n" + "최솟값: %d\n", max, min, mid);
			}
		} else if(max < min && mid > min) {
			//System.out.printf("최댓값: %d\n" + "중간값: %d\n" + "최솟값: %d\n", mid, min, max);
		}
		
		if(mid > max) {
			if(mid > min && max > min) {
				System.out.printf("최댓값: %d\n" + "중간값: %d\n" + "최솟값: %d\n", mid, max, min);
			} else if(mid > min && max < min) {
				System.out.printf("최댓값: %d\n" + "중간값: %d\n" + "최솟값: %d\n", mid, min, max);
			}
		} else if(mid < min && max > min) {
			//System.out.printf("최댓값: %d\n" + "중간값: %d\n" + "최솟값: %d\n", max, min, mid);
		}
		
		if(min > mid) {
			if(min > max && mid > max) {
				System.out.printf("최댓값: %d\n" + "중간값: %d\n" + "최솟값: %d\n", min, mid, max);
			} else if(min > max && mid < max) {
				System.out.printf("최댓값: %d\n" + "중간값: %d\n" + "최솟값: %d\n", min, max, mid);
			}
		} else if(min < max && mid > max) {
			//System.out.printf("최댓값: %d\n" + "중간값: %d\n" + "최솟값: %d\n", mid, max, min);
		}
		
		sc.close();



	}

}
