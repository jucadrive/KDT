package ch10;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("자율주행을 한다.");
		System.out.println("자동차가 스스로 방향을 바꾼다.");
	}

	@Override
	public void stop() {
		System.out.println("장애물 앞에서 스스로 멈춘다.");
	}

	@Override
	public void washCar() {	// 훅 메소드
		System.out.println("자동 세차를 한다");
	}

	@Override
	public void wiper() {
		// TODO Auto-generated method stub
		
	}
	
}
