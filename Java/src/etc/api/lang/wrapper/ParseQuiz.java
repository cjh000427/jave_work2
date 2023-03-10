package etc.api.lang.wrapper;

import java.util.Scanner;

public class ParseQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//입력은 반복으로 받고 whlie문 
		//입력값 저장 후 년도 구할 때 정수로 변환 후 더하기 1900 또는 2000
		//나이는 년도 이용
		
		/*
		 # 내가 놓친 부분
		 1. 입력 받은 while문 밖에서 년도 계산하기
		 2. num.charAt(7)을 변수에 담아서 사용하기 //자주 사용하는 것은 변수에 담아서 사용하기!
		 */
		

		String gender;
		int year;
		int age;
		
		while(true) {
			System.out.println("주민등록번호를 입력하세요: ");
			String num = sc.next();
			if(!num.equals("-")) {
				System.out.println("주민등록번호는 하이픈을 포함시켜 주세요.");
				continue;
			}

			if(num.charAt(7) != '1' || num.charAt(7) != '3') {
				System.out.println("뒷자리 첫번째 숫자는 1, 2, 3, 4 중 하나여야 합니다.");
				continue;
			} else if(num.charAt(7) == '1') {
				gender = "남자";
				String nums = num.replace("-", "");
				
				if(nums.length() != 13) {
					System.out.println("주민등록번호를 정수로 정확히 입력해 주세요.");
					continue;
				} else {
					int tempYaer = Integer.parseInt(nums.substring(0, 1));
					year = (1900 + tempYaer);
				}
				
			}

			else if(num.charAt(7) != '2' || num.charAt(7) != '4') {
				System.out.println("뒷자리 첫번째 숫자는 1, 2, 3, 4 중 하나여야 합니다.");
				continue;
			} else {
				gender = "여자";
			}



		}













	}

}
