package ClassDiagram5;

import java.util.ArrayList;
import java.util.List;

public class Transcript {
	
	   Student student;
	   Course course;	   	   	   	   
	   String date, grade;
	   
     public Transcript(Student student, Course course) {
    	 this.course = course;
    	 this.student = student;
    	 student.addTanscript(this);
    	 course.addTanscript(this);
    	 
     }
     public Student getStudent() {
		 	 return student;
     }
     public Course getCourse() {
    	 return course;
     }
     public void setDate(String date) {
    	this.date = date;
     }
     public String getDate() {
    	 return date;
     }
     public void setGrade(String grade) {
    	 this.grade = grade;
     }
     public String getGrade() {
    	 return grade;
     }
     public String printAll() {
    	 return student.getName() + " " +course.getName() + " " + grade;
    	 
     }
	
	
	
}
