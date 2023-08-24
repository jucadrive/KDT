package ch09;

class Card {
	String kind;
	int num;
	
	Card() {
		this("SPADE", 1);
	}
	Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
}

public class Ex9_4 {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
// toString() : 인스턴스에 대한 정보를 문자열(String)로 제공할 목적으로 정의한 것이다.
// 인스턴스의 정보를 제공한다는 것은 대부분의 경우 인스턴스 변수에 저장된 값들을 문자열로 표현한다는 뜻

/*
public String toString() {
	return getClass().getName() + "@" + Integer.toHexString(hashCode());
 */

// 서로 다른 인스턴스에 대해서 toString()을 호출하였으므로 클래스의 이름은 같아도 해시코드값이 다르다는 것을 확인할 수 있다.
 