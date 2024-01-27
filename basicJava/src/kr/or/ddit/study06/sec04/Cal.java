package kr.or.ddit.study06.sec04;

public class Cal {
	public static void main(String[] args) {
		Cal cal = new Cal();
		int add = cal.add(10, 10);
		System.out.println(add);
		System.out.println(cal.mod(10, 8));
		System.out.println(cal.sub(10, 7));
		System.out.println(cal.mul(10, 10));
		System.out.println(cal.divi(10, 8));
	}

	public int add(int a, int b) {
		return a + b;
	}

	public int mod(int a, int b) {
		return a % b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public double divi(int a, int b) {
		return (double) a / b;
	}

}
