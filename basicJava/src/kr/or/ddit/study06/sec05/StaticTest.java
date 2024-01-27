package kr.or.ddit.study06.sec05;

import java.util.Arrays;

public class StaticTest {
	int field = 10;
	static int static_field = 11;

	public static void main(String[] args) {
		StaticTest.s_method1();
		StaticTest.s_method2();
		System.out.println(StaticTest.static_field);

		// Arrays.sort() 메서드는 static 메서드이다
//		Arrays.sort();
	}

	public void method1() {

	}

	public void method2() {
		s_method1();
	}

	public static void s_method1() {
		StaticTest st = new StaticTest();
		st.method1();
		st.field++;
	}

	public static void s_method2() {
//		field++;
	}

}
