package ClassDiagram5;

import java.util.*;

public class Course {
     private String name;
     List<Transcript> t = new ArrayList<>();
     List<Student> s = new ArrayList<>();
	
	Course(String name) {
		this.name=name;
		
	}
	public void addTanscript(Transcript transcript) {
		t.add(transcript);
	}
	public  List<Student> getStudent() {
		Iterator<Transcript> a = t.iterator();
		while(a.hasNext()) 
			s.add(a.next().getStudent());
		return s;
	}

	public String getName() {
		return name;
	}
	
	
}
