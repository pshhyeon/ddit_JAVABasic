package kr.or.ddit.study06.sec02;

public class Student {
	// 국어, 영어, 수학
	// 총점, 평균, 등수

	// 이름
	String name;

	int kor;
	int eng;
	int math;

	int sum;
	double avg;
	int rank;

	public int getSum() {
		return sum;
	}

	public void setSum() {
		this.sum = this.kor + this.eng + this.math;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg() {
		this.avg = this.sum / 3;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "학생 [kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avg=" + avg + ", rank=" + rank
				+ ", name=" + name + "]";
	}

	// └> 오버라이드 Alt + Shift + s

}
