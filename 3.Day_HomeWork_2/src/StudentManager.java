

public class StudentManager extends Instructor{
	
	
	
	public void addStudent(Student student) {
		
	
		System.out.println(student.getFirstName() + " " + student.getLastName() + " " + " isimli öğrenci" + " eğitime kayıt oldu.");
	
	}
	
	public void addComment(Student student) {
		
		System.out.println(student.getFirstName() + " " + student.getLastName() + " " + " isimli öğrenci" + " yorum yazdı.");
	}
	
	
public void nextLesson (Student student) {
		
		System.out.println(student.getFirstName() + " " + student.getLastName() + " isimli öğrenci sonraki derse geçti");
	}

}
