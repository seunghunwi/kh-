package ClassDiagram5;

import java.util.*;


public class Student {
	private String name;
	List<Transcript> t = new ArrayList<>();
	List<Course> s = new ArrayList<>();

	Student(String name) {
		this.name=name;


	}
	public void addTanscript(Transcript transcript) {
		t.add(transcript);
	}
	public  List<Course> getCourse() {
		Iterator<Transcript> a = t.iterator();
		while(a.hasNext()) 
			s.add(a.next().getCourse());
		return s;
	}



public String getName() {
	return name;
}


}
