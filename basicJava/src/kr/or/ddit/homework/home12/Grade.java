package kr.or.ddit.homework.home12;

public class Grade {
	int kor;
	int eng;
	int math;

	public Grade(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int printSum() {
		int sum = kor + eng + math;
		return sum;
	}

	public double printAvg() {
		double avg = (kor + eng + math) / 3.0;
		return avg;
	}

}
