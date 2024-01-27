package kr.or.ddit.study06.sec06;

public class PrivateTest2 {

	public static void main(String[] args) {
		int a = PrivateTest.a;
		int b = PrivateTest.b;
		// c는 private로 접근이 설정되어있어 클래스 내부에서만 사용가능하다
		int c = PrivateTest.c;
	}
}
