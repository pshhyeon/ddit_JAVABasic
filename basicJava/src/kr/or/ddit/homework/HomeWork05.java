package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork05 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("숫자를 입력해주세요");
		HomeWork05 hw = new HomeWork05();
//		hw.method01();
//		hw.method02();
//		hw.method03();
//		hw.method04();
//		hw.method05();
//		hw.method06();
		hw.method07();
	}

	public void method01() {
		/*
		 *    *
		 *    **
		 *    ***
		 *    ****
		 */
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

	public void method02() {
		/*
		 *        *
		 *       **
		 *      ***
		 *     ****
		 */
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = i; j < num - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	
	public void method03() {
		/*
		 *   ****
		 *   ***
		 *   **
		 *   *
		 */
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = i; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void method04() {
		/*
		 *    ****
		 *     ***
		 *      **
		 *       *
		 */
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k < num; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void method05() {
		/*
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 */
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	public void method06() {
		/*
		 *       *******
		 *        *****
		 *         ***
		 *          *
		 */
		int num = sc.nextInt();
		for (int i = num; i > 0; i--) {
			for (int j = 0; j < num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public void method07() {
		/*
		 * 
		 * for 문을 사용해서 다음 모양을 그려 보세여
		 *  입력받은 값을 받아 가로갯수 많큼 사각형을 만들어라
		 *  
		 * 
		 *   ****
		 *   *  *
		 *   *  *
		 *   ****
		 */
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			if (i == 0 || i == num-1) {
				for (int j = 0; j < num; j++) {
					System.out.print("*");
				}
			} else {
				System.out.print("*");
				for (int k = 0; k < num - 2; k++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
