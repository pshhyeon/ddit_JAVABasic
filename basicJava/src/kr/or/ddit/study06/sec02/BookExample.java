package kr.or.ddit.study06.sec02;

public class BookExample {
	public static void main(String[] args) {
		// 책 클래스 2개 만들고 각각 데이터 입력 및 출력 해보기
		Book book1 = new Book();
		book1.name = "ㄱㄱㄱ";
		book1.writer = "ㄱㄱㄱ";
		book1.date = 20240101;
		book1.content = "ㄱㄱㄱ";

		Book book2 = new Book();
		book2.name = "ㄱㄱㄱ";
		book2.writer = "ㄱㄱㄱ";
		book2.date = 20240102;
		book2.content = "ㄱㄱㄱ";

		System.out.println(book1);
		System.out.println(book2);

	}
}
