package kr.or.ddit.study05;

import java.util.Scanner;

public class ArrayExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample02 obj = new ArrayExample02();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
//		obj.method6();
//		obj.method7();
		obj.method8();
	}
	
	public void method8() {
		String str[]= {"a","b","c"};
		
		for(String s: str) {
			System.out.println(s);
			int i = Integer.parseInt(s);
		}
		
		int num[]= {1,2,3};
		for(int i : num) {
			System.out.println(i);
		}
		
	}
	
	public void method7() {
		// 로또 다시 만들고
		// system.arraycopy이용해 6개만 복사해보기
		// 버블정렬을 이용해서 6개의 숫자 정렬하기
		int lotto[] = new int[45];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
		for (int i = 0; i < 10000; i++) {
			int ran = (int) (Math.random() * lotto.length);
			int temp = lotto[ran];
			lotto[ran] = lotto[0];
			lotto[0] = temp;
		}
		int select[] = new int[6];
		System.arraycopy(lotto, 0, select, 0, select.length);
		for (int i = 0; i < select.length - 1; i++) {
			boolean flag = true;
			for (int j = 0; j < select.length - 1; j++) {
				if (select[j] > select[j + 1]) {
					int temp = select[j];
					select[j] = select[j + 1];
					select[j + 1] = temp;
					flag = false;
				}
			}
			if (flag)
				break;
		}
		System.out.print("로또번호: ");
		for (int i = 0; i < select.length; i++) {
			System.out.print(select[i] + " ");
		}
	}

	public void method6() {
		// 배열복사
		// 2. 깊은 복사(deep copy): 배열공간을 별도로 확보(heap 영역에)
		// 2. 1 반복문 이용
		// 2. 2 System.arraycopy
		// 2. 3 clone

		// 반복문 이용
		int source[] = { 1, 2, 3, 4, 5 };
		int target[] = new int[source.length];

		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}

		target[1] = 10;
		System.out.println("원본 배열");
		for (int i = 0; i < source.length; i++) {
			System.out.println(source[i] + "\t");
		}
		System.out.println();
		System.out.println("복사된 배열");
		for (int i = 0; i < target.length; i++) {
			System.out.println(target[i] + "\t");
		}
		System.out.println();

		// System.arraycopy
		// 일부만 복사할때 사용하면 편하다(원본 손상 x)
		int target2[] = new int[source.length];
		System.arraycopy(source, 0, target2, 0, source.length);
		// (원본배열, 어디부터, 복사할 배열, 어디부터, 얼만큼)
		target2[1] = 11;
		System.out.println("원본 배열");
		for (int i = 0; i < source.length; i++) {
			System.out.println(source[i] + "\t");
		}
		System.out.println();
		System.out.println("System.arraycopy로 복사된 배열");
		for (int i = 0; i < target.length; i++) {
			System.out.println(target[i] + "\t");
		}
		System.out.println();

		// clone
		int target3[] = source.clone();
		target3[1] = 11;
		System.out.println("원본 배열");
		for (int i = 0; i < source.length; i++) {
			System.out.println(source[i] + "\t");
		}
		System.out.println();
		System.out.println("clone으로 복사된 배열");
		for (int i = 0; i < target3.length; i++) {
			System.out.println(target3[i] + "\t");
		}
		System.out.println();
	}

	public void method5() {
		// 배열 복사
		// 1. 얕은 복사(shallow copy): 복사된 배열이나 원본 배열이 변경될때 서로 간의 값이 같이 변경

		int source[] = { 1, 2, 3, 4, 5 };
		int target[] = source; // 주소값만 복사해서 대입

		target[1] = 10;
		System.out.println("원본 배열");
		for (int i = 0; i < source.length; i++) {
			System.out.println(source[i] + "\t");
		}

		System.out.println();
		System.out.println("복사된 배열");
		for (int i = 0; i < target.length; i++) {
			System.out.println(target[i] + "\t");
		}
		// source와 target이 같은 주소를 공유하고 있기때문에 target의 값을 바꾸면 원본이 손상되어 같이 바뀐다.
		// 굉장히 주의를 요함!!!!!!!!!!!!!!!!!!!!!
	}

	public void method4() {
		// 선택정렬

		int num[] = { 7, 6, 4, 9, 8 };
		for (int i = 0; i < num.length - 1; i++) {
			int min = num[i];
			int index = i;
			for (int j = i; j < num.length; j++) {
				// find min value
				if (min > num[j]) {
					min = num[j];
					index = j;
				}
			}
			// swap
			int temp = num[i];
			num[i] = num[index];
			num[index] = temp;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}

		// 뭘까
		System.out.println();
		for (int i = 0; i < num.length - 1; i++) {
			int minIdx = i;
			for (int j = i + 1; j < num.length; j++) {
				if (num[j] < num[minIdx]) {
					minIdx = j;
				}
			}
			int tmp = num[i];
			num[i] = num[minIdx];
			num[minIdx] = tmp;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}

	}

	public void method3() {

		int score[] = { 70, 65, 44, 90, 83 };
		/*
		 * 오름차순으로 출력(큰 숫자가 앞으로)
		 */
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = 0; j < score.length - 1; j++) {
				if (score[j] < score[j + 1]) {
					int temp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i] + "\t");
		}
	}

	public void method2() {
		// 향상된 버블정렬
		// 버블 정렬 진행중 더이상 값이 바뀌지 않는 경우 중단한다
		int num[] = { 63, 95, 87, 94, 75 };
		for (int i = 0; i < num.length - 1; i++) {
			boolean flag = true;
			for (int j = 0; j < num.length - 1; j++) {
				if (num[j] < num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
					flag = false;
				}
			}
			if (flag)
				break;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + "\t");
		}
	}

	public void method1() {
		/*
		 * 버블 정렬 원본 자료가 n개일때 n-1차 운행한다 각 회차에서 인접한 값을 비교하여 오름차순인 경우 작은 값을 앞에 위치시킴
		 */

		int[] num = { 63, 95, 87, 94, 75 };
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = 0; j < num.length; j++) {
				// i =0 63,95,87,94,75
				// j =1 95,63,87,94,75
				// j =2 95,87,63,94,75
				// j =3 95,87,94,63,75
				// j =1 95,87,94,75,63
				// i =1 95,87,94,75,63

				if (num[j] < num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + "\t");
		}
	}

}
