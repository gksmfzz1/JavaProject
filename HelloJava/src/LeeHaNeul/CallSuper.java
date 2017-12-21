package LeeHaNeul;

public class CallSuper {

	public static void main(String[] args) {
			//부모 클래스의 생성자 호출하기 - super()
			// 부모 클래스의 메서드 호출하기 - super.메서드이름
			// 자식의 클래스의 생성자를 호출하면 
			//먼저 부모 클래스의 생성자를 호출하고 자식클래스의 생성자를 호출한다
		
		
		Child c = new Child();
		Child2 c2 = new Child2();
		
		// 상속관계에서 형변환 - 다형성
		Child c3 = new Child();
		Parent p3 = new Parent();
		p3 = c3;	// upcasting
		p3 = new Child();
		
		c3 = (Child) p3;	// downcasting - 명시적 형변환 필요
		
		//상속관계에서 부모/자식 클래스 여부 확인 
		System.out.println(c instanceof Parent);
		
		Son son = new Son();
		System.out.println(son instanceof Parent);
		
	}

}

class Parent {
	protected String name;
	
	public Parent() {
		System.out.println("parent의 생성자");
	}
	public String sayName() {
		return name;
	}

	public void sayLove(Daughter d) {
		System.out.println("사랑한다, 딸아!");
	}
	
	public void sayLove(Son s) {
		System.out.println("사랑한다, 아들아!");
	}
	
	public void sayLove(Parent p) {
		System.out.println("사랑한다, 얘들아!");
	}				// 다형성
	
	
}


class Child extends Parent {
	
	protected String name;
	
	public Child() {
//		super(); //컴파일러가 자동으로 추가해줌 -부모클래스를 호출하는 명령어(반드시 첫번째 줄에 사용!)
		super.name = "1";		//부모클래스의 변수호출
		this.name = "2";		// Child 클래스의 변수호출
		super.sayName();		// 부모클래스의 메서드 호출
		System.out.println("child의 생성자");
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	
	
}

class Parent2{
	protected String name;
	
	public Parent2() {
	}
	
	public Parent2(String name) {
		System.out.println("parent()/"+name);
	}
}
class Child2 extends Parent2{
	public Child2() {
//		super();		// 매개변수가 있는 생성자가 있을 경우 컴파일러는 기본(인수없는) 생성자를 추가시켜주지 않기 때문에 오류
		super("혜교");	// 부모클래스의 자료형에 맞게 값을 넣어줘야함
	}
}

final class Daughter extends Parent {
	
}

final class Son extends Parent {
	
}			// 상속되지 않는 클래스 (final선언)

//class GrandSon extends Son{	
//}			//상속불가!(Son클래스가 final 선언을 했기 때문에)

