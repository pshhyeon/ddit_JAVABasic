package kr.or.ddit.homework;

import java.util.Arrays;

public class HomeWork10 {
	public static void main(String[] args) {
		// 5명의 3과목 성적과 이름을 배열에 저장하고
		// 총점, 평균, 등수를 구하여 출력하시오

		// 1. 클래스 완성

		// 2. 클래스에 데이터 입력
		// 3. 클래스를 클래스 배열에 담기
		Student s[] = new Student[5];

		for (int i = 0; i < s.length; i++) {
			s[i] = new Student();
			s[i].name = "학생" + (i + 1);
			s[i].kor = (int) (Math.random() * 101);
			s[i].eng = (int) (Math.random() * 101);
			s[i].math = (int) (Math.random() * 101);
			s[i].setSum();
			s[i].setAvg();
		}
		// 등수 계산
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				if (s[i].sum < s[j].sum) {
					s[i].rank++;
				}
			}
		}
		// 등수별, 배열 정렬
		for (int i = 0; i < s.length - 1; i++) {
			for (int j = 0; j < s.length - 1; j++) {
				if (s[j].rank > s[j + 1].rank) {
					Student temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

	}
}

class Student {
	String name;

	int kor;
	int eng;
	int math;

	int sum;
	double avg;
	int rank = 1;

	public void setSum() {
		this.sum = this.kor + this.eng + this.math;
	}

	public void setAvg() {
		this.avg = this.sum / 3;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avg="
				+ avg + ", rank=" + rank + "]";
	}

	// └> 오버라이드 Alt + Shift + s
}
