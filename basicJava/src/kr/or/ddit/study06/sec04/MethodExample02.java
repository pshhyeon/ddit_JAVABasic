package kr.or.ddit.study06.sec04;

public class MethodExample02 {
	public static void main(String[] args) {
		MethodExample02 me = new MethodExample02();
		me.method1(10);
		me.method2("test");
		me.method3(10, 20);
	}

	public void method1(int a) {
		System.out.println("메소드1에서 받은 파라미터: " + a);
	}

	public void method2(String str) {
		System.out.println("메소드1에서 받은 파라미터: " + str);
	}

	public void method3(int a, int b) {
		System.out.println("메소드1에서 받은 파라미터: " + a + ", " + b);
	}
}
