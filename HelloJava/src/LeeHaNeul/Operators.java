package LeeHaNeul;

public class Operators {
	public static void main(String[] args) {
		// 연산자 - 각종 작업을 간단하게 표시한 기호
		// 산술연산자 : +, -, *, /, %
		int x = 10, y = 4;
		System.out.printf("10 + 4 = %d \n", x + y);
		System.out.printf("10 - 4 = %d \n", x - y);
		System.out.printf("10 * 4 = %d \n", x * y);
		System.out.printf("10 / 4 = %d \n", x / y);
		System.out.printf("10 %% 4 = %d \n", x % y);

		// 비교연산자 : >, <, ==, !=
		String a = "Hello";
		String b = "hello";
		String c = "Hello";
		String d = new String("Hello");

		System.out.printf("10 > 4 = %b \n", x > y);
		System.out.printf("10 < 4 = %b \n", x < y);
		System.out.printf("10 == 4 = %b \n", x == y);
		System.out.printf("10 != 4 = %b \n", x != y);

		System.out.printf("a == b = %b \n", a == b);
		System.out.printf("b == c = %b \n", b == c);
		System.out.printf("a == c = %b \n", a == c);
		System.out.printf("c == d = %b \n", c == d);
		System.out.printf("c.equals(d) = %b \n", c.equals(d));
		// 문자끼리의 비교할 때 * .equals * (데이터의 주소를 비교하기 때문)

		// 논리연산자 : &&, ||, !
		int i = 5;
		int j = 13;

		System.out.printf("(i > 4 || j < 10) = %b \n", i > 4 || j < 10);
		System.out.printf("(i < 5 && j > 10) = %b \n", i > 5 && j > 10);

		// || = or결합 && = and결합
		// 기호를 두번 쓸경우(|| , &&) - 단축연산 (앞의 결과에서 결과값이 확정되면 뒤의 연산을 생략)

		// 대입 연산자 : =, +=, -=, *=, /=
		int z = x + y;
		z += x; // z = z + x;
		z += y; // z = z + y;

		// 증가/감소 연산자 : ++, --
		// z = z + 1;
		// z = z - 1;
		++z; // 전치
		--z; // 전치

		z++; // 후치
		z--; // 후치

		i = 5;
		j = 5;
		j = ++i;
		System.out.printf("i = 5; j = 5; j = ++i : %d \n", j);
		i = 5;
		j = 5;
		j = i++;
		System.out.printf("i = 5; j = 5; j = i++ : %d \n", j);

		// 삼항 연산자 - ? :
		// (논리식) ? (참일때처리):(거짓일때처리)
		double avg = 296 / 3.0;
		// char grd = (avg <= 100 && avg >= 90) ? '수' : '우';
		// char grd = (avg >= 90) ? '수' : '우';
		// char grd = (avg >= 80) ? '우' : '미';

		char grd = (avg >= 90) ? '수' : (avg >= 80) ? '우' : (avg >= 70) ? '미' : (avg >= 60) ? '양' : '가';

		System.out.println(grd);

		// 연산자 우선순위
		// 표현식의 계산순서를 결정
		// z = x + y * 2;
		// z = (x = y) * z;
		int k = 1, l = 2, m = 3;
		int n = k + l * m;
		int o = (k + l) * m;

		System.out.println(n);
		System.out.println(o);

		// 형변환
		// 이미 선언된 변수의 자료형은 형변환 연산자인 ()를 이용해 명시적으로 변환 가능
		double avg2 = 296 / 3;
		System.out.printf(" 296 / 3 = %f \n", avg2);

		// 정수를 정수로 나누게 되면 정수로 값이 나온다
		// 제대로 처리하려면 앞의값이나 뒤의 값을 실수로 변형해야 함

		avg2 = (double) 296 / 3;
		System.out.printf(" 296 / 3 = %f \n", avg2);

		// 큰 데이터를 작은 데이터로 변환할 때에는 값이 잘리는 것을 유의한다

		// 정수 연산의 기본단위 : int
		byte p = 10;
		byte q = 10;
		p = (byte) (p + 10);
		p = (byte) (p + q);
		// int 단위가 아닐경우 (단위)로 변형한다

		// 확대변환 (자동으로 처리)
		int s = p; // byte -> int

		// 축소변환 (명시적으로 기술)
		s = 130;
		p = (byte) s;

		System.out.println(p);

		// 값이 달라지기 때문에 주의 (데이터 소실)

	}
}
