package kr.or.ddit.study06.sec03;

public class TriangleExample {
	public static void main(String[] args) {
		// 기본 생성자로 객체 생성
		Triangle t1 = new Triangle(-4, 0, 4, 0, 4, 7);

		// Point클래스 활용
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 10);
		Point p3 = new Point(10, 0);
		Triangle t2 = new Triangle(p1, p2, p3);

		// 출력
		System.out.println(t1);
		System.out.println(t2);
	}
}
