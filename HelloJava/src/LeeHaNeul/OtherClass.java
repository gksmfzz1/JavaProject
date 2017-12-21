package LeeHaNeul;

import LeeHaNeul.lab.SungJukMain;
import LeeHaNeul.lab.SungJukService;

//


//import LeeHaNeul.lab.*;					// * -lab까지의 경로상의 모든 클래스를 사용하겠다는 코드 
											//  안쓰는 클래스까지 불러오므로 비용 낭비
public class OtherClass {

	public static void main(String[] args) {
		// 다른 클래스 사용하기
		// 같은 패키지 내 다른 클래스는 바로 호출하여 사용가능
		Overloads o = new Overloads();
		Overrides r = new Overrides();
		
		// 다른 패키지에 있는 클래스 사용하기
		// 해당 클래스가 존재하는 패키지경로를 모두 기술해야만 사용가능
		LeeHaNeul.lab.SungJukV1 sj = new LeeHaNeul.lab.SungJukV1();	//경로가 바뀔경우 수정이 힘들다
	
		// 다른 패키지 클래스 사용하기
		// import문을 사용하면 편리하게 다른 패키지상의 클래스를 사용 할 수 있음
		SungJukService sjsrv = new SungJukService();		// 컨트롤 스페이스 단축키로 쉽게 입력가능
		SungJukMain sjm = new SungJukMain();				// 컨트롤 쉬프트 O 로 자동검색 가능
	
	
	
	}

}
