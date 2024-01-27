package kr.or.ddit.homework.home12;

public class Tv {

	String company;
	int date;
	double size;

	public Tv(String company, int date, double size) {
		this.company = company;
		this.date = date;
		this.size = size;
	}

	public void printTv() {
		System.out.printf("제조사: %s, 생산년도: %d, 크기: %.2f\n", company, date, size);
	}

}
