package LeeHaNeul;

public class Statements2 {
	public static void main(String[] args) {

		System.out.println("오늘 너무 추워요!");
		System.out.println("오늘 너무 추워요!");
		System.out.println("오늘 너무 추워요!");
		System.out.println("오늘 너무 추워요!");

		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		// 복사 붙여넣기 코드로 반복작업을 수행하는 것은 유지보수 측면에서 좋은 방법이 아님

		// 반복문
		// for - 지정한 횟수만큼 어떤 작업을 반복
		// for (초기식; 조건식; 증감식){ 반복 실행문(들); <본체>}
		// i,j,k,l,m
		// 증감식의 코드에 따라 원하는 조건만큼 반복될 수, 반복되지 않을 수 있다

		// for (int i = 1; i <= 5; i = i + 1) {
		// for (int i = 1; i <= 5; i += 1) {
		for (int i = 1; i <= 5; ++i) {
			System.out.println("오늘 너무 추워요!");
		}

		for (int i = 1; i <= 5; ++i)
			System.out.println(i);
		for (int i = 1; i <= 100; ++i)
			System.out.println(i);
		for (int i = 1; i <= 100; i = i + 2) // i += 2
			System.out.println(i); // if ( i % 2 != 0) *특정조건식은 조건식이 아닌 반복 실행문에 입력
		for (int i = 2; i <= 100; i = i + 2) // i += 2
			System.out.println(i);
		// 동일한 결과값이 나오더라도 비용에 최적화 될 수 있게 코드를 작성하는 것이 중요!!

		// 구구단
		// 5 x 1 = 5
		// 5 x 2 = 10
		// .......
		// 5 x 9 = 45

		String fmt = "%d x %d = %d \n";
		for (int i = 1, j = 5; i <= 9; ++i) {
			System.out.printf(fmt, j, i, i * j);
		}

		System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3");
		System.out.println("----------------------------------------------");

		for (int i = 1; i <= 10; ++i)
			System.out.printf("%d \t %d  \t %d  \t %d  \t %d  \t %d  \t %d%n", i, 2 * i, 2 * i - 1, i * i, 11 - i,
					1 % 3, i / 3);

		// 중첩 for문

		for (int i = 1; i <= 5; ++i) {
			for (int j = 1; j <= 10; ++j) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		// 직각삼각형 그리기
		// *
		// **
		// ***
		// ****
		// *****

		for (int i = 1; i <= 5; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		// 반대로 출력할 때

		for (int i = 1; i <= 5; ++i) {
			// for (int j = 1; j <= (6 - i); ++j) {
			for (int j = 5; j >= i; j -= 1) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}
}
