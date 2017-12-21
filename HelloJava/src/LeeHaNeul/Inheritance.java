package LeeHaNeul;

public class Inheritance {

	public static void main(String[] args) {
		// 자바에서 클래스는 하나만 확장 할 수 있음
		// 하지만, 인터페이스를 이용하면 상속의 개념을 적용 할 수 있음

		// 클래스간 상속관계의 형성되면
		// 각 클래스는 is-a 관계가 만들어진다
		// *자식 클래스의 객체를 부모클래스 타입으로 처리 가능*
		Tiger t = new Tiger();

		Animals t2 = new Tiger();
		Animals e = new Eagle();
		Animals g = new Goldfish();
	}
}

class Animals extends Object {
	protected String eye;
	protected String mouth;
	protected String hp; // private 일경우 상속받은 클래스에서 사용불가 / protected를 사용하면 사용가능

	public void eat() {
	}

	public void sleep() {
	}
}

class Tiger extends Animals {
	protected String reg;

	public void run() {
	}
}

class Eagle extends Animals {
	protected String wing;

	public void fly() {
	}
}

class Goldfish extends Animals {
	protected String fin;

	public void swim() {
	}
}