package project.v2;

import project.v1.SungJukVO;

public interface SungJukService {

	// 성적 데이터 CRUD 처리 - 저장, 조회, 수정, 삭제
	void addSungJuk(SungJukVO sj);			//데이터 생성
	
	String getSungJuk();
	
	String getSungJuk(int no);			//데이터조회 - 번호로 조회
	
	void modifySungJuk(SungJukVO sj, int no);		//데이터수정 - 번호로 조회
	
	void removeSungJuk(int no);		//데이터삭제 - 번호로 삭제
}

  