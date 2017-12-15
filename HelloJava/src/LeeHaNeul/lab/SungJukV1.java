package LeeHaNeul.lab;

import java.util.Scanner;

public class SungJukV1 {
	public static void main(String[] args) {

		/*
		 * 성적 처리 프로그램 V1 간단한 성적처리를 수행하는 프로그램 입력 : 이름, 국어, 영어, 수학 처리 : 총점, 평균, 학점 결과 :이름,
		 * 국어, 영어, 수학, 총점, 평균, 학점
		 * 
		 */

		String name = "sky"; // 이름

		int kor = 76; // 국어
		int eng = 68; // 영어
		int math = 43; // 수학

		int total = kor + eng + math; // 총점
		System.out.println(total);

		float avg = total / 3.00f; // 평균
		System.out.printf("avg = %.1f\n", avg); // %.1f - 소수점 자릿수 지정

		char grd = (avg >= 90) ? '수' : (avg >= 80) ? '우' : (avg >= 70) ? '미' : (avg >= 60) ? '양' : '가';
		System.out.println(grd); // 학점

		System.out.println("이름 :" + name);
		System.out.println("국어 :" + kor);
		System.out.println("영어 :" + eng);
		System.out.println("수학 :" + math);
		System.out.println("총점 :" + total);
		System.out.println("평균 :" + avg);
		System.out.println("학점 :" + grd); // 결과 값

		String fmt = "이름 : %s \n 국어 : %d 영어 : %d 수학 : %d \n 총점 : %d \n 평균 : %f \n 학점 : %s ";
		System.out.printf(fmt, name, kor, eng, math, total, avg, grd); // 서식화된출력

		Scanner sc = new Scanner(System.in); // new연산자로 작업을 끝냈을 경우 Scanner를 사용할 때 쓴 자원을
												// 반드시 반납해야함 (더이상 쓰지 않아도 될 때 닫아야함)
		System.out.println("\n 성적 처리프로그램 v1");
		System.out.println("---------------");

		System.out.print("\n이름을 입력하세요 : "); // ln - 밑줄에 입력됨
		name = sc.nextLine();
		System.out.print("국어점수를 입력하세요 : ");
		kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어점수를 입력하세요 : ");
		eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학점수를 입력하세요 : ");
		math = Integer.parseInt(sc.nextLine());
		System.out.print("총점을 입력하세요 : ");
		total = Integer.parseInt(sc.nextLine());
		System.out.printf("avg = %14.1f%n", avg);
		System.out.println(grd);

		// Scanner 객체닫기
		sc.close();

		// 변수선언 //avg - 충돌할 위험있음 > avrg
		// 성적처리
		// 데이터입력 - 입력 자료는 하드코딩
		// 결과출력

		// String fmt1 = "이름 : %s \n ,국어 : %d ,영어 : %d ,수학 : %d \n";
		// fmt1 += "총점: %d , 평균 : %.1f , 학점: %c\n"; <<<내용을 더 추가할 때 +=
		// (= fmt1 = fmt1 + "총점: %d , 평균 : %.1f , 학점: %c\n";

		// 데이터 입력 - Scanner 사용
		// kor = sc.nextint(); - 반드시 int값만 사용해야함
	}
}
