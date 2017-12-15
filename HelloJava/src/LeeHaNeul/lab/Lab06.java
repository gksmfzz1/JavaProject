package LeeHaNeul.lab;

public class Lab06 {
	public static void main(String[] args) {

		// 3-1
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드 65

		System.out.println(1 + x << 33); // 6
		System.out.println(y >= 5 || x < 0 && x > 2); // true
		System.out.println(y += 10 - x++); // 13
		System.out.println(x += 2); // 5
		System.out.println(!('A' <= c && c <= 'Z')); // false
		// System.out.println('C' = c);
		System.out.println('5' - '0'); // 5
		System.out.println(c + 1); // 66
		System.out.println(++c); // B
		System.out.println(c++); // B
		System.out.println(c); // c

		// 3-2
		int numOfApples = 123;
		int sizeOfBuket = 10;
		int numOfBuket = (numOfApples / sizeOfBuket);
		System.out.println("필요한 바구니의 수 : " + numOfBuket);

		// 3-3
		int num = 10;
		System.out.println(num > 0 ? "양수" : num == 0 ? "0" : "음수");

		// 4-1
		int q = 11;
		if (q > 10 && q < 20)
			System.out.println("true");
		{
		}
		char ch = 'f';

	}
}
