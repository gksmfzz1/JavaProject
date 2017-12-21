package LeeHaNeul.lab;

public class Lab15 {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption = true;
		ctv.displayCaption("Hello, World");

		// #본문 7-3
		// Deck d = new Deck();
		// Card c = d.pick(0);
		// System.out.println(c);
		//
		// d.shuffle();
		// c = d.pick(0);
		// System.out.println(c);
		// String str = "123";
		// System.out.println(str + "는 숫자입니까?" + isNumber());
		//
		// str = "1234o";
		// System.out.println(str + "는 숫자입니까?" + isNumber());
		String a = "0";
	}

}

class Tv {
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}
}

class CaptionTv extends Tv {
	boolean caption;

	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}

// 본문 7-3
// class Deck {
// final int CARD_NUM = 52;
// Card cardArr[] = new Card[CARD_NUM];
//
// Deck() {
// int i = 0;
//
// for (int k = Card.KIND_MAX; k > 0; --k)
// for (int n = 0; n < Card.NUM_MAX; ++n)
// cardArr[++i] = new Card(k, n + 1);
// }
//
// Card pick(int index) {
// return cardArr[index];
// }
//
// Card pick() {
// int index = (int) (Math.random() * CARD_NUM);
// return pick(index);
// }
//
// void shuffle() {
// for (int i = 0; i < cardArr.length; ++i) {
// int r = (int) (Math.random() * CARD_NUM);
//
// Card temp = cardArr[i];
// cardArr[i] = cardArr[r];
// cardArr[r] = temp;
// }
// }
//
// }
//
// class Card {
// static final int KIND_MAX = 4;
// static final int NUM_MAX = 13;
//
// static final int SPADE = 4;
// static final int DIAMOND = 3;
// static final int HEART = 2;
// static final int CLOVER = 1;
// int kind;
// int number;
//
// Card() {
// this(SPADE, 1);
// }
//
// Card(int kind, int number) {
// this.kind = kind;
// this.number = number;
// }
//
// public String toString() {
// String[] kinds = { "", "CLOVER", "HEART", "DIAMOND", "SPADE" };
// String numbers = "0123456789XJQK";
// return "kind : " + kinds[this.kind] + ", number :" +
// numbers.charAt(this.number);
// }
// }

class Exercise6_22 {

	public Exercise6_22() {

	}

	public static boolean isNumber(String str) {
		if (str == null || str.equals(""))
			return false;

		for (int i = 0; i <= str.length(); ++i) {
			char ch = str.charAt(i);

			if (ch < '0' || ch > '9') {
				return false;
			}
		}
		return true;
	}
}
