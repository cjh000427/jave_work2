package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify {

	public static void main(String[] args) {

		String[] foods = {"삼겹살", "족발", "피자", "햄버거"};
		System.err.println(Arrays.toString(foods));
		
		foods[0] = "치킨"; // 삼겹살에서 치킨으로 수정
		foods[2] = "탕수육"; // 피자에서 탕수육으로 수정
		System.err.println(Arrays.toString(foods));
		
		//배열의 인덱스 탐색
		System.out.println("----------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("탐색할 음식을 입력하세요: ");
		String name = sc.next();
		
		
		
//		for(int i=0; i<foods.length; i++) {
//			if(name.equals(foods[i])) {
//				System.out.println("탐색 완료!");
//				System.out.println("인덱스: " + i + "번");
//				break;
//			} 
//		}
		
		/////////////////////////////////////////////
		//나의 답 (되긴 함)
		int k = 0;
		for(int i=0; i<foods.length; i++) {
			if(name.equals(foods[i])) {
			System.out.println("인덱스: " + i + "번");
				k++;
				break;
			} 
		}
		
		if(k!=0) {
			System.out.println("찾았습니다.");
		} else {
			System.out.println("못 찾았습니다.");
			
		}
//		
		/////////////////////////////////////////////
		
//		boolean flag = false;
//		
//		for(int i=0; i<foods.length; i++) {
//			if(name.equals(foods[i])) {
//				System.out.println("탐색 완료!");
//				System.out.println("인덱스: " + i + "번");
//				flag=true;
//				break; 
//			}
//		}
//		if(!flag) {
//			System.out.println("없는 음식입니다.");
//		}
		
		//////////////////////////////////////
//		
//		for(int i=0; i<foods.length; i++) {
//			if(name.equals(foods[i])) {
//				System.out.println("탐색 완료!");
//				System.out.println("인덱스: " + i + "번");
//				break;
//			} else if(i==foods.length-1) {
//				System.out.println("없는 음식입니다.");
//			}
//		}
//		
		
		
		
		
		sc.close();

	}

}
