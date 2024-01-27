package kr.or.ddit.study06.sec06;

public class Prod {
	// 상품 가격, 이름, 내용
	private int price;
	private String name;
	private String contents;

	public Prod() {
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	@Override
	public String toString() {
		return "Prod [price=" + price + ", name=" + name + ", contents=" + contents + "]";
	}

}
