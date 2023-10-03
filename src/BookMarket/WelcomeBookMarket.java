package BookMarket;

import java.util.Scanner;

public class WelcomeBookMarket {
	public static Scanner scan = new Scanner(System.in);
	public static final int NUM_BOOK = 3; // 도서 개수
	public static final int NUM_ITEM = 10; // 도서 정보의 개수
	
	
	public static void main(String[] args) {
		String name; // 고객 이름
		int phone; // 연락처
		int num; // 메뉴 번호 선택
		String[][] bookInfoList = new String[NUM_BOOK][NUM_ITEM]; // 도서 정보 목록
		
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
				
			menuIntroduction();
			
				System.out.print("메뉴 번호를 선택해주세요 : ");
				num = scan.nextInt();
				
				if(num <1 || num > 8) {
					System.out.println("1부터 8까지의 숫자를 입력하세요.");
				}else {
					switch (num) {
						case 1:
							System.out.println("현재 고객 정보");
							System.out.println("이름 : " + name +",   연락처 : " + phone);
								menuGuestInfo(name, phone);
							break;
						case 2:
							System.out.println("2. 장바구니 상품 목록 보기 :");
							menuCartItemList();
							break;
						case 3:
							System.out.println("3. 장바구니 비우기");
							menuCartClear();
							break;
						case 4:
							System.out.println("4. 장바구니에 항목 추가하기 : ");
							menuCartAddItem(bookInfoList);
							break;
						case 5:
							System.out.println("5. 장바구니의 항목 수량 줄이기");
							menuCartRemoveItemCount();
							break;
						case 6:
							System.out.println("6. 장바구니의 항목 삭제하기");
							menuCartRemoveItem();
							break;
						case 7:
							System.out.println("7. 영수증 표시하기");
							menuCartBill();
							break;
						case 8:
							System.out.println("8. 종료");
							menuExit();
							flag = true; //종료
							break;
							
					}
				}
										
		}
		
	

	}
	public static void menuExit() {
		System.out.println("8. 종료");
		
	}
	public static void menuCartBill() {
		System.out.println("7. 영수증 표시하기");
		
	}
	public static void menuCartRemoveItem() {
		System.out.println("6. 장바구니의 항목 삭제하기");
		
	}
	public static void menuCartRemoveItemCount() {
		System.out.println("5. 장바구니의 항목 수량 줄이기");
		
	}
	public static void menuCartAddItem(String[][] book) {
		System.out.println("장바구니에 항목 추가하기:");
		bookList(book);
		
	}
	public static void menuCartClear() {
		System.out.println("장바구니 비우기:");
		
	}
	public static void menuCartItemList() {
		System.out.println("장바구니 상품 목록 :");
		
	}
	public static void menuGuestInfo(String name, int mobile) {
		System.out.println("현재 고객 정보 : ");
		System.out.println("이름 : " + name + ", 연락처 : " + mobile);
		
	}
	public static void menuIntroduction() {
	System.out.println("*************************************************");
		System.out.println("\t\t\t\t" + "Book Market Menu");
	
	System.out.println("*************************************************");
		System.out.println(" 1. 고객 정보 확인하기 \t4. 장바구니에 항목 추가하기");
		System.out.println(" 2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
		System.out.println(" 3. 장바구니 비우기   \t6. 장바구니의 항목 삭제하기");
		System.out.println(" 7. 영수증 표시하기   \t8. 종료");
	System.out.println("*************************************************");
		
	}
	public static void bookList(String[][] book) {
		book[0][0] = "book1";
		book[0][1] = "ISBN 978-89-01-26726-5";
		book[0][2] = "빅 히스토리";
		book[0][3] = "33000";
		book[0][4] = "데이비드 크리스천";
		book[0][5] = "우주와 지구, 인간을 하나로 잇는 새로운 역사";
		book[0][6] = "인문 교양";
		book[0][7] = "2022/12/23";
		
		book[1][0] = "book2";
		book[1][1] = "ISBN 979-11-6921-0621";
		book[1][2] = "SICP";
		book[1][3] = "45000";
		book[1][4] = "해럴드 에이블슨, 류광";
		book[1][5] = "컴퓨터 프로그래밍의 구조와 해석";
		book[1][6] = "개발 방법론";
		book[1][7] = "2022/12/30";
		
		book[2][0] = "book3";
		book[2][1] = "ISBN 978-89-6626-366-0";
		book[2][2] = "러스트 프로그래밍";
		book[2][3] = "35000";
		book[2][4] = "팀 맥나마라, 장연호";
		book[2][5] = "러스트는 시스템 프로그래밍에 적합한 언어";
		book[2][6] = "프로그래밍 언어";
		book[2][7] = "2022/07/08";
		
	}

}
