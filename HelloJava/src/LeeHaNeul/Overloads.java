package LeeHaNeul;

public class Overloads {

	public static void main(String[] args) {

			//메서드 오버로드 - 다중정의
		System.out.println();
		
		
		
		
	}

}

class Calaulator{
	
	public int add(int a , int b){
	return a + b;
	}			// 정수 더하기 메서드
	public double add(double a, double b) {
		return a + b;
	}		// 실수 더하기 메서드
			// 메서드 서명이 다르면 다중 정의가능
	public String add(String a, String b) {
		return a + b;
	}		// 문자열 더하기 메서드
			// 매개변수만 다르면 똑같은 이름으로 다중 정의가능(다형성)
	
	
	
	
}