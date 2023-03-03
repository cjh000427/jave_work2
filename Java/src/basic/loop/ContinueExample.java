package basic.loop;

public class ContinueExample {

	public static void main(String[] args) {

		//continue 는 값을 건너뛰고 싶을 때 사용
		
		for(int i=1; i<=10; i++) {
			if(i % 2 != 0) continue;
			
			System.out.print(i + " ");
		}
		System.out.println("\n반복문 종료!"); 
		
		
		
		
		

	}

}
