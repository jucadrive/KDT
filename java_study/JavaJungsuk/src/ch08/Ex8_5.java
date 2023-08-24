package ch08;

public class Ex8_5 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0 / 0);	// 예외 발생
			System.out.println(4);	// 실행되지 않음
		} catch (ArithmeticException e) {
			e.printStackTrace();	// 참조변수 e를 통해 AritmeticException 인스턴스에 접근할 수 있다.
			System.out.println("예외 메시지 : " + e.getMessage());
		}	// try-catch문 끝
		System.out.println(6);
	}

}
