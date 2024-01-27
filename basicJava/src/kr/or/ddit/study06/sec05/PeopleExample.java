package kr.or.ddit.study06.sec05;

public class PeopleExample {
	public static void main(String[] args) {
		System.out.println(People.year);

		People p1 = new People("person1", "man");
		People p2 = new People("person2", "girl");
		System.out.println(p1);
		System.out.println(p2);

		System.out.println("Happy new year");
		People.year++;
		System.out.println(p1);
		System.out.println(p2);
	}
}
