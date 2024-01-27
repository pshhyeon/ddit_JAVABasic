package kr.or.ddit.study05;

public class ReferenceType {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = "강감찬";
		String str4 = new String("강감찬");
		String str5 = new String("강감찬");
		// == stack 영역의 값을 비교함.
		// 참조타입의 경우 주소값이 비교됨.
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		System.out.println(str4 == str5);
		// 문자열.equals(문자열)
		// 주소값이 아닌 값이 같은지 비교.
		System.out.println(str3.equals(str4));

		Student s1 = new Student();
		System.out.println(s1);

		String str6 = "";
		String str7 = null;
		String str8;

	}
}

class Student {
	String name;
	int age;

	Student() {
		name = "홍길동";
		age = 20;
	}

	// Alt + Shift + S
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}
