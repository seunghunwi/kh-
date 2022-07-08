package polymorpism2;

public class CustomerContact extends Contact{
	private String businessName;
	private String transactionItems;
	private String rank;
    
	
	
	
	
	
	
	
	CustomerContact(String phonename, String phonenumber, String mail, String account, String birth,
			          String group, String businessname, String transactionItems, String rank) {
		
		super(phonename, phonenumber, mail, account, birth, group);
		this.businessName = businessname;
		this.transactionItems = transactionItems;
		this.rank = rank;
		
	}
	
    @Override
void printinfo() {
    	System.out.printf("이름:%s\n전화번호:%s\n이메일:%s\n주소:%s\n생일:%s\n그룹:%s\n회사이름:%s\n부서이름:%s\n직급:%s\n=======================\n",
				phonename,phonenumber,mail,account,birth ,group,businessName, transactionItems,rank );

}
}