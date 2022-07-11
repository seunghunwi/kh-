package Project4;

public class CompanyContact  extends Contact{
	 String CompanyName;
	  String departmentName;
	   String rank;
	
	
	
	
	
	
	
	public CompanyContact(String phonename, String phonenumber, String mail, String account, String birth, String group, String CompanyName, String departmentName, String rank) {
		super(phonename, phonenumber, mail, account, birth, group);
		this.CompanyName = CompanyName;
		this.departmentName = departmentName;
		this.rank = rank;
		
	}
	@Override
public void printinfo() {
		System.out.printf("이름:%s\n전화번호:%s\n이메일:%s\n주소:%s\n생일:%s\n그룹:%s\n회사이름:%s\n부서이름:%s\n직급:%s\n=======================\n",
				phonename,phonenumber,mail,account,birth ,group,CompanyName, departmentName,rank );

	

}
}
