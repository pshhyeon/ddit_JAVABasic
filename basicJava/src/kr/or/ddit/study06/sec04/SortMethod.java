package kr.or.ddit.study06.sec04;

import java.util.Arrays;

public class SortMethod {
	public static void main(String[] args) {
		SortMethod sm = new SortMethod();
		int[] n = { 3, 2, 5, 1, 4 };
		System.out.println("method inc: " + Arrays.toString(sm.inc(n)));
		System.out.println("method dec: " + Arrays.toString(sm.dec(n)));
		System.out.println("method s_inc: " + Arrays.toString(sm.s(n, 1)));
		System.out.println("method s_dec: " + Arrays.toString(sm.s(n, 2)));
		Arrays.sort(n);
		System.out.println(sm.toArrayString(n));

	}

	// return type = String / parameter = array
	String toArrayString(int[] arr) {
		String result = "[";
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
			if (i == arr.length - 1) {
				result += "]";
			} else {
				result += ", ";
			}
		}
		return result;
	}

	// 파라미터는 int 배열, int select(1,2) 일떄 1-오름 2-내림
	int[] s(int[] a, int n) {
		if (n == 1)
			return inc(a);
		else
			return dec(a);
	}

	// int 배열을 파라미터로 받고
	// 버블정절을 통해서 오름차순으로 정렬후
	// 배열을 리턴
	int[] inc(int[] n) {
		int num[] = n;
		for (int i = 0; i < n.length - 1; i++) {
			for (int j = 0; j < n.length - 1; j++) {
				if (num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		return num;
	}

	// int 배열을 파라미터로 받고
	// 버블정절을 통해서 내림차순으로 정렬후
	// 배열을 리턴
	int[] dec(int[] n) {
		int num[] = n;
		for (int i = 0; i < n.length - 1; i++) {
			for (int j = 0; j < n.length - 1; j++) {
				if (num[j] < num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		return num;
	}
}
