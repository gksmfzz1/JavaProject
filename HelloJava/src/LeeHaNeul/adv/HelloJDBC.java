package LeeHaNeul.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class HelloJDBC {
	
	public static void main(String[] args) throws Exception {

		Connection conn = null;
		String URL ="jdbc:oracle:thin:@192.168.3.128:1521:xe";
		String USR = "sky";
		String PWD = "sky";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(URL,USR,PWD);
					
					if(!conn.isClosed())
						System.out.println("오라클 접속 성공!");
					
					Statement stmt = conn.createStatement();
					String sql = "insert into CUSTOMER values (cno.nextval, '박지성','810101-1xxxxxx','영국 런던','000-5000-0001')";
					stmt.executeUpdate(sql);		// 실행문
					// Update - insert, update, delete일 경우
					
					
					sql = "insert into book (bno,bkname,publisher,bkprice) values (bno.nextval, '축구의 역사', '굿스포츠',7000)";
					stmt.executeQuery(sql);
					// Query - select일 경우
					try {stmt.close();}catch(Exception ex) {}
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			
			
			try {conn.close();}catch(Exception ex) {}
		}
		
		
	}

}
