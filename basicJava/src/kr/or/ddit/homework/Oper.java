package kr.or.ddit.homework;

public enum Oper {
	PLUS("+"), MINUS("-"), MULTIPLY("*"), DEVIDE("/"), MOD("%");

	String o;

	Oper(String s) {
		this.o = s;
	}
}
