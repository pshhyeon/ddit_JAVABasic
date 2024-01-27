package kr.or.ddit.study06.sec06;

public class SingleTonTest {
	public static void main(String[] args) {
		SingleTon single1 = SingleTon.getInstance();
		SingleTon single2 = SingleTon.getInstance();
		SingleTon single3 = SingleTon.getInstance();
		SingleTon single4 = SingleTon.getInstance();
		SingleTon single5 = SingleTon.getInstance();
		System.out.println(single5.num);
	}
}
