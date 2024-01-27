package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork16 {
	Scanner sc = new Scanner(System.in);

	Member[] memList = new Member[100];
	int cur = 0;

	public static void main(String[] args) {
		HomeWork16 obj = new HomeWork16();
		obj.process();
	}

	public void process() {
		// 회원 관리 시스템
		while (true) {
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 탈퇴");
			System.out.println("3. 정보 수정");
			System.out.println("4. 회원 전체 정보 출력");
			int input = sc.nextInt();

			if (input == 1) {
				addMember();
			} else if (input == 2) {
				delete();
			} else if (input == 3) {
				update();
			} else if (input == 4) {
				printList();
			} else {
				System.out.println("잘못된 선택");
			}
		}
		// 1,2,3,4를 각각 입력했을때 해당하는 메소드 실행하기
	}

	public void delete() {
		printList();
		System.out.print("삭제할 회원번호 입력: ");
		int num = sc.nextInt();
		Member mem = memList[num];
		// 정보 수정
		for (int i = num; i < cur; i++) {
			memList[i] = memList[i + 1];
		}
		cur--;
		System.out.println("수정 완료");
		printList();
	}

	public void addMember() {
		Member mem = new Member();
		// 정보입력
		memList[cur++] = mem;

		System.out.println("아이디, 이름, 나이 순서대로 입력");
		String id = sc.next();
		String name = sc.next();
		int age = sc.nextInt();

		mem.setId(id);
		mem.setName(name);
		mem.setAge(age);
	}

	public void printList() {
		for (int i = 0; i < cur; i++) {
			Member mem = memList[i];
			// mem 정보 꺼내서 출력
			System.out.println(i + "회원  아이디: " + mem.getId() + "이름: " + mem.getName() + "나이: " + mem.getAge());
		}
	}

	public void update() {
		printList();
		System.out.print("수정할 회원번호 입력: ");
		int num = sc.nextInt();
		Member mem = memList[num];
		// 정보 수정
		System.out.println("수정할 정보 선택: 1. 아이디, 2. 이름, 3. 나이");
		int input = sc.nextInt();
		if (input == 1) {
			System.out.println("수정할 아이디 입력");
			String updapte_id = sc.next();
			mem.setId(updapte_id);
		} else if (input == 2) {
			System.out.println("수정할 이름 입력");
			String updapte_name = sc.next();
			mem.setName(updapte_name);

		} else if (input == 3) {
			System.out.println("수정할 나이 입력");
			int updapte_age = sc.nextInt();
			mem.setAge(updapte_age);
		}
	}

}

class Member {
	private String id;
	private String name;
	private int age;

	// getter setter 사용해보기
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
