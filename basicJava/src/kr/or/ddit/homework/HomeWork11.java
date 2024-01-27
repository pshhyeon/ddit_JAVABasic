package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1.
		// 생성자를통해 x, y, 높이 너비를 입력받고 area 값은 자동으로 계산 하도록 하자
		// area 넓이 값은 높이*너비

		int a, b, c, d;
		System.out.println("1. x, y, height, width 값을 순서대로 입력");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		Rectangle r1 = new Rectangle(a, b, c, d);
		// 2.
		// 생성자를 통해 point, 높이, 너비를 입력받고
		// point 클래스에서 꺼낸 x, y 값을 통해 1번 문제에 생성자를 호출해보도록 하자

		int x, y, h, w;
		System.out.println("2. x, y, height, width 값을 순서대로 입력");
		x = sc.nextInt();
		y = sc.nextInt();
		h = sc.nextInt();
		w = sc.nextInt();
		Point p = new Point(x, y);
		Rectangle r2 = new Rectangle(p, h, w);
		// 1, 2번 결과 출력
		System.out.println("1번결과" + r1);
		System.out.println("2번결과" + r2);
		
		Rectangle r3 = new Rectangle(new Point(0,0), h, w);
		System.out.println("3번결과" + r3);
		

	}
}

class Rectangle {
	int area;
	int x;
	int y;
	int height;
	int width;

	public Rectangle(Point point, int height, int width) {
		this(point.x, point.y, height, width);
	}

	public Rectangle(int x, int y, int height, int width) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
		this.area = height * width;
	}

	@Override
	public String toString() {
		return "Rectangle [area=" + area + ", x=" + x + ", y=" + y + ", height=" + height + ", width=" + width + "]";
	}
}

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
