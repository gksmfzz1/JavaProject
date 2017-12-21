package project.v1b;

public class BookVO {
	
	String bNum;
	String bName;
	String company;
	int price;
	
	public BookVO() {
	}

	public BookVO(String bNum, String bName, String company, int price) {
		super();
		this.bNum = bNum;
		this.bName = bName;
		this.company = company;
		this.price = price;
	}

	public String getbNum() {
		return bNum;
	}

	public void setbNum(String bNum) {
		this.bNum = bNum;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		String fmt = "[도서번호= %s, 도서이름= %s, 출판사= %s, 가격= %d]";
		return String.format(fmt,"1","축구의 역사","굿스포츠", 7000 );
	}
	
	
	
	
}
