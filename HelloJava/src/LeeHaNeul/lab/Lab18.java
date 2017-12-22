package LeeHaNeul.lab;

import java.util.Scanner;

public class Lab18 {

	public static void main(String[] args) {
		
		// 연습문제 7-7,7-8,7-9,7-10,7-15,7-17,8-2,8-8
		
		Child c = new Child();
		System.out.println("x="+ c.getx());
		
		MyTv2 t = new MyTv2();
		
		t.setchannel(10);
		System.out.println("CH :"+ t.getchannel());
		t.setvolume(20);
		System.out.println("VOL:"+t.getvolume());
		
		// # 8-8
		
		int answer = (int)(Math.random()* 100) +1;
		int input = 0;
		int count = 0;
		
		do {
			
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 : \n");
			try {
			input = new Scanner(System.in).nextInt();
			}catch (Exception ex) {
				 System.out.println("숫자만 입력하세요.");
				 continue;						// if문 이전의 소스로 돌아가게함
			}
			if(answer > input) 
				System.out.println("더 큰 수를 입력하세요.");
			 else if(answer < input) 
				System.out.println("더 작은 수를 입력하세요.");
			 else {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는"+count+"번입니다.");
				break;}
			
		}while(true);
		
	
	
		
}
	}
//#7-7
class Parent{
	int x = 100;
	
	Parent(){
		this(200);
	}

	Parent(int x){
		this.x = x;
	}
	int getx() {
		return x;
	}
}

class Child extends Parent{
	int x = 3000;
	
	Child(){
		this(1000);
	}
	Child(int x){
		this.x = x;
	}	
}

// # 7-9
// 제어자 final을 붙일 수 있는 대상과 붙였을 때 의미
//지역변수 - 값을 변경할 수 없다
//클래스 - 클래스에 새로운 멤버를 추가할 수 없다
//메서드 - 오버라이딩을 할 수 없다 
//   **(오버로드 - 같은이름의 메서드로 다른실행 가능하게함/ 오버라이드 - 기존의 메서드를 상속하여 새로운 데이터를 추가)
//멤버변수 - 값을 변경할 수 없다

// # 7-10
class MyTv2{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CANNEL = 1;
	
	public boolean getisPowerOn(){
		return isPowerOn;
	}
	
	public boolean setisPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
		return isPowerOn;
	}
	
	public int getchannel() {
		return channel;
	}
	
	public int setchannel(int channel) {
		this.channel = channel;
		return channel;
	}
	
	public int getvolume() {
		return volume;
	}
	
	public int setvolume(int volume) {
		this.volume = volume;
		return volume;
	}
	
	
}

	// # 7-17
abstract class Unit1{		// 클래스 앞에 abstract를 붙인다
	int x , y;
	abstract void move(int x, int y); //추상메서드로 선언해야함 
	void stop() {}
	
}

class Marine extends Unit1 {
	void move(int x, int y) {}		// 추상메서드이기때문에 입력
	void stimPack() {}
}

class Tank extends Unit1{
	void move(int x, int y) {}
	void changMode() {}
}

class Dropship extends Unit1 {
	void move(int x, int y) {}
	void load() {}
	void unload() {}
}




