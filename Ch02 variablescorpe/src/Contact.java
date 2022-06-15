
public class Contact {
	
	private String phonename;
	private String phonenumber;
	private String mail;
	private String account;
	private String birth;
	private String group;

	Contact(String phonename, String phonenumber, String mail, String account, String birth, String group) {
		this.phonename = phonename;
		this.phonenumber = phonenumber;
		this.mail = mail;
		this.account = account;
		this.birth = birth;
		this. group = group;
		
    
    

	}

	public String getPhonename() {
		return phonename;
	}

	public void setPhonename(String phonename) {
		this.phonename = phonename;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public  String getGroup() {	
	return group;
	}

	public void setGroup(String group) {
		this.group = group;
 				
	}	  
	void printinfo() {
		
		System.out.println("이름 :" + phonename);
		System.out.println("전화번호 :" + phonenumber);
		System.out.println("이메일 :" + mail);
		System.out.println("주소 :" + account);
		System.out.println("생일 :" + birth);
		System.out.println("그룹 :" + group);	 	
		System.out.println("-------------------------");
	}

}
