package Equals;

public class Member {
   public String id;
   
   
   public Member (String id) {
	   this.id = id;
   }
   @Override
   public boolean equasl(Object obj) {
	   if(obj instanceof Member) {
		   Member member = (Member)obj;
		   if (id.equals(member.id)) { //필드값이 동일한지 검사
			   //여기 equals는 String class equals()임	
			   return true;
			   
		   }
	   }
	   
	   return false;
	   }
	   
	   
   }


