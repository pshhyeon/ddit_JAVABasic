package kr.or.ddit.study11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateExample {
	static boolean deb = false;
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		DateExample de = new DateExample();
//		de.method1();
//		de.method2();
//		de.method3();
//		de.method4();
//		de.method5();
//		de.method6();
		de.method7();
	}

	private void method7() {
		// 캘린더 객체
		Calendar cal =Calendar.getInstance();
//		cal.set(Calendar.YEAR, 2022); // 달력의 년도 설정
//		cal.set(Calendar.MONTH, 2); // 달력의 년도 설정 !!달은 0부터 시작!! 
//		cal.set(Calendar.HOUR, 1); // 달력의 시간 설정 1: 1시 / -1: 23시
		
		cal.add(Calendar.DATE, -100); // 현재날짜부터 100일전
		
		Date d = cal.getTime();
		System.out.println(d);
	}

	private void method6() {
		// 오늘 날짜로부터 스캐너를 통해 입력 받은 날짜 만큼 더하기
		// ex) 10 -> 2024.01.27

		System.out.println("정수 입력");
//		long i = sc.nextInt();
		long i = 2147483647; // 2,147,483,647
		Date currentDay = new Date();
		Date d = new Date(currentDay.getTime() + i * 1000 * 60 * 60 * 24);
		System.out.println("현재 날짜: " + currentDay);
		System.out.println(i + "일뒤 날짜: " + d);

	}

	private void method5() {
		// 날짜를 입력받아서 현재시간과 몇일 차이나는지
		Date currentDate = new Date();
		Date d;

		System.out.println("날짜 입력: ex) yyyy.mm.dd");
//		String dateStr = sc.next();
		String dateStr = "2024.01.01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");

		try {
			d = sdf.parse(dateStr);

			long time = currentDate.getTime() - d.getTime();
			double day = (double) time / 86400 / 1000;
			System.out.println(day);

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	private void method4() {
		// String 타입 날짜형식을 Date 타입으로 변경하기
		String dateStr = "2024/01/17";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String dateStr2 = "2024.01.17";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd");
		// 날짜 형식을 맞춰서 작성해야함
		// 시분초를 작성하지 않으면 00시로 설정됨

		Date d;
		try {
			d = sdf.parse(dateStr);
			System.out.println(d);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	private void method3() {
		// SimpleDateFormat
		// String -> Date
		// Date -> String

		// Date 객체를 원하는 포맷으로 변경하는 클래스

		// 2024/01/17
		// 2024.01.17
		// 2024-01-17

		// 소문자 m: 분
		// 대문자 M: 월(달)
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String result = sdf.format(d); // date 객체를 넣으면 String 으로 반환

		System.out.println(result);

	}

	private void method2() {
		// 1970 년으로부터 얼마나 지났는지
		// 년 월 시 분 초로 표시해 보세요
		Date d = new Date();
		long time = d.getTime() / 1000;
		int min = 60;
		int hour = min * 60;
		int day = hour * 24;
		int year = day * 365;

		int years = (int) (time / year);
		time %= year;
		int days = (int) (time / day);
		time %= day;
		int hours = (int) (time / hour);
		time %= hour;
		int mins = (int) (time / min);
		int times = (int) (time % min);

		// 영국 기준시로 계산됨
		System.out.println(years + "년" + days + "일" + hours + "시간" + mins + "분" + times + "초");
	}

	private void method1() {
		Date d1 = new Date();
		System.out.println(d1);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Date d2 = new Date();
		System.out.println(d2);

		long time = d2.getTime() - d1.getTime();
		// d2와 d1의 시간 차이 단위 ms
		System.out.println(time / 1000);

		// 1970년1월1일 00:00부터 몇초 지났는지
		System.out.println(d1.getTime());
		System.out.println(d2.getTime());

	}

}
