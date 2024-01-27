package kr.or.ddit.study09;

// 중첩 클래스 import
import kr.or.ddit.study09.ClassA.ClassB.ClassC;

public class ClassA {

	public static void main(String[] args) {
		ClassA a = new ClassA();
		ClassB b = a.new ClassB();
		ClassC c = b.new ClassC();
	}

	// 클래스 안의 내용을 숨기고 싶을때 class내부에 class를 만드는 중첩 클래스 사용하여 외부에 보여주지 않음
	class ClassB {
		class ClassC {

		}
	}
}
