import java.util.Scanner;

public class SmartPhonemain {
	public static void AllPrint() {
		System.out.println("Contact------------------------------");
		System.out.println(">> 1. 연락처 등록");
		System.out.println(">> 2. 모든 연락처 출력");
		System.out.println(">> 3. 연락처 검색");
		System.out.println(">> 4. 연락처 삭제");
		System.out.println(">> 5. 연락처 수정");
		System.out.println(">> 6. 프로그램 종료");
	}

	public static void main(String[] args) {
		boolean a = true;
		SmartPhone sp = new SmartPhone();	
		Scanner sc = new Scanner(System.in);
		System.out.println("# 데이터 두개를 입력합니다.");	
		sp.addContact(sp.inputContactData());
		sp.addContact(sp.inputContactData());
		AllPrint();	
		while(a) {				 				 
			switch(sc.nextInt())  {
			case 1: sp.addContact(sp.inputContactData());
				    AllPrint();	
				    break;		  		     
			case 2: sp.printAllConatact();
			        AllPrint();	
			        break;
			case 3:	System.out.println("이름을 입력하세요 :");
			        sp.searchContact(sc.next());
			        AllPrint();	
			        break;
			case 4: System.out.println("삭제할 이름을 입력하세요 :");
			        sp.deleteContact(sc.next());
			        AllPrint();	
			        break;
			case 5:
				    break;
			case 6: System.out.println("프로그램을 종료합니다.");
			        a = false;
			        break;
		  default : System.out.println("잘못된 번호를 입력하셨습니다.");
			        return;








			}

		}	
	}
}

