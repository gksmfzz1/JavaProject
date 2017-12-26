package LeeHaNeul.adv;

import java.util.HashMap;
import java.util.Iterator;

import project.v1.SungJukVO;

public class HashMaps {

	public static void main(String[] args) {
		// 해시맵 - 데이터 저장은 느리지만, 많은 양의 데이터 검색시 유리 (해시함수로 난수를 만드는 과정때문에 속도가 느림)
		// 키와 값으로 데이터를 저장 - 키는 중복X, 값은 중복 허용
		
		HashMap<Integer, String> hmap1 =new HashMap<>();	
		// 키는 숫자형 , 값은 문자형인 HashMap 객체생성
		HashMap<String , SungJukVO> hmap2 =new HashMap<>();	
		// 키는 문자형 , 값은  SungJukVO인 HashMap 객체 생성
		
		hmap1.put(11, "혜교");  			// 키값은 순차적으로 하지 않아도 가능
		hmap1.put(23, "지현");			// 키의 값의 범위를 늘려 놓는 것이 충돌을 가장 방지 할 수 있음
		hmap1.put(35, "수지");			// add가 아닌 put으로 입력
		hmap1.put(49, "중기");
		// hashmap에 각 요소 추가
		
		System.out.println("키 23 : " + hmap1.get(23));		// 출력시 get 사용
		System.out.println("키 49 : " + hmap1.get(49));
		// 특정키로 검색하기
		
		System.out.println("키 11 : " + hmap1.get(11));
		hmap1.remove(11);									// remove(키값)으로 특정키만 삭제가능
		System.out.println("키 11 : " + hmap1.get(11));		// 삭제되면 기본값으로 돌아감
		
		//모든 내용 출력
//		Iterator it = hmap1.keySet().iterator();
//		while(it.hasNext()) {
//			Integer key = (Integer)it.next();			//지네릭으로 쓰지 않았기 때문에 형변환이 필요
//			System.out.println(key + "/" + hmap1.get(key));
//		}
		
		Iterator<Integer> it = hmap1.keySet().iterator();	// 지네릭사용 - 형변환 필요X
		while(it.hasNext()) {
			Integer key = it.next();			
			System.out.println(key + "/" + hmap1.get(key));
		}
		
		SungJukVO sj1 = new SungJukVO("혜교", 98,78,56);
		SungJukVO sj2 = new SungJukVO("지현", 54,85,63);
		SungJukVO sj3 = new SungJukVO("수지", 79,62,93);
		SungJukVO sj4 = new SungJukVO("중기", 88,50,91);
		
		hmap2.put("혜교", sj1);
		hmap2.put("지현", sj2);
		hmap2.put("수지", sj3);
		hmap2.put("중기", sj4);
		
		System.out.println(hmap2.get("수지"));
		
		Iterator<String> it1 = hmap2.keySet().iterator();
		while(it1.hasNext()) {
			String key = it1.next();
			System.out.println(key + "/" + hmap2.get(key));
		}
		
		
		// 간단한 검색
		Integer key1 = 35;
		String key2 = "지현";
		
		if(hmap1.containsKey(key1))					//containsKey(선언한 키값)을 이용해 간단하게 검색
			System.out.println(key1 + "/" + hmap1.get(key1));
		else
			System.out.println("데이터가 없어요");
		
		
		if(hmap2.containsKey(key2))
			System.out.println(key2 + "/" + hmap2.get(key2));
		else
			System.out.println("데이터가 없어요");
		
	}

}
