package kr.or.ddit.study13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {

		// ArrayList
		// 1차원 배열구조
		// 중복을 허용하고 순서화 제공
		// List타입의 대표 컬렉션

		// 주요 메소드
		// .add: 데이터 삽입
		// .clear: 모든 데이터 삭제
		// .contains: 포함 여부 확인
		// .get: idx 자료 반환
		// .remove: idx 자료 반환 후 삭제

		// 같은 방법이다 / import는 따로 해줘야 함
		//	ArrayList _l = new ArrayList();
		List l = new ArrayList();

		l.add("가");
		l.add("나");
		l.add("다");
		l.add("라");
		l.add("마");

		String str = (String) l.remove(0);
		System.out.println("삭제: " + str);

		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
	}

}
