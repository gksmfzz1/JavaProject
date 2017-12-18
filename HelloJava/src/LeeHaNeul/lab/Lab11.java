package LeeHaNeul.lab;

public class Lab11 {

	public static void main(String[] args) {

		// #31
//		Scanner sc = new Scanner(System.in);
//		System.out.println("6자리 카드번호를 입력하세요");
//		String card = sc.nextLine();
//
//		// 카드정보 판별
//		char cType = card.charAt(0);
//		char cType2 = card.charAt(1);
//		String ctmsg = "카드정보 없음"; // *변수 초기화 때 조건을 만족하지 않는 나머지 값을 넣어준다 (cpu 비용 절감)*
//
//		if (cType == '3' && cType2 == '5')
//			ctmsg = "JCB 카드";
//		else if (cType == '4')
//			ctmsg = "비자 카드";
//		else if (cType == '5')
//			ctmsg = "마스타카드";
//
//		// 은행정보 판별
//		String bank = "은행정보 없음";
//		switch (card) {
//		case "356317":
//			bank = "NH 농협카드";
//			break;
//		case "356901":
//			bank = "신한카드";
//			break;
//		case "356912":
//			bank = "KB 국민카드";
//			break;
//		case "404825":
//			bank = "비씨카드";
//			break;
//		case "438676":
//			bank = "신한카드";
//			break;
//		case "457973":
//			bank = "국민은행";
//			break;
//		case "515594":
//			bank = "신한카드";
//			break;
//		case "524353":
//			bank = "외환카드";
//			break;
//		case "540926":
//			bank = "국민은행";
//			break;
//		}
//
//		System.out.printf("%s %s", ctmsg, bank);
//		System.out.println();

		// # 32 - 주민등록번호 유효성 검사

//		String jumin = "1111111111118";
//
//		// a. 가중치 적용 및 합산
//		int sum = 0;
//		// sum += (jumin.charAt(0) - 48) * 2; // -48 : 문자1의 아스키값 = 49
//		// sum += (jumin.charAt(1) - 48) * 3; //(charAt으로 뽑아온 문자 '1'이 아스키값으로 적용됨)
//		// sum += (jumin.charAt(2) - 48) * 4;
//		// sum += (jumin.charAt(3) - 48) * 5;
//		// sum += (jumin.charAt(4) - 48) * 6;
//		// sum += (jumin.charAt(5) - 48) * 7;
//		// sum += (jumin.charAt(6) - 48) * 8;
//		// sum += (jumin.charAt(7) - 48) * 9;
//		// sum += (jumin.charAt(8) - 48) * 2;
//		// sum += (jumin.charAt(9) - 48) * 3;
//		// sum += (jumin.charAt(10) - 48) * 4;
//		// sum += (jumin.charAt(11) - 48) * 5;
//		int jcode = 0;
//		for (int i = 0, j = 2; i <= 11; ++i, ++j) { // j값도 1씩증가 하기때문에 같이 변수 지정해줄 수 있다
//			if (i == 8) // i가 8이 되었을때 j값이 변하기 때문에 j값을 바꿔주는 코드를 넣어준다
//				j = 2;
//			jcode = jumin.charAt(i) - 48;
//			sum += jcode * j;
//		}
//
//		// 나머지 계산
//		// int check = sum % 11;
//		// 마지막 자릿수와 비교
//		String msg = "주민번호 검증 실패!";
//		// if (check > 9) { // 나머지가 2자수일 때
//		// if (check % 10 == jumin.charAt(12) - 48)
//		// msg = "주민번호 검증 성공!";
//		// } else if ((11 - check) == jumin.charAt(12) - 48)
//		// msg = "주민번호 검증 성공!";

//		// 11 로 나눈 나머지 구한 후
//		// 11에서 이것을 빼고, 맨 마지막 자리 빼냄
//		int check = (11 - (sum % 11)) % 10; // 11 : 가중치가 적용된 자리수
//		if (check == jumin.charAt(12) - 48)
//			msg = "주민번호 검증 성공!";
//		System.out.println(msg);
					
				// # 33
		System.out.println("   +   ");
		System.out.println("  +++  ");
		System.out.println(" +++++ ");
		System.out.println("+++++++");
		System.out.println(" +++++ ");
		System.out.println("  +++  ");
		System.out.println("   +   ");
		
		for (int i = 1; i <= 4; ++i) {
			for (int j = 1; j <= 7; j += 2) {
				
				char a = '+';
				System.out.println(a);
			}
		}
	}
}
