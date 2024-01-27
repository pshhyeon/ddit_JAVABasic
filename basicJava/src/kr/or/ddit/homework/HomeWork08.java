package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork08 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork08 obj = new HomeWork08();
		obj.process();
	}

	public void process() {
		// 5개의 점수를 입력받고
		// 길이가 5개짜리인 int배열에 값을 저장해보자
		// 그후에 1을 선택하면 오름차순 정렬
		// 2를 선택하면 내림차순 정렬
		// 정렬된 결과값을 출력
		System.out.println("점수 5개 입력: ");
		int score[] = new int[5];
		int select = 0;
		for (int i = 0; i < score.length; i++) {
			System.out.print(i + 1 + ". ");
			score[i] = sc.nextInt();
		}
		while (select != 1 && select != 2) {
			System.out.println("정렬 선택 1: 오름차순, 2: 내림차순");
			select = sc.nextInt();
			if (select == 1) {
				for (int i = 0; i < score.length - 1; i++) {
					boolean flag = true;
					for (int j = 0; j < score.length - 1; j++) {
						if (score[j] > score[j + 1]) {
							int temp = score[j];
							score[j] = score[j + 1];
							score[j + 1] = temp;
							flag = false;
						}
					}
					if (flag)
						break;
				}
			}
			if (select == 2) {
				for (int i = 0; i < score.length - 1; i++) {
					boolean flag = true;
					for (int j = 0; j < score.length - 1; j++) {
						if (score[j] < score[j + 1]) {
							int temp = score[j];
							score[j] = score[j + 1];
							score[j + 1] = temp;
							flag = false;
						}
					}
					if (flag)
						break;
				}
			}
			if (select != 1 && select != 2) {
				System.out.println("1또는 2로 다시 선택해주세요!");
			}
		}
		System.out.print("score[]: ");
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
	}
}
