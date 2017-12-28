package LeeHaNeul.lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC_DML_SELECT {
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
				conn = DriverManager.getConnection(URL,USR,PWD);
				
				
				String sql = "select scname, tmname, tmregion, tmpos, bkno, birth, height, weight from soccer order by scno";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					String out = rs.getString("scname") + "," + rs.getString("tmname") + "," +rs.getString("tmregion") + "," +
							rs.getString("tmpos") + "," +rs.getString("bkno") + "," +rs.getString("birth") + "," +
							rs.getString("height") + "," +rs.getString("weight");
					System.out.println(out);
				}
			}catch(Exception ex) {
				ex.printStackTrace();
			}finally {
				try{rs.close();}catch(Exception ex){}
				try{pstmt.close();}catch(Exception ex){}
				try{conn.close();}catch(Exception ex){}
			
				
			}
		
		
		
		
		
	}

}
