package ClassDiagram5;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동");
		Student s2 = new Student("홍길서");
		Student s3 = new Student("홍길남");
		
		Course c1 = new Course("Software Engineering");
		Course c2 = new Course("Design pattern");
		
		Transcript t1 = new Transcript(s1, c1);
		
		Transcript t2 = new Transcript(s2, c2);
		
		Transcript t3 = new Transcript(s3, c2);
		
		
		t1.setGrade("A+");
		
		t2.setGrade("C+");
		
		t3.setGrade("A+");
		
		for(Course c : s1.getCourse())
			System.out.println(c.getName());
		for(Student s : c2.getStudent())
			System.out.println(s.getName());
		
		System.out.println(t1.printAll());
		System.out.println(t2.printAll());
		System.out.println(t3.printAll());
	
		}
				
			
	}


