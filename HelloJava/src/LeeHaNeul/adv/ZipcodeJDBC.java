package LeeHaNeul.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZipcodeJDBC {

	public static void main(String[] args) {

		String DRV="oracle.jdbc.driver.OracleDriver";
		String URL="jdbc:oracle:thin:@192.168.3.128:1521:xe";
		String USR="sky";
		String PWD="sky";
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("검색하실 도로명을 입력해주세요");
		String way = sc.next();
		
		
		String selectSQL = "select * from Zipcode_Kyunggi where 도로명 like ?";
				
		try {
		Class.forName(DRV);
		conn =DriverManager.getConnection(URL,USR,PWD);
		pstmt = conn.prepareStatement(selectSQL);
		pstmt.setString(1 , "도로명" +"%");
		rs = pstmt.executeQuery();
		
		List<ZipcodeVO> zclist = new ArrayList<>();
		
		ZipcodeVO zip = new ZipcodeVO();
		while(rs.next()) {
			
			zip.set시도(rs.getString("시도"));
			zip.set시군구(rs.getString("시군구"));
			zip.set읍면(rs.getString("읍면"));
			zip.set도로명(rs.getString("도로명"));
			zip.set건물번호본번(rs.getInt("건물번호본번"));
			zip.set건물번호부번(rs.getInt("건물번호부번"));
			zip.set시군구용건물명(rs.getString("시군구용건물명"));
			zip.set법정동명(rs.getString("법정동명"));
			zip.set리명(rs.getString("리명"));
			zip.set지번본번(rs.getInt("지번본번"));
			
		}System.out.println(zip);
		
		
			
		
		
		
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			try{rs.close();}catch(Exception e) {}
			try{pstmt.close();}catch(Exception e) {}
			try{conn.close();}catch(Exception e) {}
		}
	}

}
