package basic.loop;

import java.util.Random;

public class ForQuiz01 {

	public static void main(String[] args) {

		//2~19까지의 난수를 생성하셔서 구구단을 출력해 보세요. (for)
		//19행까지 출력하세요.
		//                0.0~1.0
		int num = (int) ((Math.random()*18) + 2);
		
		System.out.println("***구구단 " + num + "단 ***");
		System.out.println("--------------------------");
		
		for(int i = 1;i<=19; i++) {
			int total = num * i;
			System.out.printf("%d x %d = %d\n", num, i, total); 
		}
		
		
		
		

	}

}





