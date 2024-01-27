package kr.or.ddit.study02.sec03;

public class TypeChange {
	public static void main(String[] args) {
		// byte < short < int < long < float < double

		// 자동 타입변환
		// 작은 범위 -> 큰범위
		int i = 10;
		long l = i;
		System.out.println("long 타입입니다. " + l);

		// 강제 타입 변환
		// 큰 범위 -> 작은 범위
		// type 변수명 = (type)변수명;
		long l2 = 1000;
		int i2 = (int) l2;
		System.out.println("int 타입입니다. " + l2);

		/*
		 * double -> int 타입 변환 해보기.
		 */
		double d = 1000.789;
		int i3 = (int) d;
		System.out.println("double -> int 타입변환. " + d + ", " + i3);

		/*
		 * int -> double 타입 변환 해보기
		 */
		int i4 = 2;
		double d2 = i4;
		System.out.println("int -> double 타입변환. " + i4 + ", " + d2);

		/*
		 * char -> int 타입 변환 해보기
		 */
		char ch = 'a';
		int i5 = ch;
		System.out.println("char -> int 타입변환. " + ch + ", " + i5);

		/*
		 * int -> char 타입 변환 해보기
		 */
		int i6 = 97;
		char ch2 = (char) i6;
		System.out.println("int -> char 타입변환. " + i6 + ", " + ch2);

		/*
		 * 소문자 a를 대분자 A로 변환하기.
		 */
		char c8 = 'a';
		System.out.println((int) 'a' + "," + (int) ('A'));
		char c8_1 = (char) (c8 - 32);
		System.out.println("소문자 -> 대문자 타입 변환. " + c8 + ", " + c8_1);

		/*
		 * 대분자 D를 소문자 d로 변환하기.
		 */
		char c9 = 'D';
		System.out.println((int) 'D' + "," + (int) ('d'));
		char c9_1 = (char) (c9 + 32);
		System.out.println("소문자 -> 대문자 타입 변환. " + c9 + ", " + c9_1);

		/*
		 * int -> String 변환하기.
		 */
		int i10 = 7;
		double d10 = 7.5;
		String s10 = i10 + d10 + "";
		System.out.println(s10);
		// 순서가 바뀌면 원하는 결과값이 나오지 않을 수 도 있기 때문에 ""+는 앞에 작성하는것이 좋다
		s10 = "" + i10;
		s10 = String.valueOf(i10) + String.valueOf(d10);
		System.out.println("int -> String 타입 변환. " + i10 + ", " + s10);

	}
}
