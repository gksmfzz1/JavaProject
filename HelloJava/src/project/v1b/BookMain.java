package project.v1b;

public class BookMain {

	public static void main(String[] args) {

		BookService bsrv = new BookServiceImnl();
		
		BookVO bk = new BookVO("1","축구의 역사","굿스포츠",7000);
		
		bsrv.addBook(bk);
		
		System.out.println(bk);
		
		bk = new BookVO("2","축구아는 여자","나무수",1300);
		
		bsrv.modifyBook(bk);	
		
		bsrv.removeBook("2");
		
		
		
		
	}

}
