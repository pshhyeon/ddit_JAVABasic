package kr.or.ddit.study06.sec02;

public class TvExample {
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		tv1.company = "LG";
		tv1.year = 2023;
		tv1.size = 60;

		Tv tv2 = new Tv();
		tv2.company = "삼성";
		tv2.year = 2024;
		tv2.size = 85;

		System.out.println("Tv1 회사: " + tv1.company + " 생산년도: " + tv1.year + " 크기: " + tv1.size);
		System.out.println("Tv2 회사: " + tv2.company + " 생산년도: " + tv2.year + " 크기: " + tv2.size);
	}
}
