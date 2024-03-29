package etc.api.util.random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoSimulator {

	static Random r = new Random();

	static int prize1 = 0; //1등 당첨 횟수를 세 줄 변수
	static int prize2 = 0; //2등 당첨 횟수를 세 줄 변수
	static int prize3 = 0; //3등 당첨 횟수를 세 줄 변수
	static int prize4 = 0; //4등 당첨 횟수를 세 줄 변수
	static int prize5 = 0; //5등 당첨 횟수를 세 줄 변수
	static int failCnt = 0; //꽝 당첨 횟수를 세 줄 변수

	public static List<Integer> createLotto() {
		/*
		 - 1~45 범위의 난수 6개를 생성하셔서
		  컬렉션 자료형에 모아서 리턴해 주세요.
		  무엇을 쓰든 상관없습니다.
		  중복이 발생하면 안됩니다.
		 */
		Set<Integer> lotto = new HashSet<>();
		while(lotto.size() < 6) { //6개가 되는 순간 while문 종료
			int num = r.nextInt(45) + 1;
			lotto.add(num);
		}
		List<Integer> win = new ArrayList<>(lotto);
		return win;

	}

	//보너스 번호를 생성하는 메서드
	public static int createBonusNum(List<Integer> lotto) {

		/*
		 - 매개값으로 전달되는 당첨 번호 집합을 전달 받으신 후
		  당첨번호를 피해서 보너스 번호 하나만 뽑아 주세요.
		  범위는 마찬가지로 1~45 사이의 난수입니다.
		 */
		
		while(true) {
			int bonusNum = r.nextInt(45) + 1;
			if(!lotto.contains(bonusNum)) { //당첨번호와 중복되지 않는 보너스 숫자 랜덤으로 뽑기
				return bonusNum;
			} 
		}
	}

	//당첨 등수를 알려주는 메서드
	public static void checkLottoNumber(
			List<Integer> winNum, List<Integer> myNum, int bonusNum) {
		/*
			 매개값으로 당첨번호집합, 구매한 로또 번호집합, 보너스 번호를 받습니다.
			 내 로또 번호와 당첨번호를 비교하여
			 일치하는 횟수를 세 주신 후 등수를 판단하세요.
			 판단된 등수에 해당하는 static 변수의 값을 올려 주시면 됩니다.
			 6개 일치 -> 1등
			 5개 일치 + 보너스 일치 -> 2등
			 5개 일치 + 보너스 제외 -> 3등
			 4개일치 -> 4등
			 3개일치 -> 5등
			 나머지 -> 꽝
		 */
		Collections.sort(winNum);
		Collections.sort(myNum);
		int count=0;

		for(int i=0; i<winNum.size(); i++) {
			if(winNum.contains(myNum.get(i))) {
				count++;
				myNum.set(i, 0);
			}
			if(count == 5 && myNum.contains(bonusNum)) {
				prize2++;
			} else if(count == 5 && !myNum.contains(bonusNum)) {
				prize3++;
			}
		}

		if(count == 6) {
			prize1++;
			return;
		} else if(count == 4) {
			prize4++;
		} else if(count == 3) {
			prize5++;
		} else {
			failCnt++;			
		}

	}

	public static void main(String[] args) {
		

		//로또 번호 생성 메서드를 호출해서 당첨 번호를 하나 고정시키세요.
		List<Integer> win = createLotto();
		//보너스 번호도 하나 고정시키세요.
		int bonus = createBonusNum(win);
		
		long buyLotto = 0;
		while(true) {
			/*
			 - 1등이 당첨 될 때까지 반복문을 돌립니다.
			 - 1등이 당첨 된다면, 1등이 되기까지 누적 당첨 횟수를 출력하고
			  반복문을 종료합니다.
			 - 로또를 구매하기 위한 금액도 출력하세요. (long타입)
			 */
			
			//내가 이미 산 로또번호를 안사게 해주는 로직 있어야 하지 않나?
			Set<Integer> myLottoNum = new HashSet<>();
			while(myLottoNum.size() <6) {
				int num = r.nextInt(45) + 1;
				myLottoNum.add(num);
				
			}
			buyLotto++;
			System.out.println(buyLotto + "번째 구매중...");
			
			List<Integer> myLotto = new ArrayList<>(myLottoNum);
			
			checkLottoNumber(win, myLotto, bonus);
			
			if(prize1 == 1) break;
			
		}
		System.out.println("1등 번호" + win);
		System.out.println("1등 당첨!!");
		System.out.println("2등 횟수: " + prize2);
		System.out.println("3등 횟수: " + prize3);
		System.out.println("4등 횟수: " + prize4);
		System.out.println("5등 횟수: " + prize5);
		System.out.println("꽝 횟수: " + failCnt);
		System.out.println("---------------------------------------");
		System.out.println("1등까지 사용한 금액: " + (buyLotto*1000) + "원");
		System.out.println(buyLotto + "번 구매함");
		
	}

}





