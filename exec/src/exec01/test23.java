package exec01;

public class test23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaDeck deck = new SutdaDeck();
		Tv t = new Tv();
		Chi c = new Chi();
		MyTv2 t2 = new MyTv2();

		System.out.println(t);

		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();

		for (int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + " ");
		}
		System.out.println("x = " + c.getX());
		System.out.println();
		System.out.println(deck.pick(0));

		t2.setChannel(10);
		System.out.println("CH : " + t2.getChannel());
		t2.setChannel(20);
		System.out.println("CH : " + t2.getChannel());

		t2.gotoPrevChannel();
		System.out.println("CH : " + t2.getChannel());

		t2.gotoPrevChannel();
		System.out.println("CH : " + t2.getChannel());

		t2.setVolume(20);
		System.out.println("VOL : " + t2.getVolume());

	}
}

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		// 7-1
		for (int i = 0; i < cards.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
			cards[i] = new SutdaCard(num, isKwang);
		}
	}

	public void shuffle() { // 7-2
		SutdaCard card = new SutdaCard(); // int랑 boolean값이 두개 들어있음.
		int random = (int) (Math.random() * cards.length);
		for (int i = 0; i < cards.length; i++) {
			card = cards[i];
			cards[i] = cards[random];
			cards[random] = card;
		}
	}

	SutdaCard pick(int index) {
		if (index < 0 || index >= CARD_NUM) {
			return null;
		}
		return cards[index];
	}

	SutdaCard pick() {
		int random = (int) ((Math.random()) * cards.length);
//		 return cards[random];
		return pick(random); // 오버로딩
	}
}

class SutdaCard {
	final int NUM;
	final boolean IS_KWANG;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.NUM = num;
		this.IS_KWANG = isKwang;
	}

	public String toString() {
		return NUM + (IS_KWANG ? "k" : "");
	}
}

class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}

}

class Tv extends Product {
	Tv() {
		super(2000);
	}

	public String toString() {
		return "Tv";
	}
}

class Par {
	int x = 100;

	Par() {
		this(200);
	}

	Par(int x) {
		this.x = x;
	}

	int getX() {
		return x;
	}
}

class Chi extends Par {
	int x = 3000;

	Chi() {
		this(1000);
	}

	Chi(int x) {
		this.x = x;
	}
}

class MyTv2 { // 7-10
	boolean isPowerOn;
	int channel;
	int volume;
	int prevChannel;
	int temp;

	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 0;

	public int getChannel() {
		return this.channel;
	}

	public void setChannel(int channel) {
		if (channel > MAX_CHANNEL || channel < MIN_CHANNEL) {
			return;
		}
		prevChannel = this.channel; // 현재 채널을 이전 채널에 저장
		this.channel = channel;
	}

	public int getVolume() {
		return this.volume;
	}

	public void setVolume(int volume) {
		if (volume > MAX_VOLUME || volume < MIN_VOLUME) {
			return;
		}
		this.volume = volume;
	}

	public void gotoPrevChannel() {
		setChannel(prevChannel); // 현재 채널을 이전 채널로 변경
	}
}
