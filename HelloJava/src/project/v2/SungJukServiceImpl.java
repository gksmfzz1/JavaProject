package project.v2;

import java.util.ArrayList;
import java.util.List;

import project.v1.SungJukVO;

public class SungJukServiceImpl implements SungJukService {

	private List<SungJukVO> sjdb = null;	// 성적데이터를 저장하기 위해 ArrayList 객체 사용
	
	public SungJukServiceImpl() {
		sjdb = new ArrayList<>();
	}
	@Override
	public void addSungJuk(SungJukVO sj) {
		processSungJuk(sj);
		sjdb.add(sj);
	}


	@Override
	public String getSungJuk() {
		StringBuffer sb = new StringBuffer();
		String fmt = "%s %d %d %d \n";
		for (SungJukVO sj : sjdb ) {
			sb.append(String.format(fmt,sj.getName(),sj.getKor(),sj.getEng(),sj.getMat()));
		}
		return sb.toString();
	}

	@Override
	public String getSungJuk(int no) {
		return "";
		
	}

	@Override
	public void modifySungJuk(SungJukVO sj, int no) {
		
	}

	@Override
	public void removeSungJuk(int no) {
		 
	}

	private void processSungJuk(SungJukVO sj) {			//addSungJuk 에 포함될 것이기 때문에 보일 필요X
		int tot = sj.getKor() + sj.getEng() + sj.getMat();
				double avg = (double)tot /3;
			String grd = "가";
			switch((int)avg/10) {
			
			case 10: case 9 : grd="수"; break;
			case 8 : grd="우"; break;
			case 7: grd ="미"; break;
			case 6: grd = "양"; break;
			
			}
			sj.setTot(tot);
			sj.setAvrg(avg);
			sj.setGrd(grd);
	}
	
	
	
}