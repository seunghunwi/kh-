import java.util.Scanner;

public class Member {
	String name;
	int number;
	String major;
	int of;
	String mail;
	String birth;
	String add;	

	Member(String name, int number, String major,int of, String mail, String birth, String add ){		
		this.name = name;
		this.number =number;
		this.major = major;
		this.of = of;
		this.mail = mail;
		this.birth = birth;
		this.add = add;		
	}
	Member(String name, int number, String major,int of, String mail){
		this(name, number, major, of, mail, null, null);

	}
	static void print(Member a, Member b) {		 
		System.out.println("이름 :"+ a.name);	    
		System.out.println("전화번호 :"+ a.number);	      
		System.out.println("전공 :"+ a.major);	     
		System.out.println("학년 :"+ a.of);	  
		System.out.println("이메일 :"+ a.mail);	     
		System.out.println("생일 :"+ a.birth);      
		System.out.println("주소 :"+ a.add);

		System.out.println("------------------------------------------");

		System.out.println("이름 :"+ b.name);	    
		System.out.println("전화번호 :"+ b.number);	      
		System.out.println("전공 :"+ b.major);	     
		System.out.println("학년 :"+ b.of);	  
		System.out.println("이메일 :"+ b.mail);	     
		System.out.println("생일 :"+ b.birth);      
		System.out.println("주소 :"+ b.add);
	}
	public static void main(String[] args) {
		Member member = new Member("SHKIM", 010-9999-7777, "컴퓨터" , 2 , "shkim@gmail.com" , "2000-10-11" , "서울"    );
		Member member1 = new Member("JJKIM", 010-1111-3333, "컴퓨터", 2 , "jjkim@gmail.com", "정보없음", "정보없음" );
		print(member, member1);
	}
}


