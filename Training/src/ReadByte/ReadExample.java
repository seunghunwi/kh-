package ReadByte;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("C:/temp1/test.txt");
		int readByteNo;
		byte[]readBytes= new byte[3];
		String data = "";
		while(true) {
			readByteNo = is.read(readBytes);
			if(readByteNo == -1)break;
			
			//readByte의 읽은 데이터를 0, 3byte 읽고, 다시 2byte를 읽어서 data에 넣는다.
			data += new String(readBytes,0,readByteNo);
			
		}
		System.out.println(data);
		is.close();

	}

}
