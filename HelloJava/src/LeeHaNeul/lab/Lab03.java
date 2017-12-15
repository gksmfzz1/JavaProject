package LeeHaNeul.lab;

public class Lab03 {
	public static void main(String[] args) {
		// 변수이름 짓기 예제
		// # 1. 축구선수
		String[] player; // 선수
		String[] team; // 팀명
		String[] region; // 연고지
		String[] postion; // 포지션
		String[] backNo; // 등번호
		String[] birth; // 생년월일
		String[] height; // 키
		String[] weight; // 몸무게

		player = new String[10];
		team = new String[10];
		region = new String[10];
		postion = new String[10];
		backNo = new String[10];
		birth = new String[10];
		height = new String[10];
		weight = new String[10];

		player[0] = "최강조"; // String player = new String[]{"최강조", "오춘식", "하리"} - 한번에 초기화하는방법(중괄호사용)
		player[1] = "오춘식";
		player[2] = "하리";
		player[3] = "윤용구";
		player[4] = "정도용";
		player[5] = "전재호";
		player[6] = "홍종하";
		player[7] = "오비나";
		player[8] = "고창현";
		player[9] = "이청용";
		for (int i = 0; i < 10; i++)
			System.out.printf("player[%s]:%s\n", i, player[i]);

		// player = "최강조" + "오춘식" + "하리" + "윤용구" + "정도용" + "전재호" + "홍종하" + "오비나" + "고창현"
		// + "이청용";
		// team = "일화천마" + "대구FC" + "아이파크" + "드래곤즈" + "FC서울" + "일화천마" + "제주유나이티드FC" +
		// "시티즌" + "블루윙즈" + "블루윙즈";

		// 2. 고객
		String numP; // 고객번호
		String name; // 이름
		String reg; // 주민번호
		String adr; // 주소
		String phone; // 핸드폰

		String numB; // 도서번호
		String bookN; // 도서이름
		String comP; // 출판사
		int prc; // 가격

		String dateO; // 주문일자

		// 3.
	}
}
