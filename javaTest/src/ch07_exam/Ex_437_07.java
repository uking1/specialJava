package ch07_exam;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex_437_07 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		HashMap<String, Student07> map = new HashMap<String, Student07>();
		String[] array = new String[5];
		System.out.printf("미래장학금 관리시스템 입니다.\n");

//		map.put("적당히", new Student07("적당히", 3.1));
//		map.put("나탈락", new Student07("나탈락", 2.4));
//		map.put("최고조", new Student07("최고조", 4.3));
//		map.put("상당히", new Student07("상당히", 3.9));
//		map.put("고득점", new Student07("고득점", 4.0));

		for (int i = 0; i < 5; i++) {
			System.out.printf(">>");
			array = scan.nextLine().split(",");
			String name = array[0].trim();
			double x = Double.parseDouble(array[1].trim());
			map.put(name, new Student07(name, x));
		}

		// 선발기준점수 입력
		System.out.printf("장학생 선발 학점 기준입력>>");
		double score = scan.nextDouble();

		Set<String> keyset = map.keySet();
		for (String data : keyset) {
			Student07 stu = map.get(data);
			if (stu.getGrade() >= score) {
				System.out.printf("%s ", stu.getName());
			}
		}

	}

}
