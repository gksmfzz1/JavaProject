package LeeHaNeul.lab;

public class Lab12 {

	public static void main(String[] args) {

		Customer c = new Customer();
		c.cno = "1";
		c.name = "박지성";
		c.jumin = "810101-1xxxxxx";
		c.addr = "영국런던";
		c.mphone = "000-5000-0001";

		c = new Customer("1", "박지성", "910101-1xxxxxx", "영국런던", "000-5000-0001");
		Customer c1 = new Customer("2", "김연아", "900101-2xxxxxx", "한국 서울", "000-6000-0001");
		Customer c2 = new Customer("3", "장미란", "830101-3xxxxxx", "한국 강원도", "000-7000-0001");
		Customer c3 = new Customer("4", "추신수", "720101-4xxxxxx", "미국 뉴욕", "000-8000-0001");

		System.out.println(c.cno);
		System.out.println(c.name);
		System.out.println(c.jumin);
		System.out.println(c.addr);
		System.out.println(c.mphone);

		Book b = new Book();
		b.bno = "1";
		b.bname = "축구의 역사";
		b.bcom = "굿스포츠";
		b.price = 7000;

		b = new Book("1", "축구의 역사", "굿스포츠", 7000);
		Book b1 = new Book("2", "축구아는 여자", "나무수", 13000);
		Book b2 = new Book("3", "축구의 이해", "대한미디어", 22000);
		Book b3 = new Book("4", "골프 바이블", "대한미디어", 35000);
		Book b4 = new Book("5", "피겨 교본", "굿스포츠", 8000);
		System.out.println(b.bno);
		System.out.println(b.bname);
		System.out.println(b.bcom);
		System.out.println(b.price);

		Order o = new Order();
		o.cno = "1";
		o.bno = "1";
		o.price = 7000;
		o.odate = "2014-07-01";

		o = new Order("1", "1", 7000, "2014-07-01");
		Order o1 = new Order("1", "2", 13000, "2014-07-03");
		Order o2 = new Order("2", "5", 8000, "2014-07-03");
		Order o3 = new Order("3", "2", 13000, "2014-07-04");
		Order o4 = new Order("4", "4", 35000, "2014-07-05");
		Order o5 = new Order("1", "3", 22000, "2014-07-07");
		Order o6 = new Order("4", "3", 22000, "2014-07-07");

		System.out.println(o.cno);
		System.out.println(o.bno);
		System.out.println(o.price);
		System.out.println(o.odate);

		Student s = new Student();
		s.sno = "201350050";
		s.sname = "김태희";
		s.saddr = "경기도 고양시";
		s.sage = "25";
		s.sbirth = "1985.3.22";
		s.major = "컴퓨터 공학";
		s.adviser = "504";
		s.time = "목 2교시";

		s = new Student("201350050", "김태희", "경기도 고양시", "25", "1985.3.22", "컴퓨터 공학", "504", "목 2교시");
		Student s1 = new Student("201250006", "송혜교", "서울 영등포구", "22", "1988.9.17", "컴퓨터공학", "301", "월 3교시");
		Student s2 = new Student("201252110", "전지현", "경기도 의정부시", "24", "1986.4.30", "의상디자인", "445", "화 4교시");
		Student s3 = new Student("201351010", "수 지", "서울 성북구", "20", "1988.7.13", "식품영양", "556", "금 7교시");
		Student s4 = new Student("201353011", "아이유", "경기도 천안시", "21", "1987.2.25", "철학", "504", "수 6교시");

		System.out.println(s.sno);
		System.out.println(s.sname);
		System.out.println(s.saddr);
		System.out.println(s.sage);
		System.out.println(s.sbirth);
		System.out.println(s.major);
		System.out.println(s.adviser);
		System.out.println(s.time);

		Department d = new Department();
		d.major = "컴퓨터 공학";
		d.pno = "123-4567-8901";
		d.office = "E동 2층";
		d.dean = "504";
		d.appoDate = "2007년";

		d = new Department("컴퓨터 공학", "123-4567-8901", "E동 2층", "504", "2007년");
		Department d1 = new Department("의상디자인", "234-5678-9012", "A동 1층", "301", "2009년");
		Department d2 = new Department("식품영양", "3456789-0123", "F동 8층", "556", "2006년");
		Department d3 = new Department("철학", "456-7890-1234", "Z동 25층", "504", "2000년");

		System.out.println(d.major);
		System.out.println(d.pno);
		System.out.println(d.office);
		System.out.println(d.dean);
		System.out.println(d.appoDate);

		Subject sub = new Subject();
		sub.subno = "0205";
		sub.subname = "프로그래밍";
		sub.subline = "자바 프로그래밍";
		sub.professor = "301";

		sub = new Subject("0205", "프로그래밍", "자바 프로그래밍", "301");
		Subject sub1 = new Subject("0211", "드레스 코드", "옷 입기의 기초", "445");
		Subject sub2 = new Subject("5029", "생활의 참견", "음식의 영양", "556");
		Subject sub3 = new Subject("4111", "악마의 사도", "종교와 철학. 과학의 얽힘", "504");

		System.out.println(sub.subno);
		System.out.println(sub.subname);
		System.out.println(sub.subline);
		System.out.println(sub.professor);

		Professor p = new Professor();
		p.pno = "301";
		p.pname = "이순신";
		p.pmajor = "프로그래밍";

		p = new Professor("301", "이순신", "프로그래밍");

		System.out.println(p.pno);
		System.out.println(p.pname);
		System.out.println(p.pmajor);

	}

}

