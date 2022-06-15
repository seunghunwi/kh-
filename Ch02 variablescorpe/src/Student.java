
public class Student {
	private String name;
	private int kl;
	private int eg;
    private int math;
    
    
    public  Student(String name, int kl, int eg, int math) {  
    	
        this.name=name;     
     	this.kl=kl;
     	this.eg=eg;
     	this.math=math;     	  	
    }


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getKl() {
		return kl;
	}


	public void setKl(int kl) {
		this.kl = kl;
	}


	public int getEg() {
		return eg;
	}


	public void setEg(int eg) {
		this.eg = eg;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}
	
	public int sum() {
		return kl + eg + math;		
	}
	public double avg() {
		return (kl + eg + math) / 3; 
	}
    
}

