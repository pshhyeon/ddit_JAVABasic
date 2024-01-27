package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork02 obj = new HomeWork02();
		 obj.method1();
		// obj.method2();
		// obj.method3();
		// obj.method4();
	}
	
	public void method1() {
		/*
		 *   실수 데이터를 입력 받은후 
		 *   *100 한후 정수 부분만 출력해보기. 
		 */
		System.out.println("실수 데이터를 입력하세요.");
		String num = sc.next();
		int result = (int) (Double.parseDouble(num) * 100);
		System.out.println(result);
	}
	
	public void method2() {
		/*
		 *   소수점 2째 자리까지 출력.
		 */
		System.out.println("실수 데이터를 입력하세요.");
		String num = sc.next();
		double d = Double.parseDouble(num);
		System.out.printf("%.2f", d);
	}
	
	public void method3() {
		/*
		 *   num1 에 num2 값을 나눈후 *2000 한 값을 출력.
		 *   num1 = 3 
		 *   num2 = 2 
		 *   -> 결과 값 3000
		 */
		
		System.out.println("num1: ");
		String num1 = sc.next();
		System.out.println("num2: ");
		String num2 = sc.next();
		double d = Double.parseDouble(num1) / Double.parseDouble(num2) * 2000;
		int i = (int) d;
		System.out.println(i);
	}
	
	public void method4() {
		/*
		 * 	 심화 과제
		 *   (생략 가능  if 문 사용 하지 않고.)
		 *   소수점 2째 자리에서 반올림 하기.
		 */
		System.out.println("실수 입력: ");
		String num = sc.next();
		
		// 1.
		double d = Double.parseDouble(num);
		double result = (int) ((d + 0.05) * 10) / 10.0;
		System.out.println(result);
		
		
		/*
		// 2.
		double d = Double.parseDouble(num);
		String result =String.format("%.1f", d);
		System.out.println(result);
		*/
		
		/*
		// 3. 
		double d = Double.parseDouble(num);
		double result = Math.round(d*10)/10.0;
		System.out.println(result);
		*/
	}
	
}
