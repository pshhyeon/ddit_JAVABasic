package kr.or.ddit.study02.sec04;

import java.util.Scanner;

public class PrintExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		PrintExample obj = new PrintExample();
		// obj.printLn();
		// obj.print();
		// obj.printf();
		obj.printf2();
	}

	public void printf2() {
		/*
		 * 정수 %d, 문자열 %s
		 * 나이와 이름 넣어보기.
		 */
		System.out.println("나이를 입력하세요: ");
		String age=sc.next();
		System.out.println("이름을 입력하세요: ");
		String name=sc.next();
				
		System.out.printf("나이: %d\n이름: %s", Integer.parseInt(age), name);
		}
	
	public void printf() {
		// System.out.printf("형식지정문자열", 변수 리스트);
		// 형식 문자열 > d: 정수, f: 실수, s: 문자열
		// -> "%%[[-|0]n]d 10진 정수
		// -> - 왼쪽정렬
		// -> 0 남은 왼쪽 빈공간에 0 채움
		System.out.printf("숫자: %d\n", 1000);
		System.out.printf("숫자: %8d\n", 1000);
		System.out.printf("숫자: %-8d\n", 1000);
		System.out.printf("숫자: %08d\n", 1000);
		}

	public void print() {
		// 줄바꿈 기능 X
		System.out.print("홍길동");
		System.out.print(" 34061");
		System.out.print("  대전시 중구 계룡로");
	}

	public void printLn() {
		// 줄바꿈 기능
		System.out.println("홍길동");
		System.out.println(" 34061");
		System.out.println("  대전시 중구 계룡로");
	}
}
