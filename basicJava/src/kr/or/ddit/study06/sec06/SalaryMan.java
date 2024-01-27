package kr.or.ddit.study06.sec06;

public class SalaryMan {
	private String name;
	private int age;

	// get
	// public 타입 get컬럼명()

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// set
	// public void set컬럼명(타입컬럼명)

	public void setAge(int age) {
		if (age < 0 || age > 122) {
			System.out.println("올바른 데이터가 아닙니다.");
		} else {
			this.age = age;
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SalaryMan [name=" + name + ", age=" + age + "]";
	}
}
