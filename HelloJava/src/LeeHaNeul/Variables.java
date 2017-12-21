package LeeHaNeul;

import java.util.Scanner;

public class Variables {
	public static void main(String[] args) {
		/*
		 * 자바 기본자료형 int : 정수 (byte, short, long) double : 상수 (float) shar : 문자 String :
		 * 문자열
		 */
		// 변수 : 자료형 변수이름;
		int a; // 정수형 변수
		double b; // 실수형 변수
		char c; // 문자변수 (1자) ''
		String d; // 문자열 변수 ""

		// 상수 : final 자료형 변수이름;
		// 변경불가 자료를 저장할 목적으로 사용
		// 변수이름은 대문자로 작성!!
		final int E;
		final double F;
		final char G;
		final String H;

		// 자바 예약어를 변수 이름으로 사용불가!
		// int if;
		// double import;
		// char System; String String; - 가능하지만 사용하지 않는다

		// 회원정보 (아이디,비밀번호,이름,나이)
		String userid; // id, uid, 아이디
		String passwd; // pwd, password
		String name; // nm << 의미를 알아볼 수 있게
		int age;

		// 리터럴 : 컴파일러가 이해할 수 있는 형식으로 작성된 데이터나 값
		// 주민등록번호
		// int jumin = 1234567891234; - 값이 int의 범위보다 큼
		long jumin = 1234567891234L;

		// 변수 초기화 : 변수에 값을 대입
		// 변수명 = 값;
		userid = "sky";
		passwd = "15324";
		name = "haneul";
		age = 26;
		// String name, passwd, name;
		// String name = "x", passwd = "y', name = "z";
		// 동일한 자료형 변수들은 , 들로 구분해서 한번에 선언 가능 (가독성이 떨어짐)
		b = 123.456;

		// float pi = 3.147592; - double형 리터럴값을 float에 적용
		float pi = 3.147592F;

		c = '수';
		G = 'a';

		// 변수 VS 상수
		c = '우';
		// G = 'x'; // G 는 상수(final로선언)이므로 변경불가

		// 선언과 초기화
		int i = 132;
		double j = 987.123;
		boolean k = true; // 논리형 변수 : 정수나 실수 문자값은 지정할 수 없음
		k = false;

		// 변수/상수 이름
		// 변수는 일반적으로 소문자
		// 두 단어로 이름을 구성하는 경우 camel 표기법을 사용
		// int juminCode; //jumincode
		// String sayHello;

		// 상수는 모두 대문자로 쓰되, 두 단어 이상일 경우 _ 를 사용
		// final double PI = 3.14;
		// final int THIS_YEAR = 2017;
		// final String USER_ID = "zzyzzy";

		// JDK7부터 도입된 자릿수 표시 : _
		// jumin = 1234561324567L;
		// jumin = 1_234_561_324_567L;

		// 문자와 숫자 간 변환 (어떤 문자의 유니코드를 알고 싶을 때)
		char ch = 'A';
		System.out.println(ch);
		System.out.println((int) ch);
		ch = 'a';
		System.out.println(ch);
		System.out.println((int) ch);
		ch = '하';
		System.out.println(ch);
		System.out.println((int) ch);
		ch = '가';
		System.out.println(ch);
		System.out.println((int) ch);
		ch = '나';
		System.out.println(ch);
		System.out.println((int) ch);

		// String을 숫자로 바꿀 수는 없다
		String chars = "abc";
		System.out.println(chars.charAt(0));
		System.out.println((int) chars.charAt(0));
		System.out.println(chars.charAt(1));
		System.out.println((int) chars.charAt(1));
		System.out.println(chars.charAt(2));
		System.out.println((int) chars.charAt(2));

		// 특수문자 표현 escape sequence
		System.out.println("가   나");
		System.out.println("가\t나"); // 탭 문자
		System.out.println("가\n나"); // 줄바꿈문자
		System.out.println("가\"나"); // 큰 따움표
		System.out.println("가\'나"); // 작은 따움표

		// 인코딩 - 컴퓨터가 알아들을 수 있는 언어로 바꾸는 것
		// 디코딩 - 사람이 알아들을 수 있는 언어로 바꾸는 것
		// UTF-16 - 모든 문자들을 2byte의 고정크기로 표현 (다루기 쉬우나 속도가 느림)
		// UTF-8 - 하나의 문자를 1~4 byte의 가변크기로 표현 (속도가 빠르나 다루기 어려움)
		// 인터넷에서는 전송속도가 중요하므로, UTF-8인코딩으로 작성된 웹문서의 수가 늘고있음

		// 변수 출력하는 방법
		System.out.println(userid);
		System.out.println(passwd);
		System.out.println(name);
		System.out.println(age);

		System.out.println("아이디 : " + userid);
		System.out.println("비밀번호 : " + passwd);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);

		System.out
				.println("아이디 : " + userid + "\n" + "비밀번호 : " + passwd + "\n" + "이름 : " + name + "\n" + "나이 : " + age);

		// 서식화된 출력 - printf
		System.out.printf("아이디 : %s , 비밀번호 : %s  ,\n 이름 : %s , 나이 : %d ", userid, passwd, name, age);

		String fmt = "아이디 : %s , 비밀번호 : %s ,\n 이름 : %s , 나이 : %d ";
		System.out.printf(fmt, userid, passwd, name, age);

		// double vs float : 오차범위 주의
		float avg1 = 296 / 3.0f;
		double avg2 = 296 / 3.0;
		System.out.println(avg1); // 98.666664
		System.out.println(avg2); // 98.66666666666667

		// 키보드로 데이터 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요");
		userid = sc.nextLine();
		System.out.print("비밀번호를 입력하세요");
		passwd = sc.nextLine();
		System.out.print("이름을 입력하세요");
		name = sc.nextLine();
		System.out.print("나이를 입력하세요");
		age = Integer.parseInt(sc.nextLine()); // Integer.parseInt - 입력받은 문자열을 숫자로 변환

		System.out.printf(fmt, userid, passwd, name, age);

		// print - 문자열 입력후 줄 바꿈이 없음

	}

}
