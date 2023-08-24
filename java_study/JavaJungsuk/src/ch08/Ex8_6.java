package ch08;

public class Ex8_6 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("일부러 발생시켰다.");
			throw e;
			// == throw new Exception("일부러 발생시켰다"); 
		} catch (Exception e) {
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었음.");
	}

}
