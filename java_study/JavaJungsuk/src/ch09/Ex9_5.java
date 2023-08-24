package ch09;

class Card2 {
	String kind;
	int num;
	
	Card2() {
		this("SPADE", 1);	// Card(String kind, int num)를 호출
	}
	
	Card2(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	
	public String toString() {
		return "kind : " + kind + ", number : " + num;
	}
}

public class Ex9_5 {

	public static void main(String[] args) {
		Card2 c1 = new Card2();
		Card2 c2 = new Card2("HEART", 10);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}

// toString()은 일반적으로 인스턴스나 클래스에 대한 정보 또는 인스턴스 변수들의 값을 문자열로 변환하여 반환하도록 오버라이딩되는 것이 보통이다.
// 위 예제에서 Object 클래스에 정의된 toString()의 접근 제어자가 public이므로 Card2 클래스의 toString()의 접근 제어자도 public이다.
// 조상에 정의된 메서드를 자손에서 오버라이딩할 때는 조상에 정의된 접근 범위보다 같거나 더 넓어야 하기 때문이다.