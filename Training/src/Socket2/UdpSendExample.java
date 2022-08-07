package Socket2;

import java.io.UnsupportedEncodingException;
import java.net.*;

import sun.net.InetAddressCachePolicy;

public class UdpSendExample {

	public static void main(String[] args) throws Exception {
		DatagramSocket datagramSocket = new DatagramSocket();
		
		
		System.out.println("[발신시작]");
		
	 for(int i=1; i<3; i++) {
		 String data = "메세지"+i;
		 byte[] byteArr = data.getBytes("UTF-8");
		 DatagramPacket packet = new DatagramPacket(byteArr,byteArr.length,new InetSocketAddress("localhost",5001));
	    
		 
		 datagramSocket.send(packet);
	     System.out.println("[보낸 바이트 수] :"+ byteArr.length+"bytes" );
	 }
	 System.out.println("[발신종료]");

	 
	 datagramSocket.close();
	}

}
