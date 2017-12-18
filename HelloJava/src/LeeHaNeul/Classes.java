package LeeHaNeul;

import LeeHaNeul.lab.SungJukV0;

public class Classes {

	public static void main(String[] args) {

		// 클래스 - 객체를 만들기 위한 틀, 설계도

		Animal tiger = new Animal(); // () - 행위를 규정하는 메서드의 한 종류
		tiger.name = "호돌이";
		tiger.weight = 100;
		tiger.type = "호랑이";
		tiger.gender = "남자";

		tiger.move();
		tiger.eat();

		System.out.println(tiger.name);
		System.out.println(tiger.type);
		System.out.println(tiger.gender);
		System.out.println(tiger.weight);

		// shark

		Animal shark = new Animal();
		shark.name = "죠스";
		shark.weight = 200;
		shark.type = "상어";
		shark.gender = "남자";

		shark.move();
		shark.eat();

		System.out.println(shark.name);
		System.out.println(shark.type);
		System.out.println(shark.gender);
		System.out.println(shark.weight);
		// eagle

		Animal eagle = new Animal();
		eagle.name = "독순이";
		eagle.weight = 40;
		eagle.type = "독수리";
		eagle.gender = "여자";

		System.out.println(eagle.name);
		System.out.println(eagle.type);
		System.out.println(eagle.gender);
		System.out.println(eagle.weight);

		Animal tiger2 = new Animal(); // -초기값을 설정했을 경우 변수를 초기화 하지않아도 값이 입력된 상태가 됨
		System.out.println(tiger2.name);
		System.out.println(tiger2.type);
		System.out.println(tiger2.gender);
		System.out.println(tiger2.weight);

		Animal cat = new Animal(); // - 다른 변수에도 똑같이 설정된 값이 나옴
		System.out.println(cat.name);
		System.out.println(cat.type);

		cat = new Animal("고순이", 25, "여자", "고양이");
		System.out.println(cat.name);
		System.out.println(cat.type);

		// 회원가입
		Member m = new Member();
		m.userid = "";
		m.passwd = "";

		m = new Member("sky", "159478", "하늘", "abc123@xyz987.com", "2017-12-18");

		// SungJukV0 클래스를 이용해서 출력
		SungJukV0 sj = new SungJukV0("혜교", 99, 98, 78);
		System.out.printf("%s %d %d %d \n", sj.getName(), sj.getKor(), sj.getEng(), sj.getMat());
		System.out.println(sj);
	}

}

class Animal { // 동물 클래스
	// 필드 (멤버변수)
	String name;
	int weight;
	String gender;
	String type;

	// Animal() { }
	//
	// // 생성자 이름 이후 괄호가 비어있을 경우 - 매개변수(parameter)가 없는 생성자
	// // 생성자 - 이름은 클래스와 동일해야 함
	// // 객체를 생성하는 데 사용하는 특수한 메서드

	// 기본 생성자

	public Animal() {

	}

	// 매개변수가 있는 생성자
	public Animal(String name, int weight, String gender, String type) {

		this.name = name;
		this.weight = weight;
		this.gender = gender;
		this.type = type;
	}

	// 메서드
	void move() {
		System.out.println(name + "가 움직였다");
	} // 메서드 실행후 반환값이 없다면 void

	void eat() {
		System.out.println(name + "가 먹이를 먹었다");
	}

	// setter/getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// 객체의 생성값 확인
	// private 생성자는 일반적으로 singleton(디자인 패턴) 클래스에 사용됨

}

class Car {
	String name; // 참조자료형
	int size; // 기본자료형

	// 클래스는 클래스의 멤버변수로 선언가능
	Engin engin;
	Door door;
	Wheel wheel;
}

class Engin {
}

class Door {
}

class Wheel {
}

class Member {
	String userid;
	String passwd;
	String name;
	String email;
	String regdate;

	// 매개변수가 있는 생성자가 하나라도 있는 경우 기본 생성자를 컴파일러가 자동으로 만들어 주지 않음

	public Member() {

	}

	// 매개변수 있는 생성자
	Member(String userid, String passwd, String name, String email, String regdate) {
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.email = email;
		this.regdate = regdate;

	}

}
