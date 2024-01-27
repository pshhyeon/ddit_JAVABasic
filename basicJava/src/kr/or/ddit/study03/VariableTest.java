package kr.or.ddit.study03;

import java.util.Scanner;

public class VariableTest {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		VariableTest obj = new VariableTest();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
		obj.method6();
	}
	private void method1() {
		// 기본타입을 각각 선언해보고 갑을 저장 할 것
		// 8가지  
		// System.out.println 을 이용해서 출력까지 해보자.
		
		// 정수형 byte ~
		
		// 바이트 = 8bit 프로그램 기본단위로 많이 사용  
		
		byte b = 10;
		short sh = 127;
		int i = 1000;
		long l = 10000000;
		float f = 0.21f;
		double d = 0.21;
		char c = 97;
		boolean bo= true;
		System.out.println("byte: " + b + "\nshort: " + sh + "\nint: " + i + "\nlong: " + l + "\nfloat: " + f
				+ "\ndouble: " + d + "\nchar: " + c + "\nboolean: " + bo);
		
		
	}
	

	private void method2() {
		/*
		 *  각 데이터를 형변환 하고 출력 하시오.
		 */
		// char -> int 
		char c1 = 'a';
		int i1 = c1;

		// int -> char
		int i2 = 95;
		char c2 = (char) i2;

		byte bte = 100;
		// char ch = bte; 
		// byte는 -값을 포함하고 있기때문에 char에 넣을 수 없다 그래서 강제 형변환을 시켜서 넣어야한다.

		// int -> double
		int i3 = 100;
		double d3 = i3;
		// int 값 변수 a,b 를 나누기 연산후 double로 저장
		int a = 10;
		int b = 7;
		double d4 = (double) a / b;

		// char -> String
		char ch5 = 'a';
		String s5 = "" + ch5;
		s5 = String.valueOf(ch5);

		// c3_1 + c3_2 값을 문자열에 저장
		char ch3_1 = 'a';
		char ch3_2 = 'b';
		String s6 = "" + ch3_1 + ch3_2;
		
		// charAt 문자열 -> 문자
		// 0번부터 시작함
		char ch6=s6.charAt(0);
		
		System.out.println("");
	}
	
	private void method3() {
		// Math.random
		// 0~0.9999999999999999 범위 값.
		// *10은 범위 값  +1은 시작 값.
		// (int)(Math.random()*10)+1
		
//		int ran = (int)(Math.random()*100)+1;
//		System.out.println(ran);
		
		/*
		 *  11~20 범위 랜덤 숫자 만들기.
		 */
		int ran = (int) (Math.random() * 10) + 11;
		
		/*
		 * 양꼬치는 1인분에 12000원 음료수는 2000원 입니다. 
		 * 양꼬치 n개와 음료수 k 를 먹었다면 총 얼마를 지불해야 하는지 
		 * 출력해보세요.
		 * n 값은 1~10 
		 * k 값은 1~3
		 */
		
		int n = (int)(Math.random()*10)+1;
		int k = (int)(Math.random()*3)+1;

		// 결과값 저장 할 곳
		int result = (12000 * n) + (2000 * k);
		System.out.println("양꼬치: " + n + "개\n음료수: " + k + "개\n총 " + result + "원");
	}
	
	private void method4() {
		/*
		 * 정수 num1, num2 랜덤한 변수(1~50)로 주어질때
		 * num1을 num2로 나눈 나머지와 몫을 출력하세요.
		 */
		int num1 = (int)(Math.random()*50)+1;
		int num2 = (int)(Math.random()*50)+1;
		
		// 몫(quotient) : 정수형 데이터 이기 때문에 소수점 값 자동 생략됨.
		int re1 = num1 / num2;
		// 나머지(remainder)
		int re2 = num1 % num2;
		System.out.printf("num1: %d, num2: %d", num1, num2);
		System.out.printf("몫: %d, 나머지: %d", re1, re2);
		
	}
	private void method6() {
		/*
		 * 두 정수에 대한 연산으로 두정수를 붙여서 쓴 값을 출력합니다. 
		 * 예를 들면 다음과 같습니다.
		 * a = 12,  b =3
		 * 12 ☆ 3 = 123
		 * 3  ☆ 12 = 312 
		 * 
		 *  양의 정수 a와 b가 주어졌을때 
		 *  a ☆ b 와 b ☆ a 값중 더 큰값을 출력하세요 
		 */
		int a = (int) (Math.random() * 100) + 1;
		int b = (int) (Math.random() * 100) + 1;

		int ab_int = Integer.parseInt("" + a + b);
		int ba_int = Integer.parseInt("" + b + a);

		int result = ab_int > ba_int ? ab_int : ba_int;
		System.out.printf("a: %d, d: %d\n", a, b);
		System.out.printf("결과값: %d", result);

	}
}
