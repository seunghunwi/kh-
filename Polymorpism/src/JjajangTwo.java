
public class JjajangTwo extends Jjajang {
	
	
	
	

    public JjajangTwo( String  name,String ja, String jjam, String tang, String gun, String air) {
    	super(name ,ja,jjam,tang,gun,air);
   	 this.name = name;
   	 this.ja = ja; 
   	 this.jjam = jjam;
   	 this.tang = tang;
   	 this.gun = gun;
   	 this.air = air;
   	 

} 
    public void bon() {
  		 System.out.println("2호점 가격표입니다.");
  		 System.out.println(ja);
  		System.out.println(jjam);
  		System.out.println(tang);
  		System.out.println(gun);
  		System.out.println(air);
  		System.out.println("=======================");
  		 
   
   }
  

}