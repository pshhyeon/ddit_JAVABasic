package kr.or.ddit.study02.sec03;

import java.util.Scanner; // import: 필요한 클래스를 로딩하는것

public class TypeChange3 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TypeChange3 obj = new TypeChange3();
		// obj.method1();
		obj.method2();
		// obj.method3();
	}

	public void method3() {
		System.out.println("숫자를 입력하세요.");
		String num = sc.next();
		int i = Integer.parseInt(num)+5;
		System.out.println(i);
	}
	
	public void method2() {
		/*
		 * 국어 영어 수학 점수 입력 받은 후
		 * 
		 * 총점과, 평균을 구하시오.
		 */
		System.out.println("국어 점수: ");
		String kor = sc.next();
		System.out.println("영어 점수: ");
		String eng = sc.next();
		System.out.println("수학 점수: ");
		String math = sc.next();
		int sum = Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(math);
		double avg =  sum / 3.0;
		System.out.println("국어: " + kor + "\t영어: " + eng + "\t수학: " + math + "\t총점: " + sum + "\t평균: " + avg);

	}

	public void method1() {
		/*
		 * 국어 영어 수학 점수 입력 받기.
		 */
		System.out.println("국어 점수: ");
		String kor = sc.next();
		System.out.println("영어 점수: ");
		String eng = sc.next();
		System.out.println("수학 점수: ");
		String math = sc.next();
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
	}
}
