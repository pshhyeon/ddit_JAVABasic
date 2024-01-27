package kr.or.ddit.homework.home12;

public class Student {
	String major;
	int st_id;

	public Student(String major, int st_id) {
		this.major = major;
		this.st_id = st_id;
	}

	@Override
	public String toString() {
		return "Student [major=" + major + ", st_id=" + st_id + "]";
	}

}
