package ch07;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i = 0; i < cards.length; i++) {
			if(i == 0) {
				cards[i] = new SutdaCard();
			} else if(i == 2 || i == 7) {
				cards[i] = new SutdaCard(i + 1, true);
			} else if(i >= 10){
				cards[i] = new SutdaCard(i - 9, false);
			} else {
				cards[i] = new SutdaCard(i + 1, false);
			}
		}
	}
	
	void shuffle() {	
		for(int i = 0; i < cards.length; i++) {
			int j = (int)(Math.random() * 20);
			SutdaCard temp = cards[i];
			cards[i] = cards[j];
			cards[j] = temp;
		}
	}
	
	SutdaCard pick(int index) {
		return cards[index];
	}
	
	SutdaCard pick() {
		int index = (int)(Math.random()*20);
		return cards[index];
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info() 대신 Object 클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + (isKwang ? "k" : "");
	}
}

public class Exercise7_1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		
		deck.shuffle();
		
		for(int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ", ");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));
	}

}
/* 
섯다카드 20장을 포함하는 섯다카드 한 벌을 정의한 것이다. 섯다카드 20장을 담는 SutdaCard 배열을
초기화하시오. 단, 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한 쌍씩 있고, 숫자가 1, 3, 8인 경우에는
둘 중의 한 장은 광(Kwang)이어야 한다. 즉, SutdaCard의 인스턴스 변수 isKwang의 값이 true이어야 한다.
*/