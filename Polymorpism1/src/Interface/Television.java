package Interface;

public class Television implements RemorteCont{
	
	private int volume;
	
	//turnOn 추상 메소드의 실체 메소드
     public void turnOn() {
    	 System.out.println("TV를 켭니다.");
     }
	// turnOff() 추상 메소드의 실체 메소드
     public void turnOff() {
    	 System.out.println("TV를 끕니다.");
     }
     //setVolume() 추상 메소드의 실제 메소     
	@Override
	public void setVolume() {
		 if(volume > RemorteCont.MAX_VOLUME) {
    		 this.volume = RemorteCont.MAX_VOLUME; 		 
    	 }else if(volume <RemorteCont.MIN_VOLUME) {
    		 this.volume = RemorteCont.MIN_VOLUME;
    	 }else {
    		 this.volume = volume;
		
	}System.out.println("현재 TV 볼륨 : " + volume);

		
	}
}
