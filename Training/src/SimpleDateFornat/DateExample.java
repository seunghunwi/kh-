package SimpleDateFornat;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class DateExample {

	public static void main(String[] args) {
	 Date asd = new Date(0);
	 String strNUm1 = asd.toString();
	 System.out.println(strNUm1);
	 
	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy년mm월dd일hh분mm분ss초");
	 String srtNum2 = sdf.format(asd);
	 System.out.println(srtNum2);
	 
	 
	 

	}

}
