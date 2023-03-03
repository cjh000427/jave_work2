package chap1_CJH;

import java.util.Scanner;

public class Solution01 {

	public static void main(String[] args) {

		//nums 배열에서 가장 큰 값을 출력하는 코드를 작성합니다. 
		
	Scanner sc = new Scanner(System.in);
	
	int[] nums = new int[10];
	
	for(int i=0; i<nums.length; i++) {
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		nums[i] = num;
	}
	
	int max = nums[0];
	for(int j=0; j<nums.length; j++) {
		if(max < nums[j]) {
			max = nums[j];
		}
	}
	
	
	System.out.print("입력한 정수 중 가장 큰 값: " + max);
		
		
	}

}
