package LeeHaNeul.lab;

import java.util.Scanner;

public class Lab04 {
	public static void main(String[] args) {

		// #16
		// a
		// int n = 1;
		// int k = 2;
		// int r = n;

		// if (k < n)
		// r = k;
		// System.out.printf("%d%d%d", n, k, r);

		// b
		// int n = 1;
		// int k = 2;
		// int r = k + n;

		// if (n < k)
		// r = k;
		// System.out.printf("%d%d%d", n, k, r);
		// else k = n
		//

		// c
		// int n = 1;
		// int k = 2;
		// int r = k;

		// if (r < k)
		// System.out.println("n = r");
		// else
		// System.out.println(k = n);
		// d

		// int n = 1;
		// int k = 2;
		// int r = 3;

		// if (r < n + k)
		// r = 2 * n;

		// else
		// k = 2 * r;
		// System.out.printf("%d%d%d", n, k, r);

		// #17
		// x = 1;
		// y = 1;
		// if (x && y == 0) { x = 1; y = 1;} // (x && y == true) - 옳은식

		// b
		// if (1 <= x <= 10) // (x >= 1 && x <= 10) - 옳은식
		// System.out.println(x);

		// #18

		// a : 30is even. , 30is odd. // else 절이 없기 때문에 두문장이 실행됨
		// int number = 30;
		// if (number % 2 == 0)
		// System.out.println(number + "is even.");
		// else절이 들어거야하는 부분
		// System.out.println(number + "is odd.");

		// b : 35is odd.
		// int number = 35;
		// if (number % 2 == 0)
		// System.out.println(number + "is even.");
		// else
		// System.out.println(number + "is odd.");

		// #19

		// int x = 2;
		// int y = 2;
		// int z;

		// if (x > 2) {

		// if (y > 2) {

		// z = x + y;

		// System.out.println("z is " + z);
		// }
		// } else

		// System.out.println("x is " + x);

		// #20

		// int a = 3;
		// if (a++ == 3)
		// System.out.println("Three");
		// else
		// System.out.println("Four");

		// int a = 3;
		// if (++a == 3)
		// System.out.println("Three");
		// else
		// System.out.println("Four");

		// int a = 3;
		// a = a++; // 수식에 사용
		// if (a == 3)
		// System.out.println("Three");
		// else
		// System.out.println("Four");

		// int a = 3;
		// a++; // 수식에 사용되지 않고 단독으로 사용되었기 때문에 관계가 없다
		// if (a == 3)
		// System.out.println("Three");
		// else
		// System.out.println("Four");

		// #21
		// 결혼여부 isMarried , "Y" , "N" - 비용이 더욱 발생
		// 결혼여부 isMarried = true , false
		// 결혼여부 isMarried = 0 , 1

		Scanner sc = new Scanner(System.in);
		System.out.print("결혼 여부를 입력하세요 (미혼 :0 , 기혼 : 1)");
		int isMarried = sc.nextInt();
		System.out.print("연봉을 입력하세요");
		int salary = sc.nextInt();
		int tax = 0;

		if (isMarried == 0) {
			if (salary < 3000)
				tax = (int) (salary * 0.1);

			else
				tax = (int) (salary * 0.25);

		} else if (isMarried == 1) {
			if (salary < 6000)
				tax = (int) (salary * 0.1);
			else
				tax = (int) (salary * 0.25);
		}

		System.out.println(isMarried);
		System.out.println(salary);
		System.out.println(tax);

	}
}
