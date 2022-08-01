package WriteExample;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws Exception{
		Writer write = new FileWriter("C:/temp1/test.txt");
		char[] data = "홍길동".toCharArray();
		for(int i=0; i<data.length; i++) {
			write.write(data[i]);
			System.out.println(i);
		}
		write.flush();
		write.close();
		

	}

}
