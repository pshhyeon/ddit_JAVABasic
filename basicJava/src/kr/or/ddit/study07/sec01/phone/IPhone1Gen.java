package kr.or.ddit.study07.sec01.phone;

public class IPhone1Gen extends SmartPhone {

	public void appstore() {
		System.out.println("앱스토어");
	}

	@Override
	public void camera() {
		// super.camera();
		System.out.println("1000만 화소 카메라"); // 기존 부모클래스의 카메라 메서드 재정의
	}
}
