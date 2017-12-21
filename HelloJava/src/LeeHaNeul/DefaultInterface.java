package LeeHaNeul;

public class DefaultInterface {

	public static void main(String[] args) {

		// 인터페이스의 업캐스팅
		SportCar sc = new SportCar();
		sc.move();
		sc.openroof();
		
			// 업캐스팅
//		Movable isc = new Movable();		// 불가능   
		Movable isc = new SportCar();
		 isc.move();
//		 isc.openroof();	// SportCard에만 존재함
		 
		 	// 다운캐스팅
		 SportCar spc = (SportCar) isc;
		 spc.openroof();
	}

}

interface A {
	void sayHello ();
//	void sayHello (String msg);
	default void sayHello(String msg) {}// default 메서드 - JDK8 부터 지원
										// default 메서드가 아닐경우 추상클래스(abstract)를 이용해서 해결가능
}


class X implements A{

	@Override
	public void sayHello() {}
	
}

class Y implements A{

	@Override
	public void sayHello() {}
	@Override
	public void sayHello(String msg) {}
	
}

	// 업캐스팅 테스트 예제
interface Movable{
	void move();
}

class SportCar implements Movable {

	@Override					// 부모클래스의 메서드를 재정의(interface 에서 받은 메서드)
	public void move() { }
	
	public void openroof() { }	//SportCar클래스에서 만든 메서드
}







