package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork04 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork04 obj = new HomeWork04();
		obj.process();
		
	}

	public void process() {
		/*
		 * 가위, 바위, 보 0 1 2
		 * 
		 * 컴퓨터가 가위,바위,보를 랜덤으로 뽑게하고 내가 입력한 숫자랑 비교해서
		 * 
		 * 이겼으면 이겼다 졌으면 졌다 비겼으면 비겼다 출력
		 * 
		 * ex) com: 0, user: 1 ->컴퓨터: 가위, 유저: 바위 당신이 이겼습니다.
		 */
		System.out.println("0(가위), 1(바위), 2(보)중에 정수하나를 입력해주세요");
		int userNum = sc.nextInt();
		int comNum = (int) (Math.random() * 3);
		String com = "";
		String user = "";

		switch (comNum) {
		case 0:
			com = "가위";
			break;
		case 1:
			com = "바위";
			break;
		case 2:
			com = "보";
			break;
		default:
			break;
		}
		switch (userNum) {
		case 0:
			user = "가위";
			break;
		case 1:
			user = "바위";
			break;
		case 2:
			user = "보";
			break;
		default:
			System.out.println("잘못입력했습니다.");
			System.exit(0);
			break;
		}
		boolean userWin = comNum == 0 && userNum == 1 || comNum == 1 && userNum == 2 || comNum == 2 && userNum == 0;
		
		System.out.printf("컴퓨터: %s, 유저: %s\n", com, user);
		if (comNum == userNum) {
			System.out.println("비김.");
		} else if (userWin) {
			System.out.println("당신이 이김.");
		} else {
			System.out.println("당신이 짐.");
		}
	}
}
