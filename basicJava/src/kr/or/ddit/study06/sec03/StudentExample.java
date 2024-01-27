package kr.or.ddit.study06.sec03;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student("미국", "301호", "ㅂㅂㅂ", 20);
		Student s2 = new Student("301호", "ㅈㅈㅈ", 21);
		Student s3 = new Student("ㄷㄷㄷ", 22);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
