package chap1_CJH;

import java.util.Scanner;

public class Solution03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] scores = new int[5];
		int[] rank = new int[5];

		for(int i=0; i<scores.length; i++) {
			System.out.print("점수를 입력하세요: ");
			int score = sc.nextInt();
			scores[i] = score;
			rank[i] = 5;
		}

		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores.length; j++) {
				if(scores[j] > scores[i]) {
					rank[j]--;
				}
			}
		}
		
		System.out.printf("점수 \t 순위 \n ----------------\n");
		for(int i=0; i<scores.length; i++) {
			System.out.printf("%d \t %d \n", scores[i],rank[i]);
		}

		sc.close();


	}

}
