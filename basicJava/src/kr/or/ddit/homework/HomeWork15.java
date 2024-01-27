package kr.or.ddit.homework;

public class HomeWork15 {
	public static void main(String[] args) {
		System.out.println(Cal(Oper.PLUS, 2, 3));
		System.out.println(Cal(Oper.MINUS, 5, 3));
		System.out.println(Cal(Oper.MULTIPLY, 2, 3));
		System.out.println(Cal(Oper.DEVIDE, 6, 4));
		System.out.println(Cal(Oper.MOD, 6, 4));
		System.out.println("=========");
		System.out.println(Cal("7*4"));
		System.out.println("=========");
		//System.out.println(cal2("7*4/2"));

	}

	// 2.
	public static double Cal(String s) {
		/*
		 * String[] oper_arr = { "+", "-", "*", "/" }; String[] num = new String[2];
		 * String oper = ""; for (String o : oper_arr) { if (s.contains(o)) { // \* => *
		 * // \\* => "*" num = s.split("\\" + o); oper = o; break; } }
		 */

		// enum 타입으로 변경
		String[] num = new String[2];
		Oper oper=Oper.PLUS;
		for (Oper o : Oper.values()) {
			if (s.contains(o.o)) {
				// \* => *
				// \\* => "*"
				num = s.split("\\" + o.o);
				oper = o;
				break;
			}
		}
		return Cal(oper, Integer.parseInt(num[0]), Integer.parseInt(num[1]));
	}

	// 1.
	public static double Cal(Oper oper, int a, int b) {
		HomeWork15 hw = new HomeWork15();
		switch (oper.o) {
		case "+":
			return hw.sum(a, b);
		case "-":
			return hw.sub(a, b);
		case "*":
			return hw.multi(a, b);
		case "/":
			return hw.divi(a, b);
		case "%":
			return hw.mod(a, b);
		default:
			System.out.println("연산오류");
			return 0.0;
		}
	}

	public int sum(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int multi(int a, int b) {
		return a * b;
	}

	public int mod(int a, int b) {
		return a * b;
	}

	public double divi(int a, int b) {
		return a % b;
	}

	// 3. (심화 문제) 연산자 여러개 일때 (사칙연산 풀이 순서 주의!)
	public static double cal2(String s) {
		// 숫자와 연산자를 담을 array 선언
		double numList[];
		String[] operList;

		String[] opers = { "*", "/", ",", "+" };
		int cnt = 0;

		// oper count
		for (int i = 0; i < s.length(); i++) {
			String temp = s.charAt(i) + "";
			for (String oper : opers)
				if (temp.equals(oper))
					cnt++;
		}

		// num은 count+1이 갯수
		numList = new double[cnt + 1];
		operList = new String[cnt];
		cnt = 0;
		String temp_num = "";

		for (int i = 0; i < s.length(); i++) {
			String temp = s.charAt(i) + "";
			boolean operFlag = false;
			for (String oper : opers) {
				if (temp.equals(oper)) {
					operFlag = true;
				}
			}

			if (operFlag) {
				numList[cnt] = Double.parseDouble(temp_num);
				operList[cnt] = temp;
				cnt++;
				temp_num = "";
			} else {
				temp_num += temp;
			}
		}

		numList[cnt] = Double.parseDouble(temp_num);

		int add = 0;
		for (int i = 0; i < operList.length; i++) {
			String oper = operList[i];
			int c = i + add;
			if (oper.equals("*")) {
				double d = numList[c] * numList[c + 1];
				numList[c] = d;
				add++;
			}
			if (oper.equals("/")) {
				double d = numList[c] / numList[c + 1];
				numList[c] = d;
				add++;
			}
		}
		double sum = 0;
		for (int i = 0; i < operList.length; i++) {
			String oper = operList[i];
			if (oper.equals("-")) {
				numList[i + 1] = -numList[i + 1];
			}
		}
		for (double d : numList)
			sum += d;

		return sum;
	}

}
