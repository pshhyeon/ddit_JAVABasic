package kr.or.ddit.study08;

public class MobileLoginImple implements ILogin {

	@Override
	public boolean login(String id, String pass) {
		System.out.println("터치패드 키보드로 구현");
		return false;
	}

	@Override
	public boolean sign(String id, String pass, String name, String tel) {
		return false;
	}

}
