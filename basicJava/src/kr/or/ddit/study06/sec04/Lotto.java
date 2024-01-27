package kr.or.ddit.study06.sec04;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		Lotto l = new Lotto();
//		int[] lotto = l.generateLotto();
		int[][][] lotto = l.lottoBundle(17000);
		for (int[][] i : lotto) {
			for (int j = 0; j < i.length; j++) {
				System.out.print((j + 1) + ": " + Arrays.toString(i[j]) + "\t");
			}
			System.out.println(
					"\n===================================================================================="
					+ "====================================================================================");
		}

	}

	public int[][][] lottoBundle(int money) {
		int papers = money / 5000;
		if (money % 5000 != 0)
			papers++;
		int[][][] bundle = new int[papers][5][6];
		for (int i = 0; i < bundle.length; i++) {
			bundle[i] = lottoPaper();
		}
		if (money % 5000 != 0) {
			// money/1000%5
			// 17000 -> 17->2
			bundle[papers - 1] = lottoPaper(money / 1000 % 5);
		}
		return bundle;
	}

	public int[][] lottoPaper(int num) {
		int[][] paper = new int[num][6];
		for (int i = 0; i < paper.length; i++) {
			paper[i] = generateLotto();
		}
		return paper;
	}

	public int[][] lottoPaper() {
//		int[][] paper = new int[5][6];
//		for (int i = 0; i < paper.length; i++) {
//			paper[i] = generateLotto();
//		}
		return lottoPaper(5);
	}

	// 1차원 로또 배열 만들어 보기
	public int[] generateLotto() {
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			// 번호 뽑기
			int ran = new Random().nextInt(45) + 1;
			lotto[i] = ran;
			// 새로운 번호랑 기존번호 비교
			for (int j = 0; j < i; j++) {
				if (ran == lotto[j]) {
					// 기존 번호랑 같다면 다시뽑기
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		return lotto;
	}

}
