package kr.or.ddit.study08;

public class LoginImple implements ILogin {

	@Override
	public boolean login(String id, String pass) {
		System.out.println("컴퓨터로 로그인");
		return false;
	}

	@Override
	public boolean sign(String id, String pass, String name, String tel) {
		return false;
	}

}
