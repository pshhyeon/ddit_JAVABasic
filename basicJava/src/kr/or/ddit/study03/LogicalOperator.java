package kr.or.ddit.study03;

import java.util.Scanner;

public class LogicalOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		LogicalOperator obj = new LogicalOperator();
//		obj.method1();
		obj.method2();
//		obj.method3();

	}
	
	public void method1() {
		/*
		 * 논리연산자 : && . || . !
		 * A&&B : A,B 중 하나라고 거짓이면 거짓
		 * A || B : A,B 중 하나라도 참이면 참
		 * 
		 * A  1 1 0 0
		 * B  1 0 1 0
		 * && 1 0 0 0
		 * || 1 1 1 0
		 */

		boolean a = true;
		boolean b = false;

		System.out.println(a && !b);
		System.out.println(a || b);

	}
	
	
	public void method2() {
		System.out.println("점수를 입력해주세요");
		int score = sc.nextInt();

		if (score >= 90) {
			System.out.println("a학점");
		} else if (score >= 80 && score < 90) {
			System.out.println("B학점");
		} else if (score >= 70 && score < 80) {
			System.out.println("C학점");
		} else if (score >= 60 && score < 70) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}

	}
	
	public void method3() {
		/*
		 * & , | , ^ , ~
		 * 
		 *        &(and)
		 * 45 : 00101101
		 * 25 : 00011001
		 *      00001001 -> 9
		 *      
		 *        |(or)
		 * 45 : 00101101
		 * 25 : 00011001
		 *      00111101 -> 61
		 *        ^(xor)
		 * 45 : 00101101
		 * 25 : 00011001
		 *      00110100 -> 52
		 *        ~(not)
		 * 45 : 00101101
		 *      11010010
		 *      => -(10101101)+1 => -46
		 */

		int a = 45;
		int b = 25;
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);
		System.out.println(~a);
		
	}

}
