package kr.or.ddit.study11;

import java.io.File;

public class StringLang {
	public static void main(String[] args) {
		StringLang s1 = new StringLang();
//		s1.method1();
//		s1.method2();
//		s1.method3(); // 공부
//		s1.method4();
//		s1.method5(); // 공부
//		s1.method6(); // 공부
//		s1.method7(); // 공부
		s1.method8();

	}

	public void method8() {
		String test = "스플릿 테스트, test1, test2, test3, test4";
		// 문자열 나누기 String.split(기준 문자열)
		String tokens[] = test.split(",");
		for (String s : tokens) {
			System.out.println(s.trim());
		}
	}

	public void method7() {
		String str = null;
		// 꼭 null체크도 같이 사용해야함
		// 조건문에 조건의 순서도 지켜줘야함 null체크 먼저 작성후 isEmpty() 체크
		//
		if (str == null || str.isEmpty()) {
			System.out.println("해당 문자열은 비어있습니다.");
		}
	}

	public void method6() {
		String test = "가나다라마18";
		// string.replace("원본 문자열","변경 문자열")
		test = test.replace("18", "**");
		test = test.replace("가나다라마**", "*****18");
		System.out.println(test);

		// 궁금하면 따로 공부하기
		// 정규식을 통해 바꿈
		// test.replaceAll(regex, replacement);
	}

	public void method5() {
		String test = "문자 테스트             \n       \r";
		System.out.println(test);
		System.out.println("----------");
		test = test.trim(); // 앞뒤 공백, 줄바꿈 제거
		System.out.println(test);
		System.out.println("----------");
	}

	public void method4() {
		String test = "소문자 aBcD";
		if (test.contains("aBcD")) {
			System.out.println("포함");
		}
		System.out.println(test);
		test = test.toUpperCase();
		System.out.println(test);

		System.out.println("----------------");
		test = "대문자ABCD";
		System.out.println(test);
		test = test.toLowerCase();
		System.out.println(test);
	}

	public void method3() {
		String test = "문자열text입니다";
		String start = "문자열";
		if (test.startsWith(start)) {
			System.out.println(start + "로 시작합니다");
		}
		String end = "입니다";
		if (test.endsWith(end)) {
			System.out.println(end + "로 끝납니다");
		}
		// 2024년으로 시작하는 엑셀 파일 개수를 구하시오
		int cnt = 0;
		File dir = new File("D:\\"); // "파일경로
		for (String s : dir.list()) {
			if (s.startsWith("2024"))
				continue;
			if (s.endsWith(".xls") || s.endsWith(".xlsx")) {
				cnt++;
			}
		}
	}

	public void method2() {
		String test = "문자열 test입니다";
		String search = "test";
		if (test.contains(search)) {
			System.out.println(search + ": 값이 포함되어 있습니다.");
		}
		search = test;
		if (test.equals(search)) {
			System.out.println(search + ": 값이 동일합니다");
		}
	}

	public void method1() {
		String test = "문자열 test입니다";

		for (int i = 0; i < test.length(); i++) {
			System.out.println(test.charAt(i));
		}

		for (char c : test.toCharArray()) {
			System.out.println(c);
		}
	}
}
