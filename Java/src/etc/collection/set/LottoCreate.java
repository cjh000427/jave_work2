package etc.collection.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoCreate {

	public static void main(String[] args) {

		Random r = new Random();
		/*   List를 활용하여 로또 번호 추첨하기 (중복발생 로직 필요)
		List<Integer> lotto = new ArrayList<>();

		int i = 0;
		while(i < lotto.size()) {
			int rn = r.nextInt(45) + 1;
			if(!lotto.contains(rn)) {
				lotto.add(rn);
				i++;
			}
		}
		 */

		// set을 활용하여 로또 번호 추첨하기
		Set<Integer> lotto = new HashSet<>();
		
		while(lotto.size() < 6) {
			int num = r.nextInt(45) + 1;
			lotto.add(num);
		}
		
		
		System.out.println(lotto);
		List<Integer> list = new ArrayList<>(lotto); // 변수lotto를 삽입하여 set에서 List로 변환.
		Collections.sort(list);
		System.out.println(list);




	}

}












