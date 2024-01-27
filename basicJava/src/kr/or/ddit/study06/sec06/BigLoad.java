package kr.or.ddit.study06.sec06;

public class BigLoad {
	private static BigLoad instance = null;

//	private BigLoad() {
	// test를 위해 public으로 임시 변경
	public BigLoad() {
		try {
			Thread.sleep(5000); // 5초
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static BigLoad getInstance() {
		if (instance == null) {
			instance = new BigLoad();
		}
		return instance;
	}
}
