package LeeHaNeul.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SungJukJDBC5 {

	public static void main(String[] args) {
			// 성적 처리 JDBC
			//오라클 접속 정보 설정
		
		String DRV="oracle.jdbc.driver.OracleDriver";
		String URL="jdbc:oracle:thin:@192.168.3.128:1521:xe";
		String USR="sky";
		String PWD="sky";
		
			// JDBC 관련 객체 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
			// SQL 관련 변수 선언
		String selectSQL = 
				"select sjno, name, kor, eng, mat, regdate from sungjuk order by sjno desc";
		String selectOneSQL = "select * from sungjuk where sjno = ?";				//상세조회
		String insertSQL = null;						
		String updateSQL = " update sungjuk set name = ?, kor = ?, eng =?, mat =? where sjno = ?";
		String deleteSQL = " delete from sungjuk where sjno = ?";
		
		try {
			//1.
			Class.forName(DRV);
			//2.
			conn =DriverManager.getConnection(URL,USR,PWD);
			//3.
			pstmt = conn.prepareStatement(selectSQL);
			//4.
			rs = pstmt.executeQuery();		// select문이기때문에 Query사용
			//5.
			
			
			List<SungJukVO2> sjlist = new ArrayList<>();
			while(rs.next()) {
				SungJukVO2 sj = new SungJukVO2();
				sj.setSjno(rs.getString("sjno"));
				sj.setName(rs.getString("name"));
				sj.setKor(rs.getInt("kor"));
				sj.setEng(rs.getInt("eng"));
				sj.setMat(rs.getInt("mat"));
				sj.setRegdate(
						rs.getString("regdate").substring(0,10));	//substring의 출력값은 마지막인덱스값의 -1값까지 출력
				sjlist.add(sj);
			}
			
			for(SungJukVO2 sj : sjlist) {
				System.out.println(sj);
			}
			
			Scanner sc = new Scanner(System.in);
			System.out.println("삭제할 학생번호를 입력하세요");
			
			int no = sc.nextInt();
			
			
			
			
			pstmt = conn.prepareStatement(deleteSQL);
			pstmt.setInt(1, no);
			
			
			int cnt = pstmt.executeUpdate();
			System.out.println("데이터가 삭제 되었습니다\n");
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			try {rs.close();}catch(Exception ex) {}
			try {pstmt.close();}catch(Exception ex) {}
			try {conn.close();}catch(Exception ex) {}
		}
		
		
	}

	

}




