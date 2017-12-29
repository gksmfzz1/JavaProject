package LeeHaNeul.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SungJukJDBC3 {

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
		
		String insertSQL = "insert into sungjuk (sjno, name, kor, eng, mat, tot, avrg, grd) values (sjno.nextval, ?, ?, ?, ?, ?, ?, ?) ";		
		String updateSQL = null;
		String deleteSQL = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("추가할 학생 성적을 입력하세요 (이름/국어/영어/수학)");

		String name = sc.nextLine();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		
		// 총점/평균/학점처리
		
		int tot = (kor + eng + mat);
		double avrg = (double)tot/3;
		String grd = "가";
		switch((int)(avrg/10)) {
		case 10: case 9: grd="수";break;
		case 8 : grd= "우";break;
		case 7 : grd ="미";break;
		case 6 : grd = "양";break;
		}
		
		try {
			//1.
			Class.forName(DRV);
			//2.
			conn =DriverManager.getConnection(URL,USR,PWD);
			//3.
			pstmt = conn.prepareStatement(insertSQL);
			pstmt.setString(1, name); // 첫번째 ? 자리에 실제로 적용되는 값 지정
			pstmt.setInt(2, kor);
			pstmt.setInt(3, eng);
			pstmt.setInt(4, mat);
			pstmt.setInt(5, tot);
			pstmt.setDouble(6, avrg);
			pstmt.setString(7, grd);
			//4.
			int cnt =pstmt.executeUpdate();		// select문이기때문에 Query사용
			System.out.println(cnt + "건의 성적이 추가되었습니다");
			//5.
//			SungJukVO sj = new SungJukVO();
//		
//				if (rs.next()) {		// (조건에 일치하는 데이터가) 결과집합에 존재한다면
//					sj.setName(rs.getString("name"));
//					sj.setKor(rs.getInt("kor"));
//					sj.setEng(rs.getInt("eng"));
//					sj.setMat(rs.getInt("mat"));
//					sj.setTot(rs.getInt("tot"));
//					sj.setAvrg(rs.getInt("avrg"));
//					sj.setGrd(rs.getString("grd"));
//					
//				}
//			System.out.println(sj);
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			try {rs.close();}catch(Exception ex) {}
			try {pstmt.close();}catch(Exception ex) {}
			try {conn.close();}catch(Exception ex) {}
		}
		
		
	}

	
}
