package LeeHaNeul.adv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriters {

	public static void main(String[] args) throws IOException {
				// I/O - Input/Output의 약자
				// 파일입출력 - 문자기반 스트림

		// 파일 쓰기 테스트
		// 키보드로 입력한 문자를 파일에 저장
		
		String fpath = "c:/Java/data01.txt";
		//입력받은 문자를 저장할 파일 위치 지정
		
//		FileWriter fw = new FileWriter(fpath);
		FileWriter fw = new FileWriter(fpath, true);		// 데이터를 계속 누적시키는 명령어
		// 스트림 생성 - 지정된 경로에 파일을 만들고
		// 입력한 문자를 파일로 저장할 수 있도록 데이터 통로 생성
		
		BufferedWriter bw = new BufferedWriter(fw);
		// 빠른 입출력처리를 위해 buffer기능이 있는 Writer클래스 사용
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요 (종료는 : q");
			String msg = sc.nextLine();
			
			if(msg.equals("q")) {	//입력한 문자가 "q"라면
				break;	//while문을 중지
			}else {
//				fw.write(msg + "\r\n");				// 파일에 내용 저장
				bw.write(msg + "\r\n");				

			}
		}
		
		bw.close(); 	// 나중에 열린 클래스를 먼저 닫는다 (순서에 주의)
		fw.close();
		// 파일에 입력한 내용을 완전히 저장하려면 반드시 필요
		
		sc.close();
		
	}

}
