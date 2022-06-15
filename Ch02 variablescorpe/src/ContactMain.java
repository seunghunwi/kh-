import java.util.Scanner;

public class ContactMain {

	public static void main(String[] args) {
		System.out.println("관계를 입력하세요 :");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		
	 Contact ct = new Contact("최윤호","010-0000-0000","choi@gmail.com","서울","2000-05-05","친구");
	 
      
	 ct.printinfo();
	 ct.setGroup("asdg");
	 ct.printinfo();
	 
	
	 
	
	}

}
