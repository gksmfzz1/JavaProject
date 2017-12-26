package project.v3;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SungJukServiceImpl implements SungJukService {

	private String fpath1 = "c:/Java/sungjuk.txt";
	private String fpath2 = "c:/Java/sungjuk.dat";
	
	// 각종 오류 메세지를 상수로 정의해 둠
	private final String FILENOTFOUND = "\n파일이 존재하지 않습니다!!\n";
	private final String FILEIOERROR = "\n기타 파일입출력 오류입니다!!\n";
	private final String ANYWAYERROR = "\n암튼 오류입니다!!\n";
	private final String WRONGINPUT = "\n잘못입력하셨습니다!!\n";

	// 성적데이터를 저장하기 위해 ArrayList 객체 사용
	private List<SungJukVO> sjdb = null;

	public SungJukServiceImpl() {
		sjdb = initSungJukFromSerialized();
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

		for (SungJukVO sj : sjdb) {
			sb.append(String.format(fmt, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat()));
		}

		return sb.toString();
	}

	@Override
	public String getSungJuk(int no) {
		if (checkSungJukNo(no, sjdb.size()))
			return "\n잘못된 값 입력!!";

		String fmt = "\n\n%d : %s %d %d %d %d %.1f %s";
		SungJukVO sj = sjdb.get(no - 1);

		StringBuffer sb = new StringBuffer();
		sb.append(String.format(fmt, no, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat(), sj.getTot(), sj.getAvrg(),
				sj.getGrd()));

		return sb.toString();
	}

	@Override
	public void modifySungJuk(SungJukVO sj, int no) {
		if (checkSungJukNo(no, sjdb.size())) {
			System.out.println(WRONGINPUT);
			return;
		}

		processSungJuk(sj); // 성적 재계산
		sjdb.set(no - 1, sj);

		System.out.println("\n성적데이터가 수정되었습니다\n\n");
	}

	@Override
	public void removeSungJuk(int no) {
		if (checkSungJukNo(no, sjdb.size())) {
			System.out.println(WRONGINPUT);
			return;
		}

		sjdb.remove(no - 1);

		System.out.println("\n성적데이터가 삭제되었습니다\n\n");
	}

	private void processSungJuk(SungJukVO sj) {
		int tot = sj.getKor() + sj.getEng() + sj.getMat();
		double avg = (double) tot / 3;
		String grd = "가";
		switch ((int) avg / 10) {
		case 10 : case 9 : grd = "수";break;
		case 8 : grd = "우"; break;
		case 7 : grd = "미"; break;
		case 6 : grd = "양"; break;
		}

		sj.setTot(tot);
		sj.setAvrg(avg);
		sj.setGrd(grd);
	}

	private boolean checkSungJukNo(int no, int size) {
		boolean isFail = false;
		if (no <= 0 || (no > size)) {
			isFail = true;
		}
		return isFail;
	}
private List<SungJukVO> initSungJukFromSerialized(){
	List<SungJukVO> sjdb = new ArrayList<SungJukVO>();
	
	try(
			FileInputStream fis = new FileInputStream(fpath2);
			ObjectInputStream ois = new ObjectInputStream(fis);
			){
		
		sjdb = (List<SungJukVO>) ois.readObject();
	} catch(FileNotFoundException fnfe) {
		System.out.println(FILENOTFOUND);
	}catch(IOException ioe) {
		System.out.println(FILEIOERROR);
	}catch(Exception ex) {
		System.out.println(ANYWAYERROR);
	}
	
	return sjdb;
	
	
}
@Override
public void finalize() throws Throwable{
	writeSungJukToSerialized();
	
	super.finalize();
}

private void writeSungJukToSerialized() {
	try(
			FileOutputStream fos = new FileOutputStream(fpath2);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			){
		
		oos.writeObject(sjdb);
	}catch(FileNotFoundException fnfe) {
		System.out.println(FILENOTFOUND);
	}catch(IOException ioe) {
		System.out.println(FILEIOERROR);
	}catch(Exception ex) {
		System.out.println(ANYWAYERROR);
	}
}
}
