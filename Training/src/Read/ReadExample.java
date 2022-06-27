package Read;

import java.io.*;


public class ReadExample {

	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("C:/temp1/test.txt");
		int readByte;
		while(true) {
			readByte = is.read();
			if(readByte == -1) break;
			System.out.println(readByte);
			System.out.println((char)readByte);
		}
is.close();
	}

}
