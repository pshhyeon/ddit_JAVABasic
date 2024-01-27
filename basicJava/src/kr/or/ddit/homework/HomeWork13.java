package kr.or.ddit.homework;

public class HomeWork13 {
	public static void main(String[] args) {
		HomeWork13 hw = new HomeWork13();
		// 과제 10을 메소드로 바꿔서 수현
		// 1. dataInput();
		// 클래스에 데이터 입력 및 클래스를 클래스 배열에 담기
		int student_num =1000;
		Student[] students = hw.dataInput(student_num);

		// 2.평균과, 총점을 구하는 메소드
		// 총점
		hw.setSum(students);

		// 평균
		hw.setAvg(students);

		// 3. 랭크를 구하는 메소드
		hw.setRank(students);

		// 4. 정렬하는 메소드
		hw.sortRank(students);

		// 5. 출력하는 메소드
		hw.printStudent(students);

	}

	public Student[] dataInput(int num) {
		Student s[] = new Student[num];
		for (int i = 0; i < s.length; i++) {
			s[i] = new Student();
			s[i].name = "학생" + (i + 1);
			s[i].kor = (int) (Math.random() * 101);
			s[i].eng = (int) (Math.random() * 101);
			s[i].math = (int) (Math.random() * 101);
			s[i].setSum();
			s[i].setAvg();
		}
		return s;
	}

	void setSum(Student[] student) {
		for (Student s : student) {
			s.sum = s.kor + s.eng + s.math;
		}
	}

	void setAvg(Student[] student) {
		for (Student s : student) {
			s.avg = s.sum/3.0;
		}
	}

	void setRank(Student[] students) {
		for (Student i : students) {
			for (Student j : students) {
				if (i.sum < j.sum) {
					i.rank++;
				}
			}
		}
	}

	void sortRank(Student[] students) {
		for (int i = 0; i < students.length - 1; i++) {
			for (int j = 0; j < students.length - 1; j++) {
				if (students[j].rank > students[j + 1].rank) {
					Student temp = students[j];
					students[j] = students[j + 1];
					students[j + 1] = temp;
				}
			}
		}
	}

	void printStudent(Student[] student) {
		for (Student s : student) {
			System.out.printf("Student [name=%5s, kor=%3d, eng=%3d, math=%3d, sum=%3d, avg=%6.2f, rank=%3d]\n", s.name,
					s.kor, s.eng, s.math, s.sum, s.avg, s.rank);

		}
	}
}
