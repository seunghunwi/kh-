package Flie;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class FileExample {

	public static void main(String[] args) throws Exception {
		File dir = new File("C:||temp1||Dir");
		File file1 = new File("C:/temp1/file1.txt");
		File file2 = new File("C:/temp1/file2.txt");
		File file3 = new File("C:/temp1/file3.txt");

		if(dir.exists()==false) {dir.mkdirs();}
		if(file1.exists()==false) {file1.createNewFile();}
		if(file2.exists()==false) {file2.createNewFile();}
		if(file3.exists()==false) {file3.createNewFile();}


		File temp = new File("C:/temp1");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-ss  a  hh:mm");
		File[] contents = temp.listFiles();
		System.out.println("      날짜                       시간            크기                     이름")	;
		System.out.println("----------------------------------------------------------");
		for(File file : contents) {
			System.out.println(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.println("\t<DIR>\t\t\t"+ file.getName());    		
			}else {
				System.out.println("\t\t\t"+file.length() + "\t" + file.getName());
			}
		}System.out.println();
	}

}
