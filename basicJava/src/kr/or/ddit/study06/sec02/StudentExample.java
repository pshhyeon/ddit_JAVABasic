package kr.or.ddit.study06.sec02;

public class StudentExample {
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name = "ㄱㄱㄱ";
		st1.kor = 90;
		st1.eng = 80;
		st1.math = 70;
		st1.sum = st1.kor + st1.eng + st1.math;
		st1.avg = st1.sum / 3;

		Student st2 = new Student();
		st2.name = "ㄴㄴㄴ";
		st2.kor = 95;
		st2.eng = 84;
		st2.math = 71;
		st2.sum = st2.kor + st2.eng + st2.math;
		st2.avg = st2.sum / 3;
		
		Student st3 = new Student();
		st3.name = "ㄷㄷㄷ";
		st3.kor = 95;
		st3.eng = 84;
		st3.math = 71;
		st3.setSum();
		st3.setAvg();
		
		
		// 오버라이드
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);

	}

}
