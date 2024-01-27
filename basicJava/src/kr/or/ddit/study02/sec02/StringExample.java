package kr.or.ddit.study02.sec02;

public class StringExample {
	public static void main(String[] args) {
		/*
		 * 문자와 문자열
		 * 문자(char)		: 한글자로 ' '로 묶여서 선언
		 * 문자열(String)	: 복수개의 글자로 구성된 자료(기본 타입x)
		 * 				  " "묶어서 선언 
		 */

		String name1 = "홍길동";
		String name2 = new String("305호");
		System.out.println(name2 + ", " + name1);
		
		/*
		 * \n	: 개행 스크린 커스 위치를 다음줄의 처음 으로 옮김
		 * \t	: 수평탭 스크린 커서를 다음 탭으로 롬김 
		 * \r	: 캐리지 리턴 스크린 커서의 위치를 전체줄의 처음으로 롬김 
		 * \"	: 큰따옴표를 출력할때 사용 
		 * \'	: 작은 따옴표를 출력할때 사용
		 * 
		 */
		String nameEnter = name2 + "\n" + name1;
		System.out.println(nameEnter);

		String nameTab = name2 + "\t" + name1;
		System.out.println(nameTab);

		String nameTTa = "\"" + name2 + "\t" + name1 + "\"";
		System.out.println(nameTTa);

		String nameSlash = name2 + "\\\t\\" + name1; // 역슬래쉬(\) 하나당 하나만 이스케이프 시켜준다
		System.out.println(nameSlash);

		String year = "" + 20 + 23;
		System.out.println(year);
		
	}
}
