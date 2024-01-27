package kr.or.ddit.study05;

public class MonthExample {
	public static void main(String[] args) {

//		int i = 12;
//		for (Month m : Month.values()) {
//			if (m.i == i) {
//				System.out.println(m.s);
//			}
//		}
		
		String s= "1월";
		for (Month m : Month.values()) {
			if (m.s == s) {
				System.out.println(m);
			}
		}
		
	}
}
