package kr.or.ddit.study08;

// Imple > IBoard를 상속받은 클래스임을 나타낸다
public class BoardImple implements IBoard {

	@Override
	public void writeBoard(String title, String content) {

		ILogin login = null;

		boolean phoneChk = false;

		if (phoneChk)
			login = new MobileLoginImple();
		else
			login = new LoginImple();

		
		login.login(" id", "pass");
		// DB에 데이터 넣어주기

	}
}
