package kr.or.ddit.study03;

public class TrimomialOperator {

	public static void main(String[] args) {
		/*
		 * 3항 연산자: 3개의 피연산자를 필요로하는 연산.
		 * 			 삼항연산자는 ? 앞의 조건식의 결과에 따라
		 * 			 콜론 앞뒤의 피연산자가 건택 조건 뎐산식이라고도 함
		 * 
		 * 	(조건식)	?	(값 또는 연산식):(값 또는 연산식)
		 * 					참			거짓
		 */

		// boolean flag = false ? true : false;
		//
		//System.out.println(flag);
		
//		int age = 10;
//		String str = age >= 18 ? "성년" : "미성년";
//		System.out.println(str);
		
		int a = 10;
		int b = 10;
		/*
		 * a 값이 짝수라면 a * b
		 * 		홀수라면 a + b
		 */
		int result = a % 2 == 0 ? a * b : a + b;
		System.out.println(result);

	}
}
