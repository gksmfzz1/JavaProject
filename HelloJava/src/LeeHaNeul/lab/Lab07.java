package LeeHaNeul.lab;

import java.io.IOException;
import java.util.Scanner;

public class Lab07 {
	public static void main(String[] args) throws IOException {

		// #22 - 윤년 여부 확인
		// 현재 연도가 400으로 나눠 떨어지거나
		// 현재 연도가 4로 나눠 떨어지지만
		// 100으로는 나눠 떨어지지 않음
		// GregorianCalendar gc = new GregorianCalendar(); // 윤년여부 확인하는 명령어
		// System.out.println(gc.isLeapYear(2000)); // true // 실행문
		// System.out.println(gc.isLeapYear(1999)); // false
		// System.out.println(gc.isLeapYear(1992)); // true

		// if (gc.isLeapYear(year))
		// System.out.printf("%d는 윤년입니다", year);
		// else
		// System.out.printf("%d는 윤년이 아닙니다", year);

		// String welCome = "윤년 확인할 연도를 입력하세요 :\n";
		// String fmt1 = "%d년은 윤년입니다";
		// String fmt2 = "%d년은 윤년이 아닙니다";

		// System.out.print(welCome);
		// Scanner sc = new Scanner(System.in);
		// int year = sc.nextInt();

		// if ((year % 4 == 0) && (year % 100 != 0)) {
		// System.out.printf(fmt1, year);
		// } else if (year % 400 == 0) {
		// System.out.printf(fmt1, year);
		// } else {
		// System.out.printf(fmt2, year);
		// }

		// if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
		// System.out.printf(fmt1, year);
		// else
		// System.out.printf(fmt2, year);

		// #23 - 복권 발행 프로그램
		// 특정범위를 포함하는 난수 생성
		int rand = (int) (Math.random() * 100000);
		int lott = rand % ((999 - 100) + 1) + 100;
		System.out.println(lott);

		Scanner sc = new Scanner(System.in);
		System.out.println("로또번호를 입력하세요");
		String luck = sc.nextLine();

		char lucky1 = luck.charAt(0);
		char lucky2 = luck.charAt(1);
		char lucky3 = luck.charAt(2);
		char lotto1 = ("" + lott).charAt(0); // <<<<<int값을 String형태로 으로 변형
		char lotto2 = ("" + lott).charAt(1);
		char lotto3 = ("" + lott).charAt(2);

		// 비교
		// int match = 0;
		// if (lotto1 == lucky1 || lotto1 == lucky2 || lotto1 == lucky3) {
		// ++match;
		// }
		// if (lotto2 == lucky1 || lotto2 == lucky2 || lotto2 == lucky3) {
		// ++match;
		// }
		// if (lotto3 == lucky1 || lotto3 == lucky2 || lotto3 == lucky3) {
		// ++match;
		// }
		String lotto4 = "" + lott;
		int size = lotto4.length();
		int match = 0;
		for (int i = 0; i < size; ++i)
			for (int j = 0; j < size; ++j)
				if (luck.charAt(i) == lotto4.charAt(j))
					++match;

		String msg = "꽝이군요! 다음기회에!";
		switch (match) {
		case 3:
			msg = "모두 일치! 상금 1백만원!";
			break;
		case 2:
			msg = "2개 일치! 상금 만원!";
			break;
		case 1:
			msg = "1개 일치! 상금 천원!";
			break;
		}
		System.out.println(msg);

		// 정수난수값 % ((마지막값 - 시작값)+ 1) + 시작값 >>>>특정범위의 난수 생성식
		// 복권 숫자 범위 : 100-999
		// lotto: 657, lucky : 452 = 1개 일치
		// lotto: 657, lucky : 524 = 1개 일치
		// lotto: 657, lucky : 123 = 0개 일치
		// lotto: 657, lucky : 726 = 2개 일치
		// lotto: 657, lucky : 626 = 2개 일치 <<<<< 중복되는 숫자에 따라 오류가 나올 수 있음

		// #24
		// Scanner sc = new Scanner(System.in);
		// String welcome = "출력할 구구단의 단을 입력하세요 (1-9)";
		// System.out.println(welcome);
		// int gu = sc.nextInt();
		// if (gu >= 10) {
		// System.out.println("1부터 9까지 입력하세요");
		// }

		// String fmt = "%2d x %2d = %3d \n"; // %d 앞에 자릿수에 맞게 숫자를 붙이면 더 보기 좋게 출력됨
		// for (int i = 1, j = gu; i <= 19; ++i) {
		// System.out.printf(fmt, j, i, i * j);
		// }

		// fmt = "%d x %d = %d \t";
		// for (int i = 1, j = gu; i <= 9; ++i) {
		// System.out.printf(fmt, j, i, i * j);
		// }

		// # 25
		// 소문자 a : 97 대문자 A : 65
		// System.out.println("소문자 알파벳을 대문자로 바꿔드립니다!");
		// System.out.println("소문자 알파벳을 입력하세요");
		// int ch = System.in.read();
		//
		// char는 int로 int는 char로 형변환가능
		// 소문자 (a: 97 - z: 122) 이외의 문자가 입력되면 경고메세지 출력
		// if (ch < 97 || ch > 122) {
		// System.out.println("잘못 입력하셨습니다!");
		// } else {
		// ch = ch - 32;

		// System.out.println((char) ch);
		// }

		// # 26 - 임의의 숫자 맞추기
		// while문 안에 임의의 변수를 넣으면 계속해서 난수를 생성하기 때문에 값이 고정이 안됨

		int num2 = (int) (Math.random() * 100) + 1;
		Scanner sc1 = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");

		while (true) {
			int num1 = sc1.nextInt();
			if (num1 > num2) {
				System.out.println("추측한 숫자가 큽니다");
			} else if (num1 < num2) {
				System.out.println("추측한 숫자가 작습니다");
			} else if (num1 == num2) {
				System.out.println("정답입니다");
				break;
			}
		}

		// # 27
		// int number = 0;
		// int sum = 0;
		// while (number < 20) {
		// number++;
		// sum += number;
		// if (sum >= 100)
		// break;

		// }
		// System.out.printf("num: %d sum: %d", number, sum);
		// # 28
		// int sum = 0;
		// int num = 0;
		// while (num < 20) {
		// System.out.println(num);
		// num++;
		// if (num == 10 || num == 11)
		// continue;
		// sum += num;
		// }
		// System.out.printf("num : %d sum : %d", num, sum);

		// # 30
		// String fmt = "%2d | %d %2d %2d %2d %2d %2d %2d %2d %2d";
		// System.out.println("\tMultiplication Table");
		// System.out.print(" 1 2 3 4 5 6 7 8 9");
		// System.out.print("\n------------------------------");
		// for (int i = 1; i <= 9; ++i) {
		// System.out.println("");
		// System.out.printf(fmt, i, i, i * 2, i * 3, i * 4, i * 5, i * 6, i * 7, i * 8,
		// i * 9);
		//
		// }
		//
		// 노가다
		// String fmt;
		// fmt = " Multiplication Table \n";
		// fmt += " 1 2 3 4 5 6 7 8 9 \n";
		// fmt += "_________________________________________ \n";
		// fmt += "1 | 1 2 3 4 5 6 7 8 9 \n";
		// fmt += "2 | 2 4 3 4 5 6 7 8 9 \n";
		// fmt += "3 | 3 6 3 4 5 6 7 8 9 \n";
		// fmt += "4 | 4 8 3 4 5 6 7 8 9 \n";
		// fmt += "5 | 5 10 3 4 5 6 7 8 9 \n";
		// fmt += "6 | 6 12 3 4 5 6 7 8 9 \n";
		// fmt += "7 | 7 2 3 4 5 6 7 8 9 \n";
		// fmt += "8 | 8 2 3 4 5 6 7 8 9 \n";
		// fmt += "9 | 9 2 3 4 5 6 7 8 9 \n\n";
		//
		// System.out.printf(fmt);
		//
		// String fmt;
		// fmt = " Multiplication Table \n";
		// fmt += " 1 2 3 4 5 6 7 8 9 \n";
		// fmt += "_________________________________________ \n";
		//
		// System.out.println(fmt);
		// for (int i = 1; i <= 9; ++i) {
		// fmt = "%d | %3d %2d %2d %2d %2d %2d %2d %2d %2d \n";
		// System.out.printf(fmt, i, i * 1, i * 2, i * 3, i * 4, i * 5, i * 6, i * 7, i
		// * 8, i * 9);
		// }
		//
		// String fmt;
		// fmt = " Multiplication Table \n";
		// fmt += " 1 2 3 4 5 6 7 8 9 \n";
		// fmt += "_________________________________________ \n";
		// System.out.println(fmt);
		// for (int i = 1; i <= 9; ++i) {
		// System.out.printf("%d | %3d", i, i);
		// for (int j = 2; j <= 9; ++j) {
		//
		// System.out.printf(" %2d", j * i);
		// }
		// System.out.println("");
		// }

	}
}
