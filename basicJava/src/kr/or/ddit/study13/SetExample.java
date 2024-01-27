package kr.or.ddit.study13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {

		// HashSet
		// Set 타입의 대표 컬랙션

		// key로 이루어짐
		// key 값은 중복을 허용하지 않고 순서가 보장되지 않음

		// 주요 메서드
		// .add(key) <- 값 추가
		// .remove(key) <-값 삭제
		// .contains(key) <- 포함 여부 true / false
		// .iterator(); <-전체 출력을 위한 이터레이터

		// 같은 방법임 import는 둘다 따로 해줘야함
		// HashSet > Class
		HashSet set = new HashSet();
		// Set > interface
		Set _set = new HashSet();

		set.add(1);
		set.add("a");
		set.add(10.5);
		set.add("가");
		set.add("가");
		set.add("라");

		set.remove("라");

		System.out.println(set.contains("가"));

		// inport주의!! > util로 해야함
		// 순서보장 x, 중복 허용 x
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		Set lotto = new HashSet();
		while (lotto.size() < 6) {
			lotto.add(new Random().nextInt(45) + 1);
		}

		Iterator it2 = lotto.iterator();
		// 다음값이 있는지 확인하는 메서드 > .hasNext()
		while (it2.hasNext()) {
			System.out.print(it2.next() + "\t");
		}
		
	}
}
