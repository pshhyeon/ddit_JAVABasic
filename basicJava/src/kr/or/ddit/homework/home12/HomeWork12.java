package kr.or.ddit.homework.home12;

public class HomeWork12 {
	public static void main(String[] args) {
		HomeWork12 hw = new HomeWork12();
		// 1. 다음을 만족하는 Student 클래스를 설계
		// String 형의 학과와 정수형의 학번을 필드로 선언
		// HomeWork12에서 Student 객체를 생성하고
		// 학과와 학번을 적당한 값을 넣고 출력
		Student st = new Student("학과", 20240110);
		System.out.println(st);

		// 2. 다음을 만족하는 Tv클래스를 설계
		// Tv클래스에 제조사 생산년도 크기를 필드로 선언
		// 생성자(제조사, 생산년도, 크기)를 통해 객체를 만들고
		// PrintTv 라는 매소드에서 값을 출력할 것
		Tv t = new Tv("집", 20240110, 99.9);
		t.printTv();

		// 3. 세 과목의 성적을 입력 받고 총점 메소드 합 메소드를 통해 출력할 수 있는 Grade Class 설계
		int kor = 100;
		int eng = 99;
		int math = 80;
		Grade g = new Grade(kor, eng, math);
		System.out.println("총점: " + g.printSum());
		System.out.println("평균: " + g.printAvg());
		
	}

}
