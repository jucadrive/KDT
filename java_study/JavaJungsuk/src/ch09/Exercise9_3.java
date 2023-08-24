package ch09;



public class Exercise9_3 {
	public static int count(String src, String target) {
		int count = 0;	// 찾은 횟수
		int pos = 0; // 찾기 시작할 위치
		
	// (1) 반복문을 사용해서 아래의 과정을 반복한다.
		while(true) {
			// 1. src에서 target을 pos의 위치부터 찾는다.
			pos = src.indexOf(target, pos);
			
			// 2. 찾으면 count의 값을 1 증가시키고, pos의 값을 target.length 만큼 증가시킨다.
			if(pos != -1) {
				count++;
				pos += target.length();	// pos를 찾은 단어 이후로 옮긴다.
			} else {
				// 3. indexOf의 결과가 -1이면 반복문을 빠져나가서 count를 반환한다.
				break;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB", "AB"));
		System.out.println(count("12345", "AB"));
		
	}

}

// indexOf()는 지정된 문자열을 찾아서 그 위치를 알려준다. 만일 찾지 못한다면 -1을 반환한다.
// 지정된 문자열을 찾으면 변수 count를 1 증가시키고, 찾기 시작할 위치를 찾은 문자열 이후로
// 변경해 주어야 그 다음에 나오는 일치하는 문자열을 찾을 수 있다.
// 그래서 찾은 위치(pos)에 찾은 문자열의 길이(target.length())를 더해주는 것이다.