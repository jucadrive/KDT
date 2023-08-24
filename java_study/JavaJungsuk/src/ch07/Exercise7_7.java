package ch07;

class Outer4 {
	static class Inner {
		static int iv = 200;
	}
}

public class Exercise7_7 {

	public static void main(String[] args) {
		System.out.println(Outer4.Inner.iv);
	}

}
