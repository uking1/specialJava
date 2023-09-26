package ch07_sec04;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HastMapTest {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		HashMap<String, String> hmDic = new HashMap<String, String>();

		// HashMap 추가
		hmDic.put("baby", "아기");
		hmDic.put("love", "사랑");
		hmDic.put("apple", "사과");

		// HashaMap 출력(key -> Set 변환)
		Set<String> keySet = hmDic.keySet();

		for (String key : keySet) {
			System.out.printf("key=%s \t value=%s \n", key, hmDic.get(key));
		}

		// 검색기능
		while(true) {
			System.out.printf("검색할 단어를 입력(exit:종료)>>");
			String search = scan.nextLine().trim();
			
			if(search.equals("exit")||search.equals("EXIT")) {
				System.out.printf("종료 합니다..\n");
				break;
			}
			String value = hmDic.get(search);
			System.out.printf("%s >> %s \n",search,hmDic.get(search));
			
			
		}
		
		
		System.out.println("The end");
	}

}
