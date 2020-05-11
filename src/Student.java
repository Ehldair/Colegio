public class Student extends Person {
	int numCourses=0;
	String[] courses= {};
	int[] grade= {};
	public Student(String name,String address) {
		super(name,address);
		courses=new String[20];
		grade=new int[20];
		}
	public void addCoursesGrade(String course, int grade) {
		if(numCourses>20) {
			System.out.println("No te puedes matricular en mas cursos");
		}
		else {
			courses[numCourses]=course;
			this.grade[numCourses]=grade;
			numCourses++;
		}
	}
	public void printGrades() {
		System.out.println("NOTAS:");
		for(int x=0;x<numCourses;x++) {
			System.out.println(courses[x]+":"+grade[x]);
		}
		System.out.println();
	}
	public double getAverageGrade() {
		double d=0;
		for(int x=0;x<numCourses;x++) {
			d = d + grade[x];
		}
		d=d/numCourses;
		return d;
	}
	public String toString() {
		return "Student: "+name+"("+address+")";
	}
}