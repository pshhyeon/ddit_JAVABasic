package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork03 obj = new HomeWork03();
		obj.question1();
		// obj.question2();
	}
	public void question2() {
		/*
		 * &&, ||, ! 이용해보기
		 * 
		 * 윤년: 4의 배수
		 * 		100의 배수 x
		 * 		400의 배수 o
		 * 
		 * 4, 8, 12, 16 <- 윤년
		 * 100, 200, 300, 500 <- 윤년 x
		 * 400, 800, 1200 <-윤년
		 * 
		 */
		System.out.println("년도를 입력: ");
		int year = sc.nextInt();
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}
	}

	public void question1() {
		/*
		 * 정수 하나를 설정하고 키보드로 임의의 수를 입력받아
		 * 입력받은수가  크면  -> "더 작은 수를 입력하세요"
		 * 			작으면 -> "더 작은 수를 입력하세요"
		 * 			같으면 -> 종료
		 * 설정된 값과 같은 값을 얼마만에 맞추는지를 출력하시오
		 */
		int question = 120;
		int cnt = 0;
		int input;
		while (true) {
			System.out.print("정수 하나를 입력하세요: ");
			input = sc.nextInt();
			cnt++;
			if (question < input) {
				System.out.println("더 작은수를 입력하세요.");
			}
			if (question > input) {
				System.out.println("더 큰수를 입력하세요.");
			}
			if (question == input) {
				System.out.println("정답입니다. 시도횟수: " + cnt);
				break;
			}
		}
	}
}
