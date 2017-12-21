package LeeHaNeul;

import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) throws SQLException {
				//예외처리
		
		int[] intArry = {9,8,7,6,5};
		System.out.println(intArry[2]);
		
		try {
		System.out.println(intArry[5]);
		} catch(Exception ex) {
			System.out.println("오류발생!@");
			
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
			
		// unchecked 예외 = 개발자가 직접 인지하고 예외 처리
	
		try {	int x  = 1000/0;
		System.out.println(x);
		} catch(Exception ex) {
			System.out.println("오류발생");
			
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
		//	checked 예외 - 컴파일러가 미리 예외처리에 대한 정보를 알림
		try {
		String fpath = "c:\\Java\\abc.dat";
		FileReader fr = new FileReader(fpath);
		} catch(Exception ex) {
			System.out.println("오류");
			ex.printStackTrace();
		}
		
		// 예외처리의 좋은 예 	(문자 입력방지)
		Scanner sc = new Scanner(System.in);
		int key = 999;
		while(true) {
			System.out.println("숫자만 입력하세요!");
			try {
			 key = sc.nextInt(); 
			if(key == 0)break;
			}catch(Exception ex) {
				System.out.println("문자는 입력불가!");
				// 무한반복 방지용 Scanner 초기화
				sc= new Scanner(System.in);
			}
			
			} 
			sc.close();
		
			// 데이터베이스 서버 접속 코드 - checked 예외
			// throws 구문으로 이 메서드를 호출한 상위 메서드로
			// 예외처리를 던짐 (처리를 대신해달라고 떠넘김)
		DriverManager.getConnection("...");
		
		System.out.println("이글이 보이나요?");
		
					// try - catch 문은 성능을 크게 저하시키기 때문에 무분별한 사용은 자제해야함
		
		
		
		
		
	}

}
