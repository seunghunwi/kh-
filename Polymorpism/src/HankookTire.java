

public class HankookTire extends  Tire {
	//필드
	//생성자
	public HankookTire(String Location, int maxRotation) {
		super(Location,maxRotation);
		
	}
    //메소드
	  @Override
	  public boolean roll()	{
		  ++accumulateRotation;
	    	if(accumulateRotation < maxRotation) {
	    		System.out.println(location + "HankookTire 수명" + (maxRotation - accumulateRotation)+"회");
	    		return true;
	    	}else {
	    		System.out.println("***" + location + "HankookTire 펑크***");
	    		return true;
	    		
	    		
	    	}
	  }
	
}
