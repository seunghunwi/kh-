package write;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import javafx.scene.transform.Scale;

public class WriteExample {

	public static void main(String[] args) throws Exception {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("문자열 :");
	  
		
		OutputStream os = new FileOutputStream("C:/temp1/test.txt");
		byte[] data = sc.next().getBytes();
		for(int i=0; i<data.length; i++) {
			os.write(data[i]);			
		}
		os.flush();
		os.close();

	}

}
