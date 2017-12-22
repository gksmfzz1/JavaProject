package LeeHaNeul;

import project.v1.SungJukVO;

public class JavaLang {

	public static void main(String[] args) throws ClassNotFoundException {
		// 정적으로 객체 생성
		// 생성할 객체의 클래스를 직접 기술
		
		SungJukVO sj = new SungJukVO();
		Parent p = new Parent();
		Son s = new Son();
		
		// 동적으로 객체 생성
		Class obj1 = new SungJukVO().getClass();
		Class obj2 = SungJukVO.class;
		Class obj3 = 											// 클래스를 변수로 지정해서 만들 수 있음
				Class.forName("project.v1.SungJukVO");
		
		String[] cls = {"project.v1.SungJukVO" ,
				"LeeHaNeul.Parent" ,
				"LeeHaNeul.Son" };
		
		Class[] clsBase = new Class[3];	
				
		for(int i= 0; i < 3; ++i) {
			clsBase[i] = Class.forName(cls[i]);
		}
		
		// 동적으로 생성한 클래스 이름 확인
		System.out.println(clsBase[0].getName());
		System.out.println(clsBase[1].getName());
		System.out.println(clsBase[2].getName());
		
		// 클래스의 정보를 확인 - reflection
		
		// 문자열 클래스 - String : 변경불가 클래스***************
		String a = "abc";		// char[] a = {'a','b','c'};
		System.out.println(a);
		a = "xyz";				// a값을 변경하더라도 새로운 자리에 변경된 내용을 저장
		System.out.println(a);
		
		// + 연산자로 문자열 연결시 심각한 리소스 낭비 발생
		a = "1" + "2" + "3" + "4" + "5";
	}

}
