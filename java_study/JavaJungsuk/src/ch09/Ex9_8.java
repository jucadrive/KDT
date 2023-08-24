package ch09;

public class Ex9_8 {

	public static void main(String[] args) {
		// 길이가 0인 char 배열을 생성한다.
		char[] cArr = new char[0];	// char[] cArr = {}; 와 같다
		String s = new String(cArr);	// String s = new String(""); 와 같다.
		
		System.out.println("cArr.length = " + cArr.length);
		System.out.println("@@@" + s + "@@@");
	}

}
// String s = "";  ->  참조변수 s가 참조하고 있는 String 인스턴스는 내부에
// new char[0]과 같이 길이가 0인 char형 배열을 저장하고 있는 것이다.
// char 형 변수에는 반드시 하나의 문자를 지정해야한다.

// String은 참조형 타입의 기본값인 null 보다는 빈 문자열로,	String s = "";
// char형은 '\u0000' 대신 공백으로 초기화하는 것이 보통이다. char c = ' ';