package kr.or.ddit.study06.sec04;

public class Car {
	int gas;

	public Car(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("연료가 없습니다.");
			return false;
		} else {
			System.out.println("연료가 " + gas + " 만큼 남았습니다");
			return true;
		}
	}

	void addGas(int gas) {
		this.gas += gas;
	}

	void run() {
		while (true) {
			gas -= 1;
			if (gas <= 3) {
				System.out.println("연료가 부족합니다.");
				System.out.println("바로 주유해야 합니다.");
				return;
			} else {
				System.out.println("정상운행이 가능합니다.");
				System.out.println("남은연료량: " + gas);
			}
		}
	}
}
