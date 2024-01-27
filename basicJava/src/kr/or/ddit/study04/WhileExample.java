package kr.or.ddit.study04;

import java.util.Scanner;

public class WhileExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		WhileExample obj = new WhileExample();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
		obj.method5();
	}
	
	public void method5() {
		END: while (true) {
			System.out.println("while outside print");
			while (true) {
				System.out.println("while inside print");
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break END; // END: END > label break로 멈출수 있는 반복문을 선택해서 종료할수있음 꼭 END가 아니어도 됨 A, B ...
			}
		}
	}
	
	public void method4() {
		int i = 1;
		do {
			System.out.println(i + "실행됨");
			i++;
		} while (i < 10);
	}
	
	public void method3() {
		int i=1;
		while(i>0) {
			i+=100;
			System.out.println(i);
		}
	}
	
	public void method2() {
		/*
		 * 커피 매장
		 * 메뉴
		 * 아메리카노: 1000
		 * 카페라떼: 1500
		 * 자바칩 프라프치노: 2000
		 */
		int sum=0;
		String bill = "***영수증***\n";
		while(true) {
			System.out.println("====메뉴====");
			System.out.println("1. 아메리카노           : 1000");
			System.out.println("2. 카페라떼              : 1500");
			System.out.println("3. 자바칩 프라푸치노 : 2000");
			System.out.println("4. 주문완료");
			System.out.println("==========");
			int select= sc.nextInt();
			switch(select) {
			case 1:
				sum+=1000;
				bill = bill+"아메리카노\n";
				break;
			case 2:
				sum+=1500;
				bill = bill+"카페라떼\n";
				break;
			case 3:
				sum+=2000;
				bill = bill+"자바칩 프라푸치노\n";
				break;
			}
			if(select == 4) {break;}
		}
		System.out.println("주문이 완료되었습니다.\n"+bill+sum+"원");
	}
	
	public void method1() {
		/*
		 * wuile 반복문 무한루프 등을 사용할 때 주로 사용. (끝나는 지점을 알기 어려울때)
		 * 
		 * while(조건식){ 실행문 }
		 */
		int num = 0;
		while (num < 10) {
			System.out.println(num++);
		}
		int[] j = {1,2,3,4,5};
		System.out.println(j.length);
	}
}
