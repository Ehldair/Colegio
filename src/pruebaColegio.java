
public class pruebaColegio {
	
	public static void main(String[] args) {		
		/*Student s=new Student("Carlos","Calle del Rabo");
		s.addCoursesGrade("Matematicas", 7);
		s.addCoursesGrade("Lengua", 5);
		s.addCoursesGrade("Ingles", 6);
		s.addCoursesGrade("Educación Física", 7);
		s.printGrades();
		double d=s.getAverageGrade();
		System.out.println("Nota Media de "+s.getName()+": "+ d);*/
		
		Teacher t=new Teacher("Ramón","Calle del Jopo");
		System.out.println(t);
		if(t.addCourse("Ingles")==false) {
			System.out.println("Error al matricularte en el curso");
		}
		else {
			System.out.println("Matriculado");
		}
		
		if(t.addCourse("Matemáticas")==false) {
			System.out.println("Error al matricularte en el curso");
		}
		else {
			System.out.println("Matriculado");
		}
		
		if(t.addCourse("Matemáticas")==false) {
			System.out.println("Error al matricularte en el curso");
		}
		else {
			System.out.println("Matriculado");
		}
		
		if(t.addCourse("Ingles")==false) {
			System.out.println("Error al matricularte en el curso");
		}
		else {
			System.out.println("Matriculado");
		}
		
		if(t.addCourse("Lengua")==false) {
			System.out.println("Error al matricularte en el curso");
		}
		else {
			System.out.println("Matriculado");
		}
		
		if(t.addCourse("Ed.Física")==false) {
			System.out.println("Error al matricularte en el curso");
		}
		else {
			System.out.println("Matriculado");
		}
		
		if(t.addCourse("Música")==false) {
			System.out.println("Error al matricularte en el curso");
		}
		else {
			System.out.println("Matriculado");
		}
		
		if(t.removeCourse("Matemáticas")==false) {
			System.out.println("Error al eliminar del curso");
		}
		else {
			System.out.println("Borrado");
		}
		if(t.removeCourse("Matemáticas")==false) {
			System.out.println("Error al eliminar del curso");
		}
		else {
			System.out.println("Borrado");
		}
		
	
		
	
	}
	

}
