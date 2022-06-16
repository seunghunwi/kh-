import java.util.Scanner;

import com.sun.javafx.fxml.BeanAdapter;

public class SmartPhone {
	Contact[] ct = new Contact[10];
	int num = 0;

	Contact inputContactData() {  // 키보드로 입력 받아 객체를 생성한다.   
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("전화번호 :");
		String phoneNumber = sc.next();
		System.out.print("이메일 :");
		String email = sc.next();
		System.out.print("주소 :");
		String account = sc.next();
		System.out.print("생일 :");
		String birth = sc.next();
		System.out.print("그룹 : ");
		String group = sc.next();
		Contact ct = new Contact(name, phoneNumber,email, account, birth, group);
		return ct;
	}
	void addContact(Contact contact){// 배열에 연락처 객체 저장
			ct[num] = contact;	
			num++;
			System.out.println(">>> 데이터가 저장되었습니다"+ "("+ num +")");
		}					
	void printContact(Contact contact){// 객체 정보 출력
		contact.printinfo();	
	}
	void printAllConatact() { // 모든 연락처 출력
		for(int i=0; i<num; i++) {
			ct[i].printinfo();
		}		
	}
	void searchContact(String name){ // 연락처 검색
		for(int i=0; i<=num; i++) {
			if(ct[i].getPhonename().contentEquals(name)) {
				printContact(ct[i]);	
				break;
			}		   			       
		}
	}
	void deleteContact(String name) { // 연락처 삭제
		for(int i=0; i<num; i++) {
			if(ct[i].getPhonename().contentEquals(name)) {
				ct[i] = ct[i+1];
				num--;
				System.out.println("삭제되었습니다.");
				break;
			}
		}
	}
	void editContact(String name) { // 연락처 수정
		for(int i=0; i<num; i++) {
			if(ct[i].getPhonename().contentEquals(name)) {
				ct[i]=inputContactData();				
			}
//			else {
//				System.out.println("검색결과가 없습니다.");
//				System.out.println("이름을 다시 입력하세요.");
//				break;
//			}		
		}
	}
}
