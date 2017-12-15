package LeeHaNeul.lab;

import java.util.Scanner;

public class Lab08 {

	public static void main(String[] args) {

		// 예제 4-26
		int sum = 0;
		int i = 0;

		while ((sum += ++i) <= 100) {
			System.out.printf("%d - %d\n", i, sum);
		}

		// 예제 4-27
		int num;
		sum = 0;
		boolean flag = true;
		System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)");

		while (flag) {
			System.out.println(">>");

			Scanner sc = new Scanner(System.in);
			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);

			if (num != 0) {
				sum += num;
			} else {
				flag = false;
			}
			System.out.println("합계:" + sum);
		}
		// 연습문제 4-4

	}

}
