package LeeHaNeul.lab;

public class SungJukService {

	private int tot = 0;
	private double avg = 0;
	private String grd = "가";

	// getTotal
	public int getTotal(int kor, int eng, int mat) {
		// return (kor+eng+mat);
		tot = kor + eng + mat;
		return tot;
	}

	// 객체지향 특성 중 다형성
	public int getTotal(SungJukV0 sj) {
		tot = sj.getKor() + sj.getEng() + sj.getMat();
		return tot;
	}

	// 또 다른 유형의 getTotal
	public void getTotal() {

	}

	// getAverage
	// public double getAverage(int kor, int eng, int mat) {
	// return ((kor+eng+mat)/3);
	public double getAverage() {
		avg = (double) tot / 3;
		return avg;
	}

	// getGrade

	public String getGrade() {

		// grd = (avg >= 90) ? "수":
		// (avg >= 80) ? "우" :
		// (avg>= 70) ? "미":
		// (avg >= 60) ? "양" : "가";
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grd = "수";
			break;
		case 8:
			grd = "우";
			break;
		case 7:
			grd = "미";
			break;
		case 6:
			grd = "양";
			break;
		}
		return grd;
	}

}
