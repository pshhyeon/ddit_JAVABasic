package kr.or.ddit.study05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample03 obj = new ArrayExample03();
//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();
	}

	public void method4() {
		// Array 배열 관련된 처리를 해주는 클래스

		int arr[] = { 4, 2, 3, 5, 1 };

		// 배열안에 값을 문자열로 변환
		// Array.toString
		System.out.println(Arrays.toString(arr));

		// 배역 값을 정렬
		// Array.sort
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public void method1() {
		// 1차원 배열
		// 2차원 배열
		int num1[] = { 1, 2, 3 };
		int num2[] = { 2, 3, 4 };

		int arr[][] = new int[2][3];
		arr[0] = num1;
		arr[1] = num2;
		System.out.println(arr);
		System.out.println(num1);
		System.out.println(num2);

		System.out.println(arr[0][0]);
		System.out.println(arr[1][2]);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public void method2() {
		// 1차원 배열 건너뛰기
		int arr[][] = new int[3][];

		int score1[] = { 100, 90, 80, 80 };
		int score2[] = { 91, 81, 72, 67 };
		int score3[] = { 84, 62, 90, 80, 40 };

		arr[0] = score1;
		arr[1] = score2;
		arr[2] = score3;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void method3() {
		// 국어, 영어, 수학 점수
		String name[] = { "홍길동", "강감찬", "이순신" };
		int scores[][] = { { 80, 75, 87 }, { 88, 90, 91 }, { 77, 73, 65 } };

		// 이순신의 수학점수 출력해보기
		System.out.println(scores[2][2]);
		int lee[] = scores[2];
		System.out.println("이순신 수학점수: " + lee[2]);
		for (int i = 0; i < name.length; i++) {
			if (name[i].equals("이순신"))
				System.out.printf("%s 수학점수: %d", name[i], scores[2][2]);
		}

		// 홍길동의 국어점수 출력해뵉
		System.out.println(scores[0][0]);

		// 3명의 국어점수 평균 구하기
		int avg = 0;
		for (int i = 0; i < scores.length; i++) {
			avg += scores[i][0];
		}
		System.out.println("국어점수 평균: " + avg / scores.length);

		int avg2 = 0;
		// 강감찬의 점수 평균 구하기
		for (int i = 0; i < scores[1].length; i++) {
			avg2 += scores[1][i];
		}
		System.out.println("강감찬 점수 평균: " + avg2 / scores[1].length);
	}

}
