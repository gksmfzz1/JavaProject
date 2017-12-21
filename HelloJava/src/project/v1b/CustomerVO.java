package project.v1b;

public class CustomerVO {
	String cNum;
	String cName;
	String cReg;
	String cAddr;
	String cmp;
	
	public CustomerVO() {
	}

	public CustomerVO(String cNum, String cName, String cReg, String cAddr, String cmp) {
		this.cNum = cNum;
		this.cName = cName;
		this.cReg = cReg;
		this.cAddr = cAddr;
		this.cmp = cmp;
	}

	public String getcNum() {
		return cNum;
	}

	public void setcNum(String cNum) {
		this.cNum = cNum;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcReg() {
		return cReg;
	}

	public void setcReg(String cReg) {
		this.cReg = cReg;
	}

	public String getcAddr() {
		return cAddr;
	}

	public void setcAddr(String cAddr) {
		this.cAddr = cAddr;
	}

	public String getCmp() {
		return cmp;
	}

	public void setCmp(String cmp) {
		this.cmp = cmp;
	}

	@Override
	public String toString() {
		String fmt = "[번호=%s, 이름=%s, 주민번호=%s, 주소=%s, 핸드폰=%s]";
		return String.format(fmt,cNum,cName,cReg,cAddr,cmp);
	}
	
	
	
	
}
