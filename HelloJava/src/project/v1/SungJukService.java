package project.v1;

public interface SungJukService {

	// 성적 데이터 CRUD 처리 - 저장, 조회, 수정, 삭제
	void addSungJuk(SungJukVO sj);			//데이터 생성
	
	String getSungJuk();
	
	String getSungJuk(String name);			//데이터조회
	
	void modifySungJuk(SungJukVO sj);		//데이터수정
	
	void removeSungJuk(String name);		//데이터삭제
}

  