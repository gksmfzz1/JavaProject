package LeeHaNeul.lab;

public class Lab14 {
	public static void main(String[] args) {

		// # 6-1, 6-2
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();

		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}

// # 6-1, 6-2
class SutdaCard {
	int num;
	boolean isKwang;

	public SutdaCard() {
		this(1, true);
	}

	public SutdaCard(int num, boolean isKwang) {

		this.num = num;
		this.isKwang = isKwang;
	}

	String info() {
		return num + (isKwang ? "K" : "");
	}
}

// # 6-6, 6-7
class MyPoint {
	int x;
	int y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	double getDistance(int x1, int y1) {
		return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
	}

}
