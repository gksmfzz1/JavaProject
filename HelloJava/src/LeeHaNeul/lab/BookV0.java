package LeeHaNeul.lab;

public class BookV0 {

	private String bookNumber; // 도서번호
	private String bookName; // 도서명
	private String company; // 출판사
	private String writer; // 지은이
	private String gerne; // 장르
	private int price; // 가격
	private boolean isRent; // 대여여부
	private String regDate; // 등록일

	public BookV0() {

	}

	public BookV0(String bookNumber, String bookName, String company, String writer, String gerne, int price,
			boolean isRent, String regDate) {

		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.company = company;
		this.writer = writer;
		this.gerne = gerne;
		this.price = price;
		this.isRent = isRent;
		this.regDate = regDate;
	}

	public String getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(String bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getGerne() {
		return gerne;
	}

	public void setGerne(String gerne) {
		this.gerne = gerne;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isRent() {
		return isRent;
	}

	public void setRent(boolean isRent) {
		this.isRent = isRent;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "BookV0 [bookNumber=" + bookNumber + ", bookName=" + bookName + ", company=" + company + ", writer="
				+ writer + ", gerne=" + gerne + ", price=" + price + ", isRent=" + isRent + ", regDate=" + regDate
				+ "]";
	}
}

class Gerne {
	private String comics; // 코믹스
	private String love; // 순정
	private String special; // 애장판
	private String novel; // 소설
	private String month; // 월간지
	private String bookAddr; // 책위치

	public Gerne() {
	}

	public Gerne(String comics, String love, String special, String novel, String month, String bookAddr) {
		super();
		this.comics = comics;
		this.love = love;
		this.special = special;
		this.novel = novel;
		this.month = month;
		this.bookAddr = bookAddr;
	}

	public String getComics() {
		return comics;
	}

	public void setComics(String comics) {
		this.comics = comics;
	}

	public String getLove() {
		return love;
	}

	public void setLove(String love) {
		this.love = love;
	}

	public String getSpecial() {
		return special;
	}

	public void setSpecial(String special) {
		this.special = special;
	}

	public String getNovel() {
		return novel;
	}

	public void setNovel(String novel) {
		this.novel = novel;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getBookAddr() {
		return bookAddr;
	}

	public void setBookAddr(String bookAddr) {
		this.bookAddr = bookAddr;
	}

	@Override
	public String toString() {
		return "Gerne [comics=" + comics + ", love=" + love + ", special=" + special + ", novel=" + novel + ", month="
				+ month + ", bookAddr=" + bookAddr + "]";
	}

}

class Price {
	private int rentp; // 대여료
	private int rentd; // 대여기간
	private int arrears; // 연체금

	public Price() {

	}

	public int getRentp() {
		return rentp;
	}

	public void setRentp(int rentp) {
		this.rentp = rentp;
	}

	public int getRentd() {
		return rentd;
	}

	public void setRentd(int rentd) {
		this.rentd = rentd;
	}

	public int getArrears() {
		return arrears;
	}

	public void setArrears(int arrears) {
		this.arrears = arrears;
	}

	@Override
	public String toString() {
		return "Price [rentp=" + rentp + ", rentd=" + rentd + ", arrears=" + arrears + "]";
	}
}
