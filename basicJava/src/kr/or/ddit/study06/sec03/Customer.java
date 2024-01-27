package kr.or.ddit.study06.sec03;

public class Customer {

	// 이름 국가 나이
	String name;
	String nation;
	int age;

	public Customer() {
		this.name = null;
		this.nation = null;
		this.age = 0;
	}

	public Customer(String name, int age) { // 함수 오버로딩
		this.nation = "한국";
		this.name = name;
		this.age = age;
	}

	public Customer(String name, String nation, int age) {
		this.name = name;
		this.nation = nation;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", nation=" + nation + ", age=" + age + "]";
	}
}
