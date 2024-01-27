package kr.or.ddit.study06;

// 다른 패키지에있기 때문에 import를 해야한다
import kr.or.ddit.study06.sec06.PrivateTest;

public class PrivateTest3 {
	public static void main(String[] args) {
		int a = PrivateTest.a;

		// b는 아무것도 작성하지 않아서 defalt로 설정되어있기 떄문에
		// 같은 프로젝트(같은 패키지에 소속된 클래스)에서만 사용할 수 있다
		int b = PrivateTest.b;

		// c는 private로 접근이 설정되어있어 클래스 내부에서만 사용가능하다
		int c = PrivateTest.c;
	}
}
