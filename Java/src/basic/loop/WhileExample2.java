package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {

		// 48~150 사이의 정수 중 8의 배수만 가로로 출력해 보세요.
		//(48부터 숫자를 하나씩 올려가면서 8의 배수 판별을 반복하면 됩니다.)
		
//		int num = 48;    (오답)
//				
//		while(num <= 150) {
//			
//			System.out.println(num % 8 == 0);
//			num++;
//		}
		
		int num = 48;
		while(num <= 150) {
			if(num % 8 ==0) {
				System.out.print(num + " ");
			}
			num++;	
		}	
			
//		int n = 48;
//		while(n <= 150) {
//			System.out.println(n + " ");
//			n += 8;
//		}
		
		System.out.println();
		
		//1~100까지의 정수 중 4의 배수이면서
		//8의 배수는 아닌 수를 가로로 출력해 보세요.
		
		int n = 1;
		while(n <= 100) {
			if(n % 4 ==0 && n % 8 !=0) {
				System.out.print(n + " ");
			}
			n++;
		}
		
		System.out.println("\n-------------------------------");
		
		//1~30000까지의 정수 중 258의 배수의 개수를 출력.
		
		int num1 = 1;
		int total = 0; //배수의 개수를 기억해 줄 변수.
		
		while(num1 <= 30000) {
			if(num1 % 258 == 0) {
				total++;
			}
			num1++;
		}
		
		System.out.println(total);
		
		
		
		System.out.println("-------------------------------");
		
		
		
		
		
		//1000의 약수의 개수를 구하세요.
		//1부터 1000까지 하나씩 올려가면서 1000이랑 나눠보세요.
		//그랬을 때 나누어 떨어지는 애가 약수입니다.
		
		int num2 = 1;
		int total2 = 0;
		
		while(num2 <= 1000) {
			if(1000 % num2 == 0) {
//				System.out.print(num2 + " "); //약수 출력
				total2++;
//				total2 += num2; //약수의 합
			}
			num2++;
		}
		
		System.out.print("\n" + total2);
		
		
		
		
		
		
		
	}

}




