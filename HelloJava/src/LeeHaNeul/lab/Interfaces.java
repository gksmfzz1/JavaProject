package LeeHaNeul.lab;

public class Interfaces {

	public static void main(String[] args) {
			// 인터페이스 - 객체화 불가 클래스
			// 인터페이스를 구현한 클래스를 통해 객체화 가능
//		ISungJukService isjsrv = new ISungJukService();
		SungJukServiceImpl sjsrv = new SungJukServiceImpl();
		sjsrv.getTotal();
		sjsrv.getAverage();
		sjsrv.getGrade();
		
		// 추상클래스 객체 생성
		// 추상메서드를 포함한 클래스 - 객체화 불가능
//		AbstractClass ac = new AbstractClass();
		
		// 상속을 이용한 추상클래스 객체화 - 하위 클래스를 만들어 상속시킨 후 객체화 
		CompleteClass cc = new CompleteClass();
		
	}

}

interface ISungJukService {
	int tot = 0;		// 상수이기 때문에 초기화를 꼭 해줘야 함!
	double avg = 0.0;
	
	
	abstract void getTotal();		// 추상메서드
	
	void getAverage();
	
	void getGrade();
}

class SungJukServiceImpl implements ISungJukService{

	@Override
	public void getTotal() {
		
	}

	@Override
	public void getAverage() {
		
	}

	@Override
	public void getGrade() {
		
	}
	
}

abstract class AbstractClass {
}

class CompleteClass extends AbstractClass{
	
}

class Unit{}

interface Fightable{
	void move(int x, int y);
	void attack(Unit u);
}		// 미완성된 메서드 포함

class Firebat implements Fightable{
	@Override
	public void move(int x, int y) {}
	@Override
	public void attack(Unit u) {}	
}		// 완전한 메서드(인터페이스의 미완성된 메서드를 구현)를 포함

		// 인터페이스를 구현하는 중 인터페이스의 모든 추상메서드를 구현할 필요가 없을 때
		// 추상 클래스로 만들면 된다 
abstract class Medic implements Fightable{
	@Override
	public void move(int x, int y) {}
}		// 추상클래스 - 일부의 완전한 메서드 포함 

