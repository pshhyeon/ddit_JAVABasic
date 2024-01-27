package kr.or.ddit.study06.sec04;

public class Circle {
	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println("넓이 "+c.area(3));
		System.out.println("넓이 "+c.area(3.3));
		System.out.println("둘레 "+c.leng(4));
		System.out.println("둘레 "+c.leng(4.4));
	}

	// 넓이 구하는 메소드
	// 파라미터 r - 넓이 return 3.14 * r*r
	// 길이 구하는 메소드
	// 파라미터 r - 길이 3.14*2*r
	
	public double area(int r) {
		return 3.14 * r * r;
	}
	public double area(double r) {
		return 3.14 * r * r;
	}

	public double leng(int r) {
		return 3.14 * 2 * r;
	}
	public double leng(double r) {
		return 3.14 * 2 * r;
	}
}
