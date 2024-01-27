package kr.or.ddit.study06.sec03;

public class Triangle {
	// 좌표 3개, 넓이
	int x1;
	int y1;

	int x2;
	int y2;

	int x3;
	int y3;

	double area;

	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.x1 = x1;
		this.y1 = y1;

		this.x2 = x2;
		this.y2 = y2;

		this.x3 = x3;
		this.y3 = y3;

		this.area = 0.5 * Math.abs((x1 * y2 + x2 * y3 + x3 * y1) - (x1 * y3 + x2 * y1 + x3 * y2));
	}

	// point 3 개 넣어서 만드는 생성자
	public Triangle(Point p1, Point p2, Point p3) {
		this(p1.x, p1.y, p2.x, p2.y, p3.x, p3.y);
	}

	@Override
	public String toString() {
		return "Triangle [x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + ", x3=" + x3 + ", y3=" + y3
				+ ", area=" + area + "]";
	}

}
