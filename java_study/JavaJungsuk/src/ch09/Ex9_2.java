package ch09;

class Person {
	long id;
	
	public boolean equals(Object obj) {
		if(obj instanceof Person) {	// obj가 Person의 인스턴스라면
			return this.id == ((Person)obj).id;	// obj가 Object 타입이므로 id 값을 참조하기 위해서는 Person 타입으로 형변환이 필요하다.
		} else {
			return false;
		}
	}
	
	Person(long id) {
		this.id = id;
	}
}

public class Ex9_2 {

	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1.equals(p2))
			System.out.println("p1과 p2는 같은 사람이다");	// 출력
		else
			System.out.println("p1과 p2는 다른 사람이다");
	}

}
// equals() 메서드는 두 참조변수에 저장된 값(주소값)이 같은지를 판단하는 기능밖에 할 수 없다
// equals() 메서드를 오버라이딩하여 주소가 아닌 객체에 저장된 내용을 비교하도록 변경할 수 있다.
// 위 예제의 경우 Person 인스턴스의 주소값이 아닌 멤버변수 id의 값을 비교하도록 오버라이딩 했다.