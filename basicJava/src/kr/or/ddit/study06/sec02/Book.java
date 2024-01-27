package kr.or.ddit.study06.sec02;

public class Book {
	// 책제목, 작성자, 등록일, 책설명
	String nation;
	String name;
	String writer;
	int date;
	String content;

	@Override
	public String toString() {
		return "Book [name=" + name + ", writer=" + writer + ", date=" + date + ", content=" + content + "]";
	}
}
