package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork07 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork07 obj = new HomeWork07();
//		obj.process1();
		obj.process2();
	}

	public void process2() {
		// 거스름돈을 올바르게 주는 프로그램
		// 75500 > 만원7개 5천 1개 오백 1개 50 1개

		int[] coin = { 10000, 5000, 1000, 500, 50, 10 };
		int[] count = new int[coin.length];
		System.out.print("총금액");
		int input = sc.nextInt();

		for (int i = 0; i < coin.length; i++) {
			count[i] = input / coin[i];
			input %= coin[i];
		}

		System.out.println("거스름돈");
		for (int i = 0; i < coin.length; i++) {
			if (count[i] > 0) {
				System.out.println(coin[i] + "원:\t" + count[i] + "개");
			}
		}

	}

	public void process1() {
		// 5개의 단어가 제공되며 이중 임의의 단어가 선택된다
		// 선택된 단어의 철자를 섞어 사용자에게 제시하며
		// 사용자는 이를 보고 원래의 단어를 입력한다
		// 사용자가 단어를 맞출때 까지 반복하여 단어를 맞추었을때
		// 시도횟수 출력

		String[] words = { "apple", "banana", "love", "hope", "permission" };
		int ran = (int) (Math.random() * words.length);
		// words 배열중에 랜덤한 값을 뽑기.
		String word = words[ran];
		int cnt = 0;
		String input = "";

		// 문자를 char배열로 변환
		// toCharArray
//		int a = 10;
//		int b = 7;
//		int temp = a;
//		a = b;
//		b = temp;

		char[] ch = word.toCharArray();
		for (int i = 0; i < 10000; i++) {
			int cRan = (int) (Math.random() * ch.length);
			char temp = ch[cRan];
			ch[cRan] = ch[0];
			ch[0] = temp;
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}

		while (input.equals(word) == false) {
			System.out.println("단어 입력");
			input = sc.next();
			cnt++;
		}
		System.out.println("시도횟수" + cnt);
	}
}
