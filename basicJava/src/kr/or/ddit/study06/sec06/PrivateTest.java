package kr.or.ddit.study06.sec06;

public class PrivateTest {
	static public int a;
	static int b;
	static private int c;

	public static void main(String[] args) {
		int a = PrivateTest.a;
		int b = PrivateTest.b;
		int c = PrivateTest.c;
	}
}
