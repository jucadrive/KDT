package ch08;

public class Exercise8_4 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if(b) throw new ArithmeticException();
			System.out.println(2);
		} catch (RuntimeException r) {	// ArithmeticException은 RuntimException클래스의 자손이다.
			System.out.println(3);	// 출력
			return;	// 메서드를 빠져나간다(finally 블럭을 수행한 후에)
		} catch (Exception e) {
			System.out.println(4);
			return;
		}finally {
			System.out.println(5);
		}
		
		System.out.println(6);	// method(true)의 경우 catch문에서 return;을 만나 메서드를 빠져나가므로 수행되지 않는다. 
	}

	public static void main(String[] args) {
		method(true);	// 1 3 5 
		method(false);	// 1 2 5 6
	}

}
