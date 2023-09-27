package ch07_exam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ex_436_05 {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		
		
		System.out.printf("4명의 학생이름, 학과, 학번, 학점평균을 입력하세요>>\n");
		for(int i=0;i<4;i++) {
			System.out.printf(">>");
			String[] data = scan.nextLine().trim().split(",");
			al.add(new Student(data[0],data[1],Integer.parseInt(data[2]),Double.parseDouble(data[3])));
			
		}
		System.out.println("===============================================");
		
		Iterator<Student> ir = al.iterator();
		while(ir.hasNext()) {
			System.out.printf("%s \n",ir.next());
		}
		System.out.println("===============================================");
		
		while(true) {
			System.out.printf("학생이름>>\n");
			String name = scan.next().trim();
			if(name.equals("그만")) {
				break;
			}
			System.out.printf("학생번호>>\n");
			int id = Integer.parseInt(scan.next().trim());
			Student findStu =new Student(name,id);
			boolean isFind = al.contains(findStu);
			if(isFind) {
				System.out.printf("%s \n",al.get(al.indexOf(findStu)));
			}else {
				System.out.printf("찾는 학생이 없습니다.\n");
			}
			
		}
		
		System.out.println("The end");
		
		
		
	}

}
