package kr.or.ddit.study06.sec04;

public class MethodExample03 {
	public static void main(String[] args) {
		MethodExample03 me = new MethodExample03();
		me.method1();
	}

	public void method1() {
		System.out.println("method1");
		method2();
	}

	public void method2() {
		System.out.println("method2");
		method3();
	}

	public void method3() {
		System.out.println("method3");
	}
}
