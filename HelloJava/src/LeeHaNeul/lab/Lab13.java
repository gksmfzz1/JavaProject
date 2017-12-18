package LeeHaNeul.lab;

public class Lab13 {

	public static void main(String[] args) {

		// #37

		Person ps = new Person("하늘", "경기 오산시", "010-0000-0000");
		System.out.println(ps);

		Customer1 cs = new Customer1("하늘", "경기 오산시", "010-0000-0000", "1", 0);
		System.out.println(cs);

		// #38

		Book1 book = new Book1("자바", "500", "홍길동");
		System.out.println(book);

		Magazine mg = new Magazine("자바", "500", "홍길동", "2017-12-18");
		System.out.println(mg);

		// #39

		Phone ph = new Phone("애플", "100만원", "4G");
		System.out.println(ph);

		SmartPhone sp = new SmartPhone("애플", "100만원", "4G", "ios10", "256GB", true, true);
		System.out.println(sp);
	}

}

class Person {
	private String name;
	private String addr;
	private String phoneNum;

	public Person() {

	}

	public Person(String name, String addr, String phoneNum) {

		this.name = name;
		this.addr = addr;
		this.phoneNum = phoneNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", phoneNum=" + phoneNum + "]";
	}
}

class Customer1 {
	private String name;
	private String addr;
	private String phoneNum;
	private String cusNum;
	private int mileage;

	public Customer1() {

	}

	public Customer1(String name, String addr, String phoneNum, String cusNum, int mileage) {

		this.name = name;
		this.addr = addr;
		this.phoneNum = phoneNum;
		this.cusNum = cusNum;
		this.mileage = mileage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getCusNum() {
		return cusNum;
	}

	public void setCusNum(String cusNum) {
		this.cusNum = cusNum;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Customer1 [name=" + name + ", addr=" + addr + ", phoneNum=" + phoneNum + ", cusNum=" + cusNum
				+ ", mileage=" + mileage + "]";
	}

}

class Book1 {
	private String bookName;
	private String page;
	private String writer;

	public Book1() {
	}

	public Book1(String bookName, String page, String writer) {

		this.bookName = bookName;
		this.page = page;
		this.writer = writer;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "Book1 [bookName=" + bookName + ", page=" + page + ", writer=" + writer + "]";
	}

}

class Magazine {
	private String bookName;
	private String page;
	private String writer;
	private String iod;

	public Magazine() {

	}

	public Magazine(String bookName, String page, String writer, String iod) {

		this.bookName = bookName;
		this.page = page;
		this.writer = writer;
		this.iod = iod;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getIod() {
		return iod;
	}

	public void setIod(String iod) {
		this.iod = iod;
	}

	@Override
	public String toString() {
		return "Magazine [bookName=" + bookName + ", page=" + page + ", writer=" + writer + ", iod=" + iod + "]";
	}

}

class Phone {
	private String company;
	private String price;
	private String comType;

	public Phone() {

	}

	public Phone(String company, String price, String comType) {

		this.company = company;
		this.price = price;
		this.comType = comType;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getComType() {
		return comType;
	}

	public void setComType(String comType) {
		this.comType = comType;
	}

	@Override
	public String toString() {
		return "Phone [company=" + company + ", price=" + price + ", comType=" + comType + "]";
	}
}

class SmartPhone {
	private String company;
	private String price;
	private String comType;
	private String os;
	private String memory;

	private Boolean isCamera;
	private Boolean isBluetooth;

	public SmartPhone() {

	}

	public SmartPhone(String company, String price, String comType, String os, String memory, Boolean Camera,
			Boolean Bluetooth) {
		super();
		this.company = company;
		this.price = price;
		this.comType = comType;
		this.os = os;
		this.memory = memory;
		this.isCamera = Camera;
		this.isBluetooth = Bluetooth;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getComType() {
		return comType;
	}

	public void setComType(String comType) {
		this.comType = comType;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public Boolean getIsCamera() {
		return isCamera;
	}

	public void setIsCamera(Boolean isCamera) {
		this.isCamera = isCamera;
	}

	public Boolean getIsBluetooth() {
		return isBluetooth;
	}

	public void setIsBluetooth(Boolean isBluetooth) {
		this.isBluetooth = isBluetooth;
	}

	@Override
	public String toString() {
		return "SmartPhone [company=" + company + ", price=" + price + ", comType=" + comType + ", os=" + os
				+ ", memory=" + memory + ", isCamera=" + isCamera + ", isBluetooth=" + isBluetooth + "]";
	}

}
