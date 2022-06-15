
public class StudentScoreReport {

	public static void main(String[] args) {

		System.out.println("###           Score Report         ###");
		System.out.println("이름         국어         영어         수학         |       총합        평균");
		System.out.println("----------------------------------------------------"); 
		
		
		Student[] sd = new Student[10];
		sd[0] = new Student("호날두", 100,70,80);
		sd[1] = new Student("박태잉", 70,80,60);
		sd[2] = new Student("오민석",80,70,70);
		sd[3] = new Student("메시",60,80,80);
		sd[4] = new Student("아저씩",50,60,70);
		sd[5] = new Student("아줌마",70,50,60);
		sd[6] = new Student("이대박",90,90,50);
		sd[7] = new Student("삼대박",90,80,90);
		sd[8] = new Student("사대박",80,70,90);
		sd[9] = new Student("오대박",100,80,90);
		
		
		
		 for(Student student : sd) {		
            System.out.println(student.getName() +"\t"+ student.getKl()+"\t" + student.getEg()+"\t" + student.getMath()+"\t" +"|"+"\t" + student.sum()+"\t" + student.avg());
	}
//		    System.out.printf("%s  %d  %d  %d | %d %f%n", 
//		   sd[i].getname(),sd[i].getkl(), sd[i].geteg(), sd[i].getmath(),sd[i].sum(), sd[i].avg() ) ;
}
}



