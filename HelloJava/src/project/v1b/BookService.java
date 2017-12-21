package project.v1b;

public interface BookService {

	void addBook (BookVO bk);
	
	String getBook();
	
	String getBook(String bNum);
	
	void modifyBook(BookVO bk);		
	
	void removeBook(String bNum);
	
	
	
}
