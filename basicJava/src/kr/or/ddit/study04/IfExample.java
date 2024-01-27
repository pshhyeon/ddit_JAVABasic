package kr.or.ddit.study04;

import java.util.Scanner;

public class IfExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		IfExample obj = new IfExample();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
		obj.method5();
	}
	
	public void method5() {
		boolean flag = false;
		if (flag) {
			System.out.println("실행1");
			System.out.println("실행1-1");
		}
		if (flag) System.out.println("실행2");
				  System.out.println("실행2-1");
		// if문이나 for문에서 실행문 1줄까지는 중괄호 없이 실행가능 
	}
	
	public void method4() {
		/*
		 * 0~2 -
		 * 3~6 0
		 * 7~9 +
		 * 90점 이상 A
		 * 80점 이상 B
		 * 70점 이상 C
		 * 60점 이상 D
		 * 60점 미만 F
		 */
		System.out.println("점수입력: ");
		int score = sc.nextInt();
		String grade = "";
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		if (grade != "F") {
			if (score % 10 >= 7) {
				grade += "+";
			} else if (score % 10 >= 3) {
				grade += "0";
			} else {
				grade += "-";
			}
		}

		System.out.printf("점수: %d, 등급: %s", score, grade);
	}

	public void method3() {
		/*
		 * else if 사용
		 * 90점 이상 A
		 * 80점 이상 B
		 * 70점 이상 C
		 * 60점 이상 D
		 * 60점 미만 F
		 */
		System.out.println("점수입력: ");
		int score = sc.nextInt();
		String grade = "";
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.printf("점수: %d, 등급: %s", score, grade);
	}

	public void method2() {
		/*
		 * if만 사용
		 * 90점 이상 A
		 * 80점 이상 B
		 * 70점 이상 C
		 * 60점 이상 D
		 * 60점 미만 F
		 */
		System.out.println("점수입력: ");
		int score = sc.nextInt();
		String grade = "";
		if (score >= 90) {
			grade = "A";
		}
		if (score < 90 && score >= 80) {
			grade = "B";
		}
		if (score < 80 && score >= 70) {
			grade = "C";
		}
		if (score < 70 && score >= 60) {
			grade = "D";
		}
		if (score < 60) {
			grade = "F";
		}
		System.out.printf("점수: %d, 등급: %s", score, grade);
	}
	
	public void method1() {
		boolean flag = false;
		if (flag) {
			System.out.println("if문 실행");
		}
		System.out.println("if문 종료");
		System.out.println("method1 종료");
	}
}
