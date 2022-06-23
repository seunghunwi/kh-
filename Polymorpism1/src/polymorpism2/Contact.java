package polymorpism2;

public class Contact {
	
	 String phonename;
	 String phonenumber;
	 String mail;
	 String account;
	 String birth;
	 String group;

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
		System.out.printf("이름:%s\n전화번호:%s\n이메일:%s\n주소:%s\n생일:%s\n그룹:%s\n=======================\n" ,
				phonename,phonenumber,mail,account,birth,group);
	
	}

}



