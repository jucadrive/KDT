package ch09;



public class Ex9_1 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2))
			System.out.println("v1과 v2는 같다");
		else
			System.out.println("v1과 v2는 다르다");
	}

}

class Value {
	int value;
	
	Value(int value) {
		this.value = value;
	}
}

// equals() 메서드는 주소값으로 비교를 하기 때문에, 두 Value 인스턴스의 멤버변수 value의 값이 10으로 서로 같을지라도
// equals() 메서드로 비교한 결과는 false일 수밖에 없는 것이다.
// v1 == v2 -> 0x1234 == 0x2345 -> false
