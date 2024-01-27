package kr.or.ddit.study03;

public class BitOperator {
	public static void main(String[] args) {
		/*
		 * shift  operator
		 * >> << >>>
		 * 숫자 >> 정수
		 *  => 숫자를 정수만큼 평행이동
		 *  => 숫자를 2^(정수) 로 나눔
		 */

		int a = 14;
		System.out.println(a >> 2);
		System.out.println(a << 2);

	}

}
