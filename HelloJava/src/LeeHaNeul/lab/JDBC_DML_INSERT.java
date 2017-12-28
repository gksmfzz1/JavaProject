package LeeHaNeul.lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC_DML_INSERT {
			
	private static String DRV = "oracle.jdbc.driver.OracleDriver";
	private static String URL = "jdbc:oracle:thin:@192.168.3.128:1521:xe";
	private static String USR = "sky";
	private static String PWD = "sky";
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;		
		
		try {
			Class.forName(DRV);
			conn = DriverManager.getConnection(URL, USR, PWD);
			
			String sql = "insert into soccer(scno, scname, tmname, tmregion, tmpos, bkno, birth, height, weight)"
					+ " values(scno.nextval,'하늘', '레알마드리드', '스페인', 'FW', '7', '92/01/25', '175', '63')";
			pstmt = conn.prepareStatement(sql);
			int count = pstmt.executeUpdate(sql);
			System.out.println(count);
			
			sql = "delete from soccer where scname = '하늘'";
			pstmt = conn.prepareStatement(sql);
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			try{rs.close();}catch(Exception ex){}
			try{pstmt.close();}catch(Exception ex){}
			try{conn.close();}catch(Exception ex){}
		}
		
		
		
		
		
		
	}

}
