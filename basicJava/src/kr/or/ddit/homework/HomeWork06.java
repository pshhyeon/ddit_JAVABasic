package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork06 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork06 obj = new HomeWork06();
//		obj.method1();
//		obj.method2();
		obj.method3();
	}
	
	public void method1() {
		/*
		 * 전체 구구단을 출력하시오
		 * 	2*1 =2     3*1 =3	... 9*1 =9
		 *  2*2 =4
		 *  :
		 */
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t", j, i, j * i);
			}
			System.out.println();
		}
	}
	
	public void method2() {
		/*
		 * 전체 구구단을 출력하는데 입력받은 구구단은 제외하고 출력
		 * 입력 3
		 * 	2*1 =2     4*1 =4	... 9*1 =9
		 *  2*2 =4
		 *  :
		 *  3단을 제외한 전체 구구단 출력
		 */
		System.out.println("1~9단중 제외할 단을 입력");
		int num = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j != num) {
					System.out.printf("%d * %d = %d\t", j, i, j * i);
				}
			}
			System.out.println();
		}
	}
	
	public void method3() {
		/*
		 * 입력 받은 값이 양의 정수이며
		 * 1. 홀수라면
		 * n이하의 홀수인 모든 양의 정수 총합
		 * ex 5) 1 + 3 + 5 
		 * 2. 짝수라면
		 * n이하의 짝수의 제곱 총합
		 * ex 6) 2*2 + 4*4 + 6*6
		 */
		System.out.println("정수 하나를 입력");
		int num = sc.nextInt();
		int sum = 0;
		if (num % 2 == 0) {
			for (int i = 2; i <= num; i += 2) {
				sum += i * i;
				System.out.printf("(%d * %d) + %d = %d\n", i, i,sum-i*i, sum);
			}			
		} else {
			for (int j = 1; j <= num; j += 2) {
				sum += j;
				System.out.printf("%d + %d = %d\n", sum - j, j, sum);
			}
		}
		System.out.println("총합: " + sum);
	}
}
