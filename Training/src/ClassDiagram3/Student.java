package ClassDiagram3;

import java.util.*;

public class Student {
	List<Course> a = new LinkedList<>();
	
	  
	
	
	void registerCourse(Course course) {
		a.add(course);
		
	};
	void dropCourse(Course course) {
		a.remove(course);
		
		
	};
	
	

}

