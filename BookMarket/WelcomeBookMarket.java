package Java;

import java.util.Scanner;

public class WelcomeBookMarket {
	
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		String name; // 고객 이름
		int phone; // 연락처
		int num; // 번호 선택
		
		System.out.print("당신의 이름을 입력하세요 : ");
		name = scan.next();
		
		System.out.print("연락처를 입력하세요 : ");
		phone = scan.nextInt();
		
		boolean flag = false; //무한반복
		
		while(!flag) {
			System.out.println("*************************************************");
				System.out.println("\t\t\t\t" + "Book Market Menu" );
			System.out.println("*************************************************");
				System.out.println(" 1. 고객 정보 확인하기 \t4. 장바구니에 항목 추가하기");
				System.out.println(" 2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
				System.out.println(" 3. 장바구니 비우기   \t6. 장바구니의 항목 삭제하기");
				System.out.println(" 7. 영수증 표시하기   \t8. 종료");
			System.out.println("*************************************************");
			
			
				System.out.print("메뉴 번호를 선택해주세요 : ");
				num = scan.nextInt();
				
				if(num <1 || num > 8) {
					System.out.println("1부터 8까지의 숫자를 입력하세요.");
				}else {
					switch (num) {
						case 1:
							System.out.println("현재 고객 정보");
							System.out.println("이름 : " + name +",   연락처 : " + phone);
							break;
						case 2:
							System.out.println("2. 장바구니 상품 목록 보기 :");
							break;
						case 3:
							System.out.println("3. 장바구니 비우기");
							break;
						case 4:
							System.out.println("4. 장바구니에 항목 추가하기 : ");
							break;
						case 5:
							System.out.println("5. 장바구니의 항목 수량 줄이기");
							break;
						case 6:
							System.out.println("6. 장바구니의 항목 삭제하기");
							break;
						case 7:
							System.out.println("7. 영수증 표시하기");
							break;
						case 8:
							System.out.println("8. 종료");
							flag = true; //종료
							break;
							
					}
				}
					
					
		}
		
//		
//		
//		String tagline = "Welcome to Book Market!";
//		
//		System.out.println("*************************************************");
//			System.out.println("\t" + tagline);
//		
//		System.out.println("*************************************************");
//			System.out.println(" 1. 고객 정보 확인하기 \t4. 장바구니에 항목 추가하기");
//			System.out.println(" 2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
//			System.out.println(" 3. 장바구니 비우기   \t6. 장바구니의 항목 삭제하기");
//			System.out.println(" 7. 영수증 표시하기   \t8. 종료");
//		System.out.println("*************************************************");
//		
//		
//		System.out.print("메뉴 번호를 선택해주세요");
//		 num = scan.nextInt();
//		System.out.println(num + "번을 선택했습니다.");
//		
//		

	}

}
