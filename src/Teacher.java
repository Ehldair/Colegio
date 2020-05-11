import java.util.ArrayList;
import java.util.Arrays;

public class Teacher extends Person {
	int numCourses=0;
	String[] courses= {};
	
	
	public Teacher(String name, String address) {
		super(name,address);
		courses= new String[20];
	}
	
	public boolean addCourse(String course) {
		boolean b=true;
		if(numCourses>=4) {
			b=false;
		}
		else {
			if(numCourses==0) {
				this.courses[0]=course;
				numCourses++;
			} else {
				for(int x=0;x<numCourses;x++) {
					if(courses[x]==course) {
						b=false;
					}
				}
				if(b!=false) {
					this.courses[numCourses]=course;
					numCourses++;
				}
			}
		}
		return b;
	}
	
	public void listadoCourse() {
		for(int x=0;x<numCourses;x++) {
			System.out.println(courses[x]);
		}
	}
	
	public boolean removeCourse(String course) {
		boolean b=false;
		for(int x=0;x<numCourses;x++) {
			if(courses[x]==course) {

				ArrayList<String> lista = new ArrayList<>(Arrays.asList(courses));
				lista.remove(x);
				courses = lista.toArray(new String[lista.size()]);
				numCourses--;
				b=true;
			}
		}
		return b;
	}
	public String toString() {
		return "Teacher: "+name+"("+ address+")";
	}
}