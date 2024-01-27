package kr.or.ddit.study04;

import java.util.Scanner;

public class ForExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample obj = new ForExample();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
		obj.method6();
	}

	public void method6() {
		System.out.println("입력: ");
		// 내가 입력한 알파벳으로부터 z까지 출력
		String str = sc.next();
		// charAt 활용
		// 초기값이 설정되어 있으면 for()에 넣지 않아도 된다
		char ch = str.charAt(0);
		for (; ch <= 'z'; ch++) {
			System.out.print(ch);
		}
	}

	public void method5() {
		// a부터 z까지 출력
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch);
		}
	}

	public void method4() {
		// 1~10까지의 홀수의 합
		int sum = 0;
//		for (int i = 0; i <= 10; i++) {
//			if (i % 2 == 1) {
//				sum += i;
//			}
//		}
		for (int i = 1; i <= 10; i = i + 2) {
			sum += i;
		}
		System.out.println("홀" + sum);

		// 1~10까지의 짝수의 합
		int sum2 = 0;
//		for (int i = 1; i <= 10; i++) {
//			if (i % 2 == 0) {
//				sum2 += i;
//			}
//		}
		for (int i = 2; i <= 10; i += 2) {
			sum2 += i;
		}
		System.out.println("짝" + sum2);

	}

	public void method3() {
		/*
		 * 10~20까지의 합
		 */
		int sum = 0;
		for (int i = 10; i <= 20; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	public void method2() {
		/*
		 * 1~10까지의 합을 더하시오
		 */
		int sum = 1;
		for (int i = 0; i < 10; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	public void method1() {
		/*
		 * 1~10까지의 합을 더하시오
		 */
		int cnt = 1;
		int sum = 0;
		sum += cnt++;
		sum += cnt++;
		sum += cnt++;
		sum += cnt++;
		sum += cnt++;
		sum += cnt++;
		sum += cnt++;
		sum += cnt++;
		sum += cnt++;
		sum += cnt++;

		System.out.println(sum);

	}
}
