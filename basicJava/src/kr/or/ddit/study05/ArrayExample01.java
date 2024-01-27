package kr.or.ddit.study05;

import java.util.Scanner;

public class ArrayExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample01 obj = new ArrayExample01();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
		obj.method6();
	}
	
	public void method6() {
		/*
		 * 로또번호 6개 출력하기
		 * 1. 로또 배열 45개 생성
		 * 2. 각 배열에 값을 넣기
		 * 3. 배열섞기
		 * 4. 45개 배열중에 앞에서 6개 출력하기
		 */
		int lotto[] = new int[45];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
		for (int i=0;i<10000;i++) {
			int ran=(int) (Math.random() * lotto.length);
			int temp=lotto[ran];
			lotto[ran]=lotto[0];
			lotto[0]=temp;
		}
		int select[] = new int[6];
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.print("\n로또번호: ");
		for (int i = 0; i < select.length; i++) {
			select[i]=lotto[i];
			System.out.print(select[i]+" ");
		}

	}
	
	public void method5() {
		// 타입별 초기값
		// boolean	: false 
		// char		: \u0000 -> ' '
		// byte, short, int, long	: 0
		// float	: 0.0f
		// douvle	: 0.0
		// 
		// reference type	: null
		
		boolean[] bArr=new boolean[10];
		for (int i = 0; i < bArr.length; i++) {
			System.out.println(bArr[i]);
		}
	}
	
	public void method4() {
	int[] score = {77, 95, 57, 67, 84};
	/*
	 * 최대값 구하기
	 */
	int max=0;
	for (int i : score) {
		max = i > max ? i : max;
	}
	System.out.println(max);
}
	
	public void method3() {
		// int 타입 변수 5개를 저장하고
		// 역순으로 출력해보기
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
	
	public void method2() {
		/*
		 * 크기 5짜리 int 타입 배열 생성
		 */
		int[] arr = new int[5];
		System.out.println(arr);

		// 크기 5짜리 int 타입의 배열을 생성하고
		// 데이터를 저장
		// {10, 20, 30, 40, 50};
		// ,<- 데이터 구분
		// 10 <- 같은 타입의 데이터 입력
		int[] arr2 = { 10, 20, 30, 40, 50 };
	}

	public void method1() {
		/*
		 * 학생 점수 10개 선언해서 값을 저장해보기 
		 * int
		 * 
		 * 10명 학생의 점수 총합 구해보기
		 */
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int sum=0;
		for(int i : arr) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
