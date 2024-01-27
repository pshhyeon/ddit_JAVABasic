package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork09 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork09 obj = new HomeWork09();
		obj.process();
	}

	public void process() {
		// 5명의 3과목 성적과 이름을 배열에 저장하고
		// 총점, 평균, 등수를 구하여 출력하시오
		String[] stName = { "ㄱㄱㄱ", "ㄴㄴㄴ", "ㄷㄷㄷ", "ㄹㄹㄹ", "ㅁㅁㅁ" };
		int score[][] = { { 80, 70, 80, 0, 0, 1 }, { 90, 85, 90, 0, 0, 1 }, { 90, 70, 75, 0, 0, 1 },
				{ 65, 75, 70, 0, 0, 1 }, { 80, 80, 70, 0, 0, 1 } };

		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			// 총점 계산
			for (int j = 0; j < 3; j++) {
				sum += score[i][j];
			}
			score[i][3] = sum;
		}

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length; j++) {
				// 평균계산
				score[i][4] = score[i][3] / 3;
				// 등수 계산
				if (score[i][3] < score[j][3]) {
					score[i][5]++;
				}
			}
			System.out.printf("%s\t총점: %d, 평균: %d, 등수: %d\n", stName[i], score[i][3], score[i][4], score[i][5]);
		}
		System.out.println("\n정렬후 --------------------------------------\n");
		// 정렬하기
		for (int i = 0; i < score.length - 1; i++) {
			boolean flag = true;
			for (int j = 0; j < score.length - 1; j++) {
				if (score[j][4] < score[j + 1][4]) {
					int temp[] = score[j];
					score[j] = score[j + 1];
					score[j + 1] = temp;
					String sTemp = stName[j];
					stName[j] = stName[j + 1];
					stName[j + 1] = sTemp;
					flag = false;
				}
			}
			if (flag)
				break;
		}
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%s\t총점: %d, 평균: %d, 등수: %d\n", stName[i], score[i][3], score[i][4], score[i][5]);
		}

	}

}
