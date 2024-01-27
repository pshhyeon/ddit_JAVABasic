package kr.or.ddit.study04;

import java.util.Scanner;

public class ForExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample02 obj = new ForExample02();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
		obj.method5();
	}

	public void method5() {
		/*
		 * 홀수만 출력해보기
		 */
		for (int i = 1; i < 20; i++) {
			/*
			 * if (i % 2 == 1) { System.out.println(i); }
			 */
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

	public void method4() {
		/*
		 * 전체 구구단 출력하기
		 */
		System.out.println("구구단");
		for (int i = 1; i <= 9; i++) {
			System.out.println("----"+i + "단----");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
	}
	public void method3() {
		/*
		 * 입력받은 숫자로 구구단을 만드시오
		 * 
		 * ex 3) 3*1 3*2 . . . 3*9
		 */
		System.out.println("1~9 정수 하나 입력: ");
		int num = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}
	}

	public void method2() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void method1() {
		/*
		 * 영어를 입력한 후 영어에 포함된 모음의 개수를 구해보시오
		 */
		System.out.println("입력: ");
		String str = sc.next();

		// 문자열의 길이
		int length = str.length();
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(ch);
				cnt++;
				break;
			}
		}
		System.out.println(cnt);

	}
}
