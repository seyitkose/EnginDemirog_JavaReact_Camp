
public class Main {

	public static void main(String[] args) {

		
		
		
//		UserManager userManager = new UserManager();
//		userManager.loginUser(new Student(0, "Seyit", "Köse", "05555555555", "seyitkose@kodlama.io", "12345asd^+"));
//		
//		StudentManager studentManager =new StudentManager();
//		studentManager.addStudent(new Student(0, "Seyit", "Köse", "05555555555", "seyitkose@kodlama.io", "12345asd^+"));
//		studentManager.nextLesson(new Student(0, "Seyit", "Köse", "05555555555", "seyitkose@kodlama.io", "12345asd^+"));
//	
//		userManager.logOutUser(new Student(0, "Seyit", "Köse", "05555555555", "seyitkose@kodlama.io", "12345asd^+"));
		
		
		User user = new User();
		user.setId(0);
		user.setFirstName("Seyit");
		user.setLastName("Köse");
		user.setEmailAdress("seyitkose@kodlama.io");
		user.setPhoneNumber("055555555");
		
		
		Student student = new Student();
		student.setId(0);
		student.setFirstName("Seyit");
		student.setLastName("Köse");
		student.setEmailAdress("seyitkose@kodlama.io");
		student.setPhoneNumber("055555555");
		student.setCountry("kodlama.io");
		
		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setInstructorBranch("Java Eğitimi");
		instructor.setInstructorBranch("Java");

		
		UserManager userManager = new UserManager();
		
		InstructorManager instructorManager = new InstructorManager();
		
		
		
		StudentManager studentManager = new StudentManager();
		
		
		
		
		
		userManager.loginUser(user);
		instructorManager.addInstructor(instructor);
		studentManager.addStudent(student);
		studentManager.addComment(student);
		studentManager.nextLesson(student);
		userManager.logOutUser(user);
		
	}

}
