package LeeHaNeul.adv;

import java.io.Serializable;

public class ZipcodeVO implements Serializable{

	String 시도;
	String 시군구;
	String 읍면;
	String 도로명;
	int 건물번호본번;
	int 건물번호부번;
	String 시군구용건물명;
	String 법정동명;
	String 리명;
	int 지번본번;

	public ZipcodeVO() {
	}

	public ZipcodeVO(String 시도, String 시군구, String 읍면, String 도로명, int 건물번호본번, int 건물번호부번, String 시군구용건물명,String 법정동명, String 리명,
			int 지번본번) {
		
		this.시도 = 시도;
		this.시군구 = 시군구;
		this.읍면 = 읍면;
		this.도로명 = 도로명;
		this.건물번호본번 = 건물번호본번;
		this.건물번호부번 = 건물번호부번;
		this.시군구용건물명 = 시군구용건물명;
		this.법정동명 = 법정동명;
		this.리명 = 리명;
		this.지번본번 = 지번본번;
	}

	public String get시도() {
		return 시도;
	}

	public String get법정동명() {
		return 법정동명;
	}

	public void set법정동명(String 법정동명) {
		this.법정동명 = 법정동명;
	}

	public void set시도(String 시도) {
		this.시도 = 시도;
	}

	public String get시군구() {
		return 시군구;
	}

	public void set시군구(String 시군구) {
		this.시군구 = 시군구;
	}

	public String get읍면() {
		return 읍면;
	}

	public void set읍면(String 읍면) {
		this.읍면 = 읍면;
	}

	public String get도로명() {
		return 도로명;
	}

	public void set도로명(String 도로명) {
		this.도로명 = 도로명;
	}

	public int get건물번호본번() {
		return 건물번호본번;
	}

	public void set건물번호본번(int 건물번호본번) {
		this.건물번호본번 = 건물번호본번;
	}

	public int get건물번호부번() {
		return 건물번호부번;
	}

	public void set건물번호부번(int 건물번호부번) {
		this.건물번호부번 = 건물번호부번;
	}

	public String get시군구용건물명() {
		return 시군구용건물명;
	}

	public void set시군구용건물명(String 시군구용건물명) {
		this.시군구용건물명 = 시군구용건물명;
	}

	public String get리명() {
		return 리명;
	}

	public void set리명(String 리명) {
		this.리명 = 리명;
	}

	public int get지번본번() {
		return 지번본번;
	}

	public void set지번본번(int 지번본번) {
		this.지번본번 = 지번본번;
	}

	@Override
	public String toString() {
		String fmt = "[시도=%s, 시군구=%s, 읍면=%s, 도로명=%s, 건물번호본번=%d,건물번호부번=%d, 시군구용건물명=%s,법정동명 =%s, 리명=%s, 지번본번=%d]";
		return String.format(fmt, 시도, 시군구, 읍면, 도로명, 건물번호본번, 건물번호부번, 시군구용건물명,법정동명, 리명, 지번본번);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
