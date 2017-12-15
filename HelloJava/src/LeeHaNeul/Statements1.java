package LeeHaNeul;

public class Statements1 {
	public static void main(String[] args) {
		// 문장 - 무엇인가를 하라는 지시를 의미
		// 문장이 모여 프로그램을 구성

		; // 빈문장도 일단 적법

		// 프로그래밍의 문장은 지시를 의미 / 위에서 부터 순차구조적으로 실행됨
		// 문장으로 실행순서를 제어할 수 있음
		// 문장은 block을 통해 그룹화 할 수 있음 {} (block에 이름을 정하면 메서드가됨)

		// 제어문- 프로그램의 흐름을 바꾸는 역할(조건문, 반복문을 제어)
		// 조건문 (특정 조건에 실행) , 반복문 (특정 실행을 지정 횟수만큼 반복)

		// if문 - 조건 분기문; 조건에 따라 문장을 선택 실행함
		// 다중선택을 해야 할 경우 else문 다음 if문을 작성
		// if문에서는 ture or false 를 구분할 수 있게 작성해야함

		// 조건문 if
		// 1. if (조건식) { 참일때 실행할 문장}
		// 2. if (조건식) { 참일때} else { 거짓일때}
		// 3. if (조건식) { 참일때 }
		// else if (조건식2){ 참일때 }
		// else if (조건식3){ 참일때 }
		// else { 거짓일때 }

		if (3 < 5) {
			System.out.println("5는 3보다 크다");
		} // 참이 아닐 경우 - dead block 처리됨 (실행은 가능하나 없는 문장과 같음)

		int tot = 99 + 98 + 99;
		if (tot >= 270) {
			System.out.println("수");
		}

		// 어떤수가 2의 배수인지 알아보자
		int x = 13; // % - 나머지를 구하는 식
		if (x % 2 == 0) {
			System.out.println("2의배수");
		} else {
			System.out.println("2의 배수가 아니다");
		}

		// 범위 검사
		x = 95;
		if (x <= 100 && x >= 90) {
			System.out.println("수");
		}

		// 값비교

		String userid = new String("sky");
		String passwd = new String("123456"); // 문자(String)를 비교할때는 .equals로
		if (userid.equals("sky") && passwd.equals("123456")) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		// - 인증

		if (userid.equals("sky")) {
			if (passwd.equals("123456")) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다");
			}
		} else {
			System.out.println("아이디가 틀렸습니다");
		}

		// 문자 입력 확인
		char ch = 'q';
		if (ch == 'q' || ch == 'Q') {
			System.out.println("프로그램 종료");
		} // 문자열은 .equals로 비교 문자는 == 으로 비교

		// 입력된 문자가 알파벳 소문자 여부 확인
		// if (ch == 'a' || ch == 'b' || ch == 'c' ... || ch == 'z') {}
		ch = '1';
		if (!(ch >= 'a' && ch <= 'z')) {
			System.out.println("알파벳만 입력 가능");
		}

		ch = 'x';

		if (!(ch >= 'A' && ch <= 'Z')) {
			System.out.println("대문자만 입력가능");
		}

		if (!(ch >= '0' && ch <= '9')) {
			System.out.println("숫자만 입력가능");
		} // -유효성 검사 코드

		// 다중 if 문
		double avg = (double) tot / 3;
		char grd;
		if (avg >= 90)
			grd = '수';
		else if (avg >= 80)
			grd = '우';
		else if (avg >= 70)
			grd = '미';
		else if (avg >= 60)
			grd = '양';
		else
			grd = '가';

		System.out.println(grd);

		// 애매모호한 if문
		String grds = "";
		if (avg >= 90)
			if (avg >= 96)
				grds = "A+";
			else
				grds = "A0 또는 A-";
		System.out.println(grds);
		// 96점이상은 A+ 나머지는 A0를 줘야하는데 if의 범위가 명확하지 않아 오류
		if (avg >= 90) {
			if (avg >= 96)
				grds = "A+";
		} else
			grds = "A0 또는 A-";
		System.out.println(grds);
		// 중첩 if문인 경우 {}를 이용하여 명확하게 범위를 지정

		// switch (참과 거짓이 아니라 문자나 숫자의 값을 사용) : 연산식의 결과값에 따라 분기
		// 연산식 결과값의 유형은 정수 , 문자열 , 열거형 중 하나이어야 함
		// switch(연산식) {
		// case 값1 : 실행할 코드; break;
		// case 값2 : 실행할 코드; break;
		// case 값3 : 실행할 코드; break;
		// default : 실행할 코드; break;
		// }

		int userLevel = 1;
		switch (userLevel) {
		case 1:
			System.out.println("관리자");
			break;
		case 2:
			System.out.println("사용자");
			break;
		case 3:
			System.out.println("매니저");
			break;
		default:
			System.out.println("비회원");
			break;
		} // 모든 case 작성시 break; 작성해야함

		String key = "C";

		switch (key) {
		case "C": // 비슷한 여러개의 case를 넣어도 적용가능
		case "c":
			System.out.println("데이터 생성");
			break;
		case "r":
			System.out.println("데이터 조회");
			break;
		case "u":
			System.out.println("데이터 수정");
			break;
		case "d":
			System.out.println("데이터 삭제");
			break;
		case "e":
			System.out.println();
			break;
		}
		// 학점 계산
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grd = '수';
			break;
		case 8:
			grd = '우';
			break;
		case 7:
			grd = '미';
			break;
		case 6:
			grd = '양';
			break;
		default:
			grd = '가';
			break;
		}

		// 난수생성
		double lucky = Math.random();
		System.out.println(lucky);
		System.out.println((int) (lucky * 10));
		System.out.println((int) (lucky * 100));
		System.out.println(((int) (lucky * 100)) + 1);

	}
}
