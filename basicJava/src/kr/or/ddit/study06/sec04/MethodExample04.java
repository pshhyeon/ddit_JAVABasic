package kr.or.ddit.study06.sec04;

public class MethodExample04 {
	public static void main(String[] args) {
		MethodExample04 me = new MethodExample04();
		me.method();
		me.method(1);
		me.method("test");
		me.method(1, 2);
	}

	public void method() {
		System.out.println("1");
	}

	public void method(int a) {
		System.out.println("2");
	}

	public void method(String s) {
		System.out.println("3");
	}

	public void method(int a, int b) {
		System.out.println("4");
	}
	// 오버로딩이란 파라미터에 따라 호출되는 메서드가 다른것을 말한다.
	// 오버라이딩이란 부모클래스에서 정의해놓은 내용을 재정의 한다.
}
