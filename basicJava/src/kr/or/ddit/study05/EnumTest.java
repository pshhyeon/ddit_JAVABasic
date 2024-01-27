package kr.or.ddit.study05;

public class EnumTest {
	public static void main(String[] args) {
		EnumTest e = new EnumTest();
		e.weekDay("fri");
		e.weekDay(Week.FRI);

		for (Week w : Week.values()) {
			System.out.println(w.s);
		}

	}

	public void weekDay(Week day) {
//		if (day == Week.FRI) {
//			System.out.println("금요일입니다");
//		}
		System.out.println(day.s + "입니다");
	}

	public void weekDay(String day) {
		if (day.equals("fri")) {
			System.out.println("금요일입니다");
		}
	}
}
