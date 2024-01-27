package kr.or.ddit.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import kr.or.ddit.study01.Add;

public class HomeWork19 {
	public static void main(String[] args) {
		HomeWork19 hw = new HomeWork19();
		int roll = 100;
		hw.printHistogram(roll);
	}

	// 1. 주사위 1개 던지는 메소드 만들기
	public int oneDice() {
		return new Random().nextInt(6) + 1;
	}

	// 2. 주사위 2개 던지는 메소드 만들기 -> 1메소드 활용
	public int twoDice() {
		return oneDice() + oneDice();
	}

	// 3. 주사위 2개를 여러번 던지는 메소드 만들기 -> 파라미터 int num
	public List<Integer> throwDice(int num) {
		List<Integer> l = new ArrayList();
		for (int i = 0; i < num; i++) {
			l.add(twoDice());
		}
		return l;
	}

	// 4. 주사위 2개를 num 만큼 실행한 결과 값을 출력하기 -> 3 메소드 활용
	public void printHistogram(int num) {
		List<Integer> l = throwDice(num);
		for (int i = 2; i <= 12; i++) {
			// 굴린 주사위의 숫자 합이 몇개인지 count
			int cnt = 0;
			for (int j : l) {
				if (i == j)
					cnt++;
			}
			// 2 ~ 12 중 각 숫자가 나온 확율
			int rate = cnt * 100 / l.size() ;
			String s = "";
			for (int j = 0; j < rate; j++) {
				s += "■";
			}

			System.out.printf("%2d: %s\n", i, s);
		}
	}
}
