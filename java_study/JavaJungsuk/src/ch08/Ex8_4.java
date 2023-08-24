package ch08;

public class Ex8_4 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);	// 실행되지 않는다
		} catch (ArithmeticException e) {
			if(e instanceof ArithmeticException) {
				System.out.println("true");
			}
			System.out.println("AritmeticException");
		} catch (Exception e) {
			System.out.println("Exception");
		}	// try-catch 문 끝
		System.out.println(6);
	}

}
