package kr.or.ddit.study02.sec02;

public class BooleanExample {
	public static void main(String[] args) {
		// true, false
		// 논리타입으로 두가지로 표시됨
		// 실행 흐름 등을 변경하는데 표시

		boolean flag = false;
		int age = 25;
		flag = (age > 17);
		if (flag) {
			System.out.println("성년입니다");
		} else {
			System.out.println("미성년입니다");
		}
	}
}