class Customer {
	String cno;
	String name;
	String jumin;
	String addr;
	String mphone; // 멤버변수

	Customer() {
	} // 매개변수 없는 생성자

	Customer(String cno, String name, String jumin, String addr, String mphone) {

		this.cno = cno;
		this.name = name;
		this.jumin = jumin;
		this.addr = addr;
		this.mphone = mphone;
	} // 매개변수 있는 생성자
}

class Book {
	String bno;
	String bname;
	String bcom;
	int price;

	Book() {

	}

	Book(String bno, String bname, String bcom, int price) {

		this.bno = bno;
		this.bname = bname;
		this.bcom = bcom;
		this.price = price;
	}

}

class Order {
	String cno;
	String bno;
	int price;
	String odate;

	Order() {

	}

	Order(String cno, String bno, int price, String odate) {

		this.cno = cno;
		this.bno = bno;
		this.price = price;
		this.odate = odate;
	}

}

class Student {
	String sno;
	String sname;
	String saddr;
	String sage;
	String sbirth;
	String major;
	String adviser;
	String time;

	Student() {

	}

	Student(String sno, String sname, String saddr, String sage, String sbirth, String major, String adviser,
			String time) {

		this.sno = sno;
		this.sname = sname;
		this.saddr = saddr;
		this.sage = sage;
		this.sbirth = sbirth;
		this.major = major;
		this.adviser = adviser;
		this.time = time;
	}

}

class Department {
	String major;
	String pno;
	String office;
	String dean;
	String appoDate;

	Department() {

	}

	Department(String major, String pno, String office, String dean, String appoDate) {

		this.major = major;
		this.pno = pno;
		this.office = office;
		this.dean = dean;
		this.appoDate = appoDate;
	}

}

class Subject {
	String subno;
	String subname;
	String subline;
	String professor;

	Subject() {

	}

	Subject(String subno, String subname, String subline, String professor) {

		this.subno = subno;
		this.subname = subname;
		this.subline = subline;
		this.professor = professor;
	}

}

class Professor {
	String pno;
	String pname;
	String pmajor;

	Professor() {

	}

	Professor(String pno, String pname, String pmajor) {

		this.pno = pno;
		this.pname = pname;
		this.pmajor = pmajor;
	}

}
