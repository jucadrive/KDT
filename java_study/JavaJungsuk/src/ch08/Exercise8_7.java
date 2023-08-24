package ch08;

import java.util.*;

public class Exercise8_7 {

	public static void main(String[] args) {
		// 1 ~ 100 사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;	// 사용자 입력을 저장할 공간
		int count = 0; // 시도 횟수를 세기 위한 변수
				
		do {
			count++;
			System.out.print("1과 100 사이의 값을 입력하세요 : ");
			
			// input = new Scanner(System.in).nextInt();
			
			try {
				Scanner scanner = new Scanner(System.in);
				input = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("유효하지 않은 값이다. 다시 입력해");
				continue;
			}
			
			if(answer > input) {
				System.out.println("더 큰 수를 입력해");
			} else if(answer < input) {
				System.out.println("더 작은 수를 입력해");
			} else {
				System.out.println("맞췄다");
				System.out.println("시도 횟수는 " + count + "번이다.");
				break;	// do-while 문 벗어남
			}
		}while(true);	// 무한 반복
		
	}

}
