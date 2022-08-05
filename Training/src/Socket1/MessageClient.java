package Socket1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MessageClient {

	public static void main(String[] args) throws Exception{
		Socket s = new Socket("LocalHost", 8888);
	

		
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream  dout = new DataOutputStream(s.getOutputStream());
		
		
		Scanner sc = new Scanner(System.in);
		String str ="",str2 = "";
		
		while (!str.equals("exit")){
			str = sc.nextLine();
			dout.writeUTF(str2);
			dout.flush();
			str2 = din.readUTF();
			System.out.println("서버 메세지 :"+str2);
			
		}
		dout.close();
		s.close();
	

	}

}
