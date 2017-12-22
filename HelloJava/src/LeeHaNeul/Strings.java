package LeeHaNeul;

public class Strings {

	public static void main(String[] args) {
			// String 클래스 주요 메서드
		// char charAt(int index)
		// 지정된 위치에 있는 문자를 알려준다 index는 0부터 시작
		String s = "Hello";
		String n = "1234567890";
		char c1 = s.charAt(1);
		char c2 = n.charAt(1);
		System.out.println(c1);
		
		// boolean contains(CharSequence s)
		// 지정된 문자열이 포함되었는지 검사한다
		s = "abcedfg";
		boolean b = s.contains("bc");
		System.out.println(b);
		
		// boolean equalsIgnoreCase(String str)
		// 문자열과 String인스턴스의 문자열을 대소문자 구분없이 비교한다
		s= "Hello";
		b= s.equalsIgnoreCase("Hello");
		boolean b2 = s.equalsIgnoreCase("hello");
		System.out.printf("%b %b \n",b, b2);
		
		// int indexOf(String str)
		//주어진 문자열이 존재하는지 확인하여 그 위치를 알려준다/ 없으면 -1을 반환한다 index는 0부터
		s = "ABCDEFG";
		int idx = s.indexOf("CD");
		System.out.println(idx);
		
		// int lastIndexOf(int ch)
		// 지정된 문자 또는 문자코드를 문자열의 오른쪽 끝에서부터 찾아서 위치를 알려준다/ 없으면-1 반환
		s="java.lang.Object";
		int idx1 = s.lastIndexOf('.');
		int idx2 = s.indexOf('.');
		System.out.printf("%d %d \n",idx1,idx2);
		
		//int length()
		// 문자열의 길이를 알려준다
		s="Hello";
		int length = s.length();
		System.out.println(length);
		
		//String replace(char a, char b)
		//문자열 중의 문자(a)를 새로운 문자(b)로 바꾼 문자열을 반환한다
		s="Hello";
		String s1 = s.replace('H','C');
		System.out.println(s1);
		
		//String[] split(String regex)
		// 문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환한다
		String animals= "dog,cat,bear";
		String[] arr = animals.split(",");
		System.out.printf("%s %s %s \n",arr[0],arr[1],arr[2]);
		
		//String substring(int begin)
		//String substring(int begin, int end)
		//주어진 시작위치(begin)부터 끝 위치(end) 범위에 포함된 문자열을 얻는다
		// 이 때, 시작위치의 문자는 범위에 포함되지만, 끝 위치의 문자는 포함되지 않는다 (begin <= x < end)
		s= "java.lang.Object";
		String c = s.substring(10);
		String p = s.substring(5,9);
		System.out.printf("%s %s \n",c,p);
		
		// String trim()
		// 문자열의 왼쪽 끝과 오른쪽 끝에 있는 공백을 없앤 결과를 반환한다
		// 이 때 문자열 중간에 있는 공백은 제거되지 않는다
		s = "    Hello World  ";
		s1 = s.trim();
		System.out.println(s1);
		
		//static String valueOf (자료형 데이터값)
		//지정된 값을 문자열로 변환하여 반환한다
		// 참조변수의 경우, toString()을 호출한 결과를 반환한다
		
		String b1 = String.valueOf(true);
		String c3 = String.valueOf('a');
		String i = String.valueOf(100);
		String l = String.valueOf(100L);
		String f = String.valueOf(10f);
		String d = String.valueOf(10.0);
		java.util.Date dd = new java.util.Date();
		String date = String.valueOf(dd);
		System.out.println(b1);
		System.out.println(c3);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(date);
		
		// StringBuffer 사용방법
		// 본문예제 9-18
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println("sb == sb2 ?" + (sb ==sb2));
		System.out.println("sb.equals(sb2) ?" + sb.equals(sb2));
		
		// StringBuffer의 내용을 String으로 변환한다
		String ss = sb.toString();
		String ss2 = sb2.toString();
		
		System.out.println("ss.equals(ss2) ?"+ ss.equals(ss2));
		
		//StringBuffer append
		//매개변수로 입력된 값을 문자열로 변환하여 
//		//StringBuffer인스턴스가 저장하고 있는 문자열의 뒤에 덧붙인다
//		StringBuffer append(boolean b)
//		StringBuffer append(char c)
//		StringBuffer append(char[] str)
//		StringBuffer append(double d)
//		StringBuffer append(float f)
//		StringBuffer append(int i)
//		StringBuffer append(long l)
//		StringBuffer append(Object obj)
//		StringBuffer append(String str)
		StringBuffer tu = new StringBuffer("abc");
		StringBuffer tu2 = tu.append(true);
		tu.append('d').append(10.0f);
		
		StringBuffer tu3 = tu.append("ABC").append(123);
		System.out.println(tu);
		System.out.println(tu2);
		System.out.println(tu3);
		
	}

}
