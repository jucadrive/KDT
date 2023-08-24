package ch10;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("시동을 건다.");
	}
	public void turnOff() {
		System.out.println("시동을 끈다.");
	}
	
	public void washCar() {}	// 추상 메서드 아님, 구현 내용만 없을 뿐.
	
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}
