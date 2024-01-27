package kr.or.ddit.homework;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HomeWork17 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork17 obj = new HomeWork17();
		// 달력 만들기
		obj.process();
	}

	// 캘린더 객체 Calendar cal = Calendar.getInstance();
	// cal.set(Calendar.YEAR, 2022); //달력의 년도 설정
	// cal.set(Calendar.MONTH, 2); // 달력의 년도 설정 !!달은 0부터 시작!!
	// cal.set(Calendar.HOUR, 1); // 달력의 시간 설정 1: 1시 / -1: 23시
	// cal.add(Calendar.DATE, -100); // 현재날짜부터 100일전
	// Date d = cal.getTime();

	public void process() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2024);
		cal.set(Calendar.MONTH, 0);
		while (true) {
			int lastDay = cal.getActualMaximum(Calendar.DATE); // 월 마지막 일

			cal.set(Calendar.DATE, 1);
			
			// 현재 날짜 
			int year = cal.get(Calendar.YEAR);	// 2024년
			int month = cal.get(Calendar.MONTH) + 1; // 0 + 1 월
			int day = cal.get(Calendar.DAY_OF_WEEK); // 월요일 > 2
			System.out.println("---------------------------------------------------");
			System.out.println("                      " + year + "." + month);
			System.out.println("---------------------------------------------------");
			System.out.println("    <이전달                                                                          다음달>");
			System.out.println("---------------------------------------------------");
			System.out.println(" 일\t 월\t 화\t 수\t 목\t 금\t 토");

			// 공백
			for (int i = 1; i < day; i++) {
				System.out.print("\t");
			}

			// 날짜
			for (int i = 1; i <= lastDay; i++) {
				System.out.printf("%2d\t", i);
				if ((i + day - 1) % 7 == 0) {
					System.out.println();
				}
			}
			System.out.println();
			
			// 이전 or 다음 달 이동
			String input = sc.next();
			if (input.equals(">")) {
				cal.add(Calendar.MONTH, 1);
			}
			if (input.equals("<")) {
				cal.add(Calendar.MONTH, -1);
			}
		}
	}

}
