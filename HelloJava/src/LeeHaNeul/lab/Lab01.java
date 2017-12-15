package LeeHaNeul.lab;

import java.util.Scanner;

public class Lab01 {
	public static void main(String[] args) {
		// HARRY 출력
		System.out.println("*   *	  **  	****  	****  	*   *		");
		System.out.println("*   *	 *  * 	*   * 	*   * 	*   *		");
		System.out.println("*****	*    *	****  	****  	 * * 		");
		System.out.println("*   *	******	*   * 	*   * 	  *	 		");
		System.out.println("*   *	*    *	*    *	*    *	  *	 		");
		System.out.println("            +---+");
		System.out.println("            l   l");
		System.out.println("        +---+---+");
		System.out.println("        l   l   l");
		System.out.println("    +---+---+---+	 /\\_/\\    ");
		System.out.println("    l   l   l   l	( ' ' )		");
		System.out.println("+---+---+---+---+	(  -  ) 	");
		System.out.println("l   l   l   l   l	 l l l  	");
		System.out.println("+---+---+---+---+	(__l__) 	");

		System.out.println("  ///// ");
		System.out.println(" l o o l");
		System.out.println("(l  ^  l)");
		System.out.println(" l [_] l");
		System.out.println("  _____ ");

		String name = "sky";
		float weight = 62.7f;
		int age = 26;
		System.out.println(name);
		System.out.println(weight);
		System.out.println(age);
		Scanner sc = new Scanner(System.in);
		System.out.print("\n이름을 입력하세요\n");
		name = sc.nextLine();
		// System.out.print("몸무게를 입력하세요\n");
		// weight = Integer.parseInt(sc.nextLine());
		System.out.print("나이를 입력하세요\n");
		age = Integer.parseInt(sc.nextLine());

		// 연습문제
		// [2-2]
		// long regNo = 123456_1234567L;
		// [2-3]
		// -리터럴 : 100,3.14
		// -변수 : int, long, float
		// -키워드 : L , f
		// -상수 : final
		// [2-5]
		// System.out.println("1" + "2"); // 12
		// System.out.println(true + ""); // true
		// System.out.println('A' + 'B'); // 131
		// System.out.println('1' + 2); // 51
		// System.out.println('1' + '2'); // 99
		// System.out.println('J' + "ava"); //Java

	}
}
