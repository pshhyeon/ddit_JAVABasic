package kr.or.ddit.study13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		// HashMap
		// key와 value로 이루어짐
		// key값은 중복을 허용하지 않고 순서가 보장되지 않음
		// Map타입의 컬렉션

		// 주요 메소드
		// .put(key. value): 데이터 입력 key값은 중복 되지 않음. value는 중복 될 수 있음
		// .get(key): 입력 받은 value값을 key값을 통해 꺼내올 수 있음
		// .keySet(): key로 이루어진 hashSet값을 가져옴

//		HashMap map = new HashMap();
		Map map = new HashMap(); // Map은 인터페이스로 Map컬렉션의 HashMap사용(HashMap이 제일 빠름)
		// 나중에 시간되면 Hash에 대해 공부하기(암호관련내용)
		map.put("김동윤", "305호");
//		map.put("김동윤", "307호");
		map.put("김선경", "305호");
		map.put("허주희", "406호");

		String str = (String) map.get("김동윤"); // object type으로 인식하기 떄문에 캐스팅을 해줘야함

		System.out.println(map.get("김동윤"));
		System.out.println(map.get("허주희"));

		Map<String, String> map2 = new HashMap();
		map2.put("김동윤", "305호");
		map2.put("김동윤", "307호");
		map2.put("김선경", "305호");
		map2.put("허주희", "406호");
		String str2 = map2.get("허주희");
		// map의 객체를 생성할때 generic을 String으로 지정했기 때문에 꺼낼때도 무조건 String이다
		// 다만 다른타입의 데이터를 저장할 수 없다

		Set set = map2.keySet(); // set에 있던값을 꺼낼때 사용하는것: iterator
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			// String key = (String) it.next();
			// Iterator의 generic을 String으로 지정했기 때문에 캐스팅 불필요
			String key = it.next();
			String value = map2.get(key);
			System.out.println("key: " + key + ", value: " + value);
			// map은 key에대해 중복을 허용하지 않아서 최근에 저장된 데이터로 저장된다 > "김동움" "305호"-삭제
		}

	}
}
