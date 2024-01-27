package kr.or.ddit.study03;

import java.util.Scanner;

public class UnaryOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		UnaryOperator obj = new UnaryOperator();
		// obj.method1();
		obj.method2();
	}
	
	public void method2() {
		/*
		 * 즘감 연산자.
		 * ++변수: 다른 연산을 수행하기 전에 1을 증가시킴
		 * 변수++: 다른연산을 수행한 후에 1을 증가시킴
		 * --변수: 다른 연산을 수행하기 전에 1을 감소시킴
		 * 변수--: 다른연산을 수행한 후에 1을 감소시킴
		 */

		// val = val + 1;
		// val += 1;
		// val ++;
		int val = 10;
		// int res = ++val;
		val += 1;
		int res = val;
		System.out.println("val: \t" + val);
		System.out.println("res: \t" + res);

		val = 10;
		res = val++;
		System.out.println("val: \t" + val);
		System.out.println("res: \t" + res);

		val = 10;
		res = --val;
		System.out.println("val: \t" + val);
		System.out.println("res: \t" + res);

		val = 10;
		res = val;
		System.out.println("val: \t" + val);
		System.out.println("res: \t" + res);

	}
	
	public void method1() {
		// 부호 연산자
		int num=100;
		int res=+num;
		System.out.println(num);
		System.out.println(res);
	}
}
