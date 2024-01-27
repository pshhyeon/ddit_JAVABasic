package kr.or.ddit.study06.sec06;

public class SingleTon {
	// 객체가 하나만 만들어지게 하는 패턴
	// 로딩이 긴 프로젝트에 사용
	// 데이터가 동일해야하는 경우 사용

	private static SingleTon instance = null;

	int num =0;
	// 기본생성자를 SingleTon생성자에서만 사용할수 있게 막음
	private SingleTon() {
		num++;
	}

	public static SingleTon getInstance() {
		if (instance == null) {
			instance = new SingleTon();
		}
		return instance;
	}

	// JAVA template 등록 -> singleTon
}
