package kr.or.ddit.study06.sec03;

import java.util.ArrayList;

public class CustomerExample {
	public static void main(String[] args) {
		// Customer class3개 만들고 데이터 넣어보기
		ArrayList<Customer> c = new ArrayList<>();
		c.add(new Customer("ㄱㄱㄱ", "한국", 19));
		c.add(new Customer("ㄴㄴㄴ", "미국", 20));
		c.add(new Customer("ㄷㄷㄷ", "영국", 21));
		c.add(new Customer("ㄹㄹㄹ", 22));

		for (Customer customer : c) {
			System.out.println(customer);
		}

	}
}
