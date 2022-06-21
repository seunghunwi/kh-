package Interface;

public class RemoteContExample {

	public static void main(String[] args) {
		RemorteCont rc = new RemorteCont() {
			public void turnOn() {
				System.out.println("파워 온");
			}
			public void turnOff() {
				System.out.println("파워 오프");

			}
			public void setVolume() {/* 실행문*/}
		};		 
           rc.turnOn();
           rc.turnOff();
           rc.setMute(true);
           RemorteCont.changeBattery();
	}

}