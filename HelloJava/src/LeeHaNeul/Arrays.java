package LeeHaNeul;

public class Arrays {

	public static void main(String[] args) {

		// 배열 - 동일한 자료형 데이터들의 묶음
		// 동일한 자료형을 사용해야함 ex) String,int, 같이 배열로 묶을 수 없음
		String name1, name2, name3;

		// 배열 선언
		// 자료형 [] 변수명;

		String[] names;

		// 배열 초기화
		// 변수명 = new 자료형 [크기];
		names = new String[3];

		// 배열 다루기
		// 변수명[위치값];
		names[0] = "혜교";
		names[1] = "지현";
		names[2] = "수지";

		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		// 국어점수 표기
		int[] kor;
		kor = new int[3];
		kor[0] = 99;
		kor[1] = 98;
		kor[2] = 97;

		for (int j = 0; j < kor.length; j++) {
			System.out.println(kor[j]);
		}

		// 배열을 사용할 때 반복문은 필수
		// 조건문의 값에 배열의 크기보다 큰 값을 넣었을 때 오류코드 - Exception in thread /
		// ArrayIndexOutOfBoundsException

		// 배열은 참조형이다??
		System.out.println(names);
		System.out.println(kor);

		// 배열요소의 값은 자동으로 초기화된다
		// 각 자료형별 기본값(default)
		String[] a = new String[1]; // 객체(=참조형)
		int[] b = new int[1];
		char[] c = new char[1];
		double[] d = new double[1];
		boolean[] e = new boolean[1];
		Arrays2[] z = new Arrays2[1]; // 객체(=참조형)

		System.out.println(a[0]); // null
		System.out.println(b[0]); // 0
		System.out.println(c[0]); // (빈값)
		System.out.println(d[0]); // 0.0
		System.out.println(e[0]); // false
		System.out.println(z[0]); // null - 참조형 데이터들은 기본값이 null

		// 배열의 길이 : 배열변수.length
		// names.length = 10; //상수이므로 변경X (배열의 크기는 중간에 변경할 수 없다)

		// 배열 선언과 동시에 초기화 하기
		int[] f = { 15, 45, 35 };
		for (int i = 0; i < f.length; ++i) {
			System.out.println(f[i]);
		}

		f = new int[] { 99, 99, 99 };
		for (int i = 0; i < f.length; ++i) {
			System.out.println(f[i]);
		}

		// 2차원 배열 :[][] - [행의수][열의수]
		int[][] lotto = new int[3][6];
		lotto[0][0] = 15; // 처음
		lotto[2][5] = 33; // 끝

		// (int) (Math.random() * 100000);
		// % ((999 - 100) + 1) + 100;
		// 1-45 정수 6개 출력 난수식
		for (int i = 0; i < 6; ++i) {
			for (int j = 0; j < 3; ++j) {
				int rand = (int) (Math.random() * 10000) + 1; // Math.random() * 확률
				int lotto645 = rand % ((45 - 1) + 1) + 1;

				lotto[j][i] = lotto645;

			} // for j
		} // for i
			// 2차원 배열 내 저장된 값 출력
		for (int j = 0; j < 3; ++j) {
			for (int i = 0; i < 6; ++i) {
				System.out.printf("%2d ", lotto[j][i]);
			} // for i
			System.out.println();
		} // for j

		// 향상된 for문으로 배열 다루기
		// for( 배열요소타입 변수명 : 배열)
		int[] abc = { 12, 34, 56, 78, 90 };
		for (int i = 0; i < abc.length; ++i) {
			System.out.println(abc[i]);
		}

		for (int val : abc) {
			System.out.println(val);
		}
		// for (int j = 0; j < 3; ++j) {
		// for (int i = 0; i < 6; ++i) {
		// System.out.printf("%2d ", lotto[j][i]);
		// } // for i
		// System.out.println();
		// } // for j

		// 2차원 배열에 대한 향상된 for문 사용
		for (int[] key : lotto) { // 2차원 배열 lotto 값을 으로 가져옴 (1차원)
			for (int col : key) { // 1차원으로 변환한 값을 하나씩 값을 가져오기 위해 변수 col을 생성
				System.out.printf("%2d ", col);
			}
			System.out.println();
		}

	}

}

class Arrays2 {

}
