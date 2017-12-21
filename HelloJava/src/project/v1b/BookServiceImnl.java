package project.v1b;

public class BookServiceImnl implements BookService {

	@Override
	public void addBook(BookVO bk) {
		System.out.println("도서정보을 생성합니다");
	}

	@Override
	public String getBook() {
		String out = "도서정보를 출력합니다";
		return out;
	}

	@Override
	public String getBook(String bNum) {
		return bNum;
	}

	@Override
	public void modifyBook(BookVO bk) {
		System.out.println("도서정보가 수정되었습니다");
	}

	@Override
	public void removeBook(String bNum) {
		System.out.println("도서정보가 삭제되었습니다");
	}

}
