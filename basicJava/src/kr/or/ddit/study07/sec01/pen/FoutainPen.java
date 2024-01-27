package kr.or.ddit.study07.sec01.pen;

public class FoutainPen extends BallPen {
	// 남은양
	// 칼라

	// 리필 메소드
	public void refill(int add) {
		setAmount(getAmount() + add);
	}
}
