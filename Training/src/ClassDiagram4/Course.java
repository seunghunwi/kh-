package ClassDiagram4;

import java.util.*;

public class Course {
	String name;

	List<Student> a = new LinkedList<>();
	
	
	public void Course(String name) {
		this.name=name;
	}
	
	public void addStudent(Student name) {
	     a.add(name);
	}
	
	public void removeStudent(Student name) {
		a.remove(name);
	}
	
	public void getStudent(Student name) {
		a.add(name);
	}
	
	public String getName(String name) {
		return name;
	}
	
	

}
