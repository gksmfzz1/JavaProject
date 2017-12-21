package LeeHaNeul;

public class Overrides {

	public static void main(String[] args) {
		// 메서드 오버라이드

	}

}

class SungJuk2 {
	protected String name;
	protected int kor;
	protected int eng;
	protected int mat;

	public int getTotal() {
		return kor + eng + mat;
	}

	public double getAverage() {
		double avg = ((double) kor + eng + mat) / 3;
		return avg;
		// return getTotal()/3;
	}

	public char getGrade() {
		char grd = '가';
		double avg = ((double) (kor + eng + mat) / 3);
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grd = '수';
			break;
		case 8:
			grd = '우';
			break;
		case 7:
			grd = '미';
			break;
		case 6:
			grd = '양';
			break;

		}
		return grd;
	}

}

class MidSungJuk2 extends SungJuk2 {
	protected int sci;
	protected int art;

	@Override
	public int getTotal() {

//		return kor + eng + mat + sci + art;
		int tot = super.getTotal() + sci + art;		// super. 명령어를 이용해서 시간과 코드를 단축시킬 수 있다
		return tot;
	}

	@Override
	public double getAverage() {
//		double avg = (double) (kor + eng + mat + sci + art) / 5;
//		return avg;
		double avg = (double)getTotal()/5;
		return avg;
	}

	@Override
	public char getGrade() {
		char grd = '가';
		int avg = (int)getAverage()/10;
		switch (avg) {
		case 10:
		case 9:
			grd = '수';
			break;
		case 8:
			grd = '우';
			break;
		case 7:
			grd = '미';
			break;
		case 6:
			grd = '양';
			break;
		}
		return grd;
	}

}