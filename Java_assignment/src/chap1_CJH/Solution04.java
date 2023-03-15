package chap1_CJH;

import java.util.Arrays;
import java.util.Scanner;

public class Solution04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] stuNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] success = new int[8];

		for(int i=0; i<stuNum.length-2; i++) {
			System.out.print("과제를 낸 학생의 출석번호를 입력하세요: ");
			int student = sc.nextInt();
			success[i] = student;
		}
		System.out.println("과제를 낸 학생의 출석번호"+ Arrays.toString(success));


		for(int i=0; i<stuNum.length;i++) {
			boolean flag = false;
			for(int j=0; j<success.length; j++) {
				if(stuNum[i] == success[j]) {
					flag = true;
				} 
			}
			if(!flag) {
				System.out.printf("과제를 안 낸 학생의 번호: %d \n" , stuNum[i]);
				System.out.println();
			}
		}

		/* 선생님 답
		boolean[] isSubmit = new boolean[10];

		for(int i=1; i<=8; i++) {
			System.out.print("제출한 학생의 번호를 입력: ");
			isSubmit[sc.nextInt()-1] = true;
		}

		System.out.println("숙제를 안 낸 학생: ");
		for(int j=0; j<isSubmit.length; j++) {
			if(!isSubmit[j]) {
				System.out.println(j+1);
			}
		}
		*/

		sc.close();





	}

}
