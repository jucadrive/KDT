package ch09;

public class Exercise9_4 {
	public static boolean contains(String src, String target) {
		boolean result = src.indexOf(target) > 0 ? true : false;
		return result;
		// return src.indexOf(target) != -1;
	}

	public static void main(String[] args) {
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345", "67"));
	}

}
