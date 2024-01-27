package kr.or.ddit.study06.sec06;

public class ProdTest {
	public static void main(String[] args) {
		Prod p1 = new Prod();
		p1.setPrice(30000);
		p1.setName("qqq");
		p1.setContents("www");
		
		System.out.println(p1.getName() + "의 상품정보: " + p1);
	}
}
