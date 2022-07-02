package ClassDiagram4;

import java.util.*;

public class Student {
	String name = "아프리카";
	
	List<Course> a = new LinkedList<>();
	
    
	   
	Student (String name) {
		this.name=name;
		
	}
	
    public void registerCourse(Course name) {
    	if(!a.equals(name)) {
    		a.add(name);
    	}
    	
    	
    }
    
    
    public void dropCourse(Course name) {
    	a.remove(name);
    }
    

	public String getCourse(String name) {
    	return name;
    }
	

}
