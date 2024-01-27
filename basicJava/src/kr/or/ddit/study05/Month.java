package kr.or.ddit.study05;

public enum Month {
//	JAN("1월", 1), FEB("2월", 2), MAR("3월", 3), APR("4월", 4),
//	MAY("5월", 5), JUN("6월", 6), JUL("7월", 7), AUG("8월", 8),
//	SEP("9월", 9), OCT("10월", 10), NOV("11월", 11), DEC("12월", 12);

	JAN("1월"), FEB("2월"), MAR("3월"), APR("4월"), MAY("5월"), JUN("6월"),
	JUL("7월"), AUG("8월"), SEP("9월"), OCT("10월"), NOV("11월"), DEC("12월");

	String s;
//	int i;

	Month(String s) {
		this.s = s;
//		this.i = i;
	}
}
