package kr.or.ddit.study02.sec01;

public class VarExample02 {
	static int a1 = 10;

	public static void main(String[] args) {
		int a2 = 11;
		System.out.println(a1);
		System.out.println(a2);

		VarExample02 ve = new VarExample02();
		ve.method1();
	}

	public void method1() {
		int a3 = 12;
		System.out.println(a1);
		System.out.println(a3);
		{
			int a4 = 13;
			System.out.println(a4);
		}
		int a4 = 15;
		System.out.println(a4);
	}
}
