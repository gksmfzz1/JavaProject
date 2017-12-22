package LeeHaNeul;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions2 {

	public static void main(String[] args) {
		//	예외처리2	- 멀티 catch블럭
		// 	각각의 코드에 try-catch를 사용하는 것보다
		// 	하나의 try-catch 블럭을 사용하고 여러 개의 catch문으로 예외를 처리하는 것이 효율적
		
		
		try {
		int[] intArry = {9,8,7,6,5};
		System.out.println(intArry[5]);
		
		int x  = 1000/0;
		
		FileReader fr = new FileReader(" ");
		
		DriverManager.getConnection("...");}

		catch (ArrayIndexOutOfBoundsException aiob) {
			System.out.println("잘못된 배열사용!");
		}catch (ArithmeticException ae) {
		System.out.println("잘못된 수식사용!");
		} catch (FileNotFoundException ffe) {
		System.out.println("파일경로를 제대로 설정하세요!");
		}catch(SQLException se) {
		System.out.println("데이터베이스 서버주소을 설정하세요!");
		}
		catch(Exception ex) {					// 모든 예외처리(마지막)
		System.out.println("예상치 못한 예외 발생");
		}
	
		// 예외 던지기 - throws
		MakeException me = new MakeException();
		try {
		me.exception1();
		}catch (ArrayIndexOutOfBoundsException aioe){
			System.out.println("잘못된 배열사용");}
		try {
		me.exception2();
		}catch(ArithmeticException ae) {
			System.out.println("잘못된 수식사용");
		}
		try {
		me.exception3();
		}catch (InputMismatchException ime) {
			System.out.println("잘못된 입력(문자사용)");
		}
		
		// finally 블럭
		// 오류가 발생해서 예외처리시
		// 나머지 코드를 실행하지 않고 넘어감
		// 이런 코드들 중 반드시 실행해야 할 경우
		// finally 블럭에 작성하면 됨
		try {
			// 데이터베이스 서버 연결
			// SQL 처리 및 기타작업			//오류발생시 -꼭 필요한 동작이 실행되지 못하게 됨
						
		} catch(Exception ex) {
			System.out.println("예외처리함");
		} finally {
			// 데이터베이스 서버 끊음			// finally에 소스를 입력해 실행가능하게 함 
		}
	
	
	}
}

class MakeException {
	
	public void exception1() throws ArrayIndexOutOfBoundsException{
		int[] intArry = {9,8,7,6,5};
		System.out.println(intArry[5]);
	}												//메서드 단위의 예외처리는 묶어서 try-catch문으로 처리할 수 없음
	
	public void exception2() throws ArithmeticException{
		int x  = 1000/0;
	}
	
	public void exception3() throws InputMismatchException{
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		
	}
}