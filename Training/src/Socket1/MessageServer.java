package Socket1;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MessageServer {

	public static void main(String[] args)  throws Exception {
		ServerSocket ss = new ServerSocket(8888);
		Socket s =ss.accept();

		
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream  dout = new DataOutputStream(s.getOutputStream());
		
		
		Scanner sc = new Scanner(System.in);
		String str ="",str2 = "";
		
		while (!str.equals("exit")){
			str = din.readUTF();
			System.out.println("클라이언트 메세지 :"+ str) ;
			str2 = sc.nextLine();
			dout.writeUTF(str2);
			dout.flush();
		}
		din.close();
		s.close();
		ss.close();
		
	}

}
