package ch07_sec05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapStudentEx {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		HashMap<String, Student> hsMap = new HashMap<String, Student>();
		
		//HashMap 추가
		hsMap.put("홍길동", new Student(1,"010-111-1111"));
		hsMap.put("저길동", new Student(2,"010-222-2222"));
		hsMap.put("구길동", new Student(3,"010-333-3333"));
		
		//HashMap 출력(KeySet 변동) : 향상된포문, 이터레이터
		Set<String> keySet = hsMap.keySet();
		for( String data : keySet ) {
			System.out.printf("key = %s, value = %s \n",data,hsMap.get(data).toString());
		}
		
		System.out.println("=============================================");
		
		Iterator<String> ir = keySet.iterator();
		while(ir.hasNext()) {
			String key = ir.next();
			System.out.printf("key = %s, value = %s \n",key,hsMap.get(key).toString());
		}
		
		//검색기능 추가
		while(true) {
			System.out.printf("검색할 이름을 입력(exit:종료)>>");
			String search = scan.nextLine().trim();
			
			if(search.equals("exit")||search.equals("EXIT")) {
				System.out.printf("종료 합니다..\n");
				break;
			}
			if(hsMap.get(search)!= null) {
			System.out.printf("%s >> %s \n",search,hsMap.get(search).toString());
			}else{
				System.out.printf("해당되는 이름이 없습니다.\n");
			}
			
		}
		
	}

}
