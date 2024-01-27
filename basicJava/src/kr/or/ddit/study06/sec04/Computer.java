package kr.or.ddit.study06.sec04;

public class Computer {
	public static void main(String[] args) {
		Computer c = new Computer();
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println(c.sum(arr));
		System.out.println(c.sum2(arr));

		int i = c.sum(new int[] { 1, 2, 3, 4, 5 });
		System.out.println("\n" + i);
	}

	// 라마미터로 int 배열값을 받아 더해주는 메소드를 설계해 보세요
	// return 값은 총합
	int sum(int[] i) {
		int s = 0;
		for (int j : i) {
			s += j;
		}
		return s;
	}

	// 라마미터로 int 배열값을 받아*2 한후 더해주는 메소드를 설계해 보세요
	// return 값은 총합
	int sum2(int[] i) {
		int s = 0;
		for (int j : i) {
			s += j * 2;
		}
		return s;
	}
}
