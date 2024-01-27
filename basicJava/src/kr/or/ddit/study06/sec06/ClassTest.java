package kr.or.ddit.study06.sec06;

public class ClassTest {
	private static int year;
	private int feild1;

	public ClassTest() {
	}

	public ClassTest(int feild1) {
		this.feild1 = feild1;
	}

	public static int getYear() {
		return year;
	}

	public static void setYear(int year) {
		ClassTest.year = year;
	}

	public int getFeild1() {
		return feild1;
	}

	public void setFeild1(int feild1) {
		this.feild1 = feild1;
	}

	// 오버라이드는 부모가 만든 메소드를 재정의함
	// 여기서 부모는 Object
	@Override
	public String toString() {
		return "ClassTest [feild1=" + feild1 + "]";
	}

}
