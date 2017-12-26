package LeeHaNeul.adv;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileOutputStreams {

	public static void main(String[] args) {
		// 바이트기반 스트림 - 파일 쓰기
		// 객체를 바이트기반 스트림으로 파일에 저장
		// 즉, 클래스에 대한 객체를 직렬화해서 파일에 저장함
		
		String name = "혜교";
		Users u = new Users("sky", "123456", "하늘", 26);
		int age = 26;
		
		String fpath = "c:/Java/data01.dat";
		try(FileOutputStream fos = new FileOutputStream(fpath);			//FileOutputStream(저장위치.파일이름)
				ObjectOutputStream oos = new ObjectOutputStream(fos);){	// 객체(Object)로 변환
			
			oos.writeUTF(name);		// 직렬화로 문자형을 파일에 저장
			oos.writeObject(u);		//직렬화로 객체를 파일에 저장(Object)타입으로 저장됨
			oos.writeInt(age);			// 직렬화로 숫자를 파일에 저장
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
// 클래스를 직렬화해서 파일에 저장하려면
// 해당 클래스는 Serializable 인터페이스를 구현해야 함
class Users implements Serializable{
	
	private static final long serialVersionUID 
	= 4014502328910900162L;
	
	String userid;
	String passwd;
	String name;
	int age;
	
	public Users() { }
	
	public Users(String userid, String passwd, String name, int age) {
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.age = age;
	}
	
	

	
}