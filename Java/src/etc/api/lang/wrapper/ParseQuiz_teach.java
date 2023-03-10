package etc.api.lang.wrapper;

import java.util.Scanner;

public class ParseQuiz_teach {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String ssn;
		char c;
		
		while(true) {
			
			System.out.println("주민등록번호를 입력하세요: ");
			ssn = sc.next();
			
			if(ssn.indexOf("-") == -1) {
				System.out.println("주민등록번호는 하이픈을 포함시켜 주세요.");
				continue;
			}
			c = ssn.charAt(7);
			if(!(c == '1' || c == '2' || c == '3' || c == '4')) {
				System.out.println("뒷자리 첫번째 숫자는 1, 2, 3, 4 중 하나여야 합니다.");
				continue;
			}
			
			try { //입력을 정수로 안했을 경우 에러 예외처리.
			String test = ssn.substring(0, 6); //0번이상 6번 미만까지 추출
			String test2 = ssn.substring(7); //7번부터 끝까지 추출.
			Integer.parseInt(test); // 문자열을 정수로 변환
			Integer.parseInt(test2);
			break;
			} catch(NumberFormatException e) {
				System.out.println("숫자로 정확하게 입력하셔야 합니다.");
			}
		}
		
		//ex) 921013-1234567
		
		int year = Integer.parseInt(ssn.substring(0, 2)); // 92 정수로 추출
		int month = Integer.parseInt(ssn.substring(2, 4)); // 10 정수로 추출
		int day = Integer.parseInt(ssn.substring(4, 6)); // 13 정수로 추출
		
		String gender;
		int birthYear;
		
		if(c == '1' || c =='3') {
			gender = "남자";
		} else {
			gender = "여자";
		}
		
		if(c =='1' || c =='2') {
			birthYear = 1900 + year;
		} else {
			birthYear = 2000 + year;
		}
		
		int age = 2023 - birthYear;
		
		System.out.printf("%d년 %d월 %d일 %d세 성별: %s \n"
				, birthYear, month, day, age, gender);
		
		sc.close();
		
		
		
	}

}
