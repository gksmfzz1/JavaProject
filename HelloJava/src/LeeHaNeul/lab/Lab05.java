package LeeHaNeul.lab;

import java.util.Scanner;

public class Lab05 {
	public static void main(String[] args) {

		// 예제 4-6

		// System.out.print("현재 월을 입력하세요.>");

		// Scanner scanner = new Scanner(System.in);
		// int month = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 month에 지정

		// switch (month) {
		// case 3:
		// case 4:
		// case 5:
		// System.out.println("현재의 계절은 봄입니다.");
		// break;
		// case 6:
		// case 7:
		// case 8:
		// System.out.println("현재의 계절은 여름입니다.");
		// break;
		// case 9:
		// case 10:
		// case 11:
		// System.out.println("현재의 계절은 가을입니다.");
		// break;
		// case 12:
		// case 1:
		// case 2:
		// System.out.println("현재의 계절은 겨울입니다.");
		// break;
		// }
		// scanner.close();

		// 예제 4-7

		// System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");

		// Scanner sc = new Scanner(System.in);
		// int user = sc.nextInt(); // 화면을 통해 입력받은 숫자를 user에 저장
		// int com = (int) (Math.random() * 3) + 1; // 1,2,3 중 하나가 com에 저장함

		// System.out.println("당신은" + user + "입니다.");
		// System.out.println("컴은" + com + "입니다.");

		// switch (user - com) {
		// case 2:
		// case -1:
		// System.out.println("당신이 졌습니다.");
		// break;
		// case 1:
		// case -2:
		// System.out.println("당신이 이겼습니다.");
		// break;
		// case 0:
		// System.out.println("비겼습니다.");
		// break;
		// } sc.close();

		// 예제 4-8

		System.out.print("당신의 주민번호를 입력하세요. (011231-1111222)>");

		Scanner sc = new Scanner(System.in);
		String regNo = sc.nextLine();

		char gender = regNo.charAt(7);

		switch (gender) {
		case '1':
		case '3':
			System.out.println("당신은 남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("당신은 여자입니다.");
			break;
		default:
			System.out.println("유효하지 않은 주민등록번호입니다.");
		}
		sc.close();

	}
}
