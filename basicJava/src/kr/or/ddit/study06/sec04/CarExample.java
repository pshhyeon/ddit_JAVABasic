package kr.or.ddit.study06.sec04;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car(10);
		car.isLeftGas();
		car.run();
		car.addGas(10);
		car.run();
	}
}
