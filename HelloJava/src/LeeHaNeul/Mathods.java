package LeeHaNeul;

public class Mathods {

	public static void main(String[] args) {

		; // 빈 문장도 적법
		{ // 블럭 시작
			// 블럭내 선언한 변수는 기본적으로 지역변수
			// 지역변수는 블럭 안에서만 유효
			// 변수의 유효범위(scope)를 주의할 것!
			String name = "혜교";
			int kor = 89;
		} // 블럭 끝
			// name = "지현"; //블럭내에서 선언한 변수를 블럭 밖에서 사용할 경우 오류

		{
			String name = "혜교";
			{
				// String name = "혜교"; // 위의 블럭내에 선언된 변수의 유효범위 안에 같은 이름의 변수를 선언했음
			}
		}
		String name = "혜교"; // 블럭 밖에서 변수를 선언 했기 때문에 중복됬다고 볼 수 없음!

		// 메서드 - 어떤 기능을 하는 문장들을 블럭으로 정의하고 그것에 이름을 붙인 것

		int a = 3, b = 4;
		// int c = a + b;
		int c = add(a, b);
		a = 10;
		b = 15;
		c = add(a, b);

		a = 45;
		b = 78;
		c = add(a, b);

		System.out.println(Cars.count);
		Cars 스포츠카 = new Cars();
		스포츠카.name = "페라리";
		스포츠카.type = "스포츠";

		System.out.println(++스포츠카.count);
		System.out.println(++Cars.count);
		스포츠카.printCarinfo();

		Cars 트럭 = new Cars();
		++트럭.count;
		System.out.println(Cars.count);
		System.out.println(트럭.count);
		트럭.printCarinfo();

	}

	// 메서드 코드입력 방법 - 접근수정자 반환값 메서드이름(매개변수목록){메서드를 구성하는 문장}
	// 접근수정자 static 결과값의자료형 메서드이름(괄호안 변수들의 자료형과 이름){ return 연산 내용}
	// 반환하지 않을경우 - void
	public static int add(int a, int b) {
		return a + b;
	}

}

class Cars {
	String name; // 인스턴스변수
	String type;
	static int count; // 클래스 변수

	public void printCarinfo() {
		System.out.println(name + "/" + count);
	}

	public static void showCount() {
		System.out.println(count);

	} // static 메서드는 객체생성없이 바로 호출가능

	public static void showName() {
		// 멤버변수 name을 출력하기 위해
		// showName 메서드 작성
		// 하지만 showName 메서드는
		// static 이므로 멤버변수(인스턴스변수)는 사용불가
		// System.out.println(name);

	}

}