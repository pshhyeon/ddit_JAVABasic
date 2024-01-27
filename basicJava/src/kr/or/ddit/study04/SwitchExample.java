package kr.or.ddit.study04;

import java.util.Scanner;

public class SwitchExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SwitchExample obj = new SwitchExample();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
		obj.method5();
	}
	
	public void method5() {
		/*
		 * switch문을 이용해서
		 * 끝자리가 31(나머지)인 달인지
		 * 		 30 (4, 6, 9, 11),
		 * 		 28, 29 (2)인지 출력할 것
		 */
		System.out.println("월을 입력");
		int month = sc.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("끝자리가 31일");
			break;
		case 2:
			System.out.println("끝자리가 28일 또는 29일");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("끝자리가 30일");
			break;
		default:
			System.out.println("잘못 입력");
			break;
		}
	}

	public void method4() {
		/*
		 * 학점
		 * A~F
		 * switch문에서는 부등호 처리가 안된다.
		 * switch문도 이중문, 삼중문... 으로 조건을 만들수 있다
		 */
		
		System.out.println("점수: ");
		int score = sc.nextInt();
		String grade = "";

		switch (score / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
			break;
		}
		
		switch (grade) {
		case "F":
			break;
		default:
			switch (score % 10) {
			case 9:
			case 8:
			case 7:
				grade += "+";
				break;
			case 6:
			case 5:
			case 4:
			case 3:
				grade += "0";
				break;
			default:
				grade += "-";
				break;
			}
			break;
		}
				System.out.printf("점수: %d, 등급: %s", score, grade);

	}
	
	public void method3() {
		System.out.println("국가명 입력");
		String nation = sc.next();
		switch (nation) {
		case "kor":
			System.out.println("한국 입니다");
			break;
		case "jp":
			System.out.println("일본입니다");
			break;
		case "chn":
			System.out.println("중국입니다");
			break;
		default:
			break;
		}
	}
	
	public void method2() {
		/*
		 * 회원 등급 나누는 프로그램.
		 */
		System.out.println("회원 등급을 입력하세요 1~3");
		int grade = sc.nextInt();
		switch (grade) {
		case 1:
			System.out.println("vip");
			break;
		case 2:
			System.out.println("우수");
			break;
		case 3:
			System.out.println("일반");
			break;
		default:
			System.out.println("잘못 입력됨.");
			break;
		}
		
	}
	
	public void method1() {
		/*
		 * switch문
		 * 변수가 어떤 값을 갖는가에 따라 실행문 선택
		 * if문 보다 코드가 간결함
		 * 
		 * switch(변수){
		 * 		case 값1:
		 * 			break;
		 * 		case 값2:
		 * 			break;
		 * 		default
		 * }
		 */		
	}
}





