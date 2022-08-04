package Soket;

import java.io.DataOutputStream;
import java.net.Socket;

public class Clientsocket {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("LocalHost", 9999);
			
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("안녕하세요 클라이언트에서 보냅니다.");
			dout.flush();
			dout.close();
			s.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
