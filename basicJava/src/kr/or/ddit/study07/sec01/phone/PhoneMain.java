package kr.or.ddit.study07.sec01.phone;

public class PhoneMain {
	public static void main(String[] args) {
		FolderPhone fp = new FolderPhone();
		fp.call();// FolderPhone에서 Phone에 대한 메서드를 상속받아서 바로 사용 가능함

		CameraPhone cp = new CameraPhone();
		cp.call();
		
		SmartPhone sp = new SmartPhone();
		sp.call();
		IPhone1Gen ip = new IPhone1Gen();
		ip.call();
		ip.internet();
		ip.touch();
		ip.camera();
	}
}
