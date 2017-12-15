package LeeHaNeul.lab;

public class Lab02 {
	public static void main(String[] args) {
		// #03~ 15
		// #03
		// int x = 1;
		// int y = 2;
		// int z = 3;
		// int result = 0; // 산수식을 만들때 변수를 지정해서 만들 수 있음

		// result = 3 * x;
		// result = 3 * x + y;
		// result = (x + y) / 7;
		// result = (3 * x + y) / (z + 2);

		// #04
		double number = (1 / 3D) * 3; // 0.0
		System.out.printf("(1/3)*3 = %f \n", (1 / 3d) * 3); // 정수 뒤에 d를 붙여 실수로 만들수 있음
															// 정수앞에 (double)를 붙여도 가능
		System.out.println(number);
		// // 정수끼리 연산 결과는 언제나 정수!!
		// #05 - 몫과 나머지 구하기
		int quotient = 7 / 3;
		int remainder = 7 % 3;
		// # 06
		int results = 11;
		results /= 2;

		// #07
		double x = 2.6;
		double y = -1.5;
		int m = 18;
		// int n = 4;
		int result = 0;
		// System.out.printf("2.6+4*-1.5-(2.6+4)*-1.5 = %f\n", x + n * y - (x + n) * y);
		// 5 * x - /5
		// 1 (1- (1 - (1 - (1 - n))))

		// #08 - 논리 연산자의 단축평가
		System.out.println(true || false && 3 < 4 || !(5 == 7));
		System.out.println(true || (3 < 5 && 6 >= 2));
		// System.out.println(!true > 'A'); - (오류)문자
		System.out.println(7 % 4 + 3 - 2 / 6 * 'Z'); // 아스키코드Z로 수식을 사용
		System.out.println('D' + 1 + 'M' % 2 / 3);
		// #09

		System.out.println("May 13, 1988 fell on day number");
		System.out.println(
				((13 + (13 * 3 - 1) / 5 + 1988 % 100 + 1988 % 100 / 4 + 1988 / 400 - 2 * (1988 / 100)) % 7 + 7) % 7);
		// 특정일의 요일을 알아내는 수식
		// (year + (year/4) - (year/100) + (year/400) + (13 * month + 8) / 5 +day)%7;
		System.out.println((2017 + (2017 / 4) - (2017 / 100) + (2017 / 400) + (13 * 12 + 8) / 5 + 12) % 7);
		System.out.println("//hello there" + '9' + 7); // 문자열로 처리
		System.out.print('H' + 'I' + "is" + 1 + "more example");
		System.out.println("Reverse" + 'I' + 'T');
		System.out.println("Here is " + 10 * 10);
		// System.out.println("Not x is" true);
		// System.out.println("How about this one" =='?'+'huh?');

		// #10
		System.out.println(true && false && true || true);
		// #11 -우선순위, 데이터 유형
		System.out.println(27 / 13 + 4); // 정수/정수 = 정수
		System.out.println(27 / 13.0 + 4);
		// System.out.println( (3<4) && 5/8); 논리식이 될 수 없음
		System.out.println('a' / 'b'); // 아스키값으로 연산 가능
		System.out.println((double) 'a' / 'b'); // 아스키값을 실수로 변환해서 연산가능

		// #12 - 형변환 : 축소 형변환
		int l = (int) 3.9;
		System.out.println(l);
		System.out.println(("l==") + l);
		// #13 증가/감소 연산자
		int p = 3;
		p++; // = ++p;
		System.out.println(("p ==") + p);
		p = 3;
		System.out.println("p==" + p++);
		// "p==" + p, p = p+1
		System.out.println("p==" + p);

		p = 3;
		p--;
		System.out.println("p==" + p);
		System.out.println("p==" + p--);

		// #14 문자 연결

		System.out.println("2+2 =" + (2 + 2));
		System.out.println("2+2 =" + 2 + 2);

		// #15
		// char a, b;
		// a = 'b';
		// System.out.println(a);
		// b = 'c';
		// System.out.println(b);
		// System.out.println((int) a); // 캐릭터형을 숫자로 바꾸면 b의 아스키값이 나옴

		// a = b;
		// System.out.println(a);

	}
}
