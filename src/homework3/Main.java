package homework3;

public class Main {

	public static void main(String[] args) {
		Student arya = new Student(1, "aemini", "123456", "Arya", "Emini");
		Student cafer = new Student(2, "cbezgetiren", "123456", "Cafer", "Bezgetiren");
		Instructor engin = new Instructor(3, "edemirog", "123456", "Engin", "Demiroğ");

		// Create a UserManager instance and register user(s).
		UserManager userManager = new UserManager();
		userManager.register(arya);
		userManager.register(cafer);

		// Create some courses
		Course javaReact = new Course(1, "Java + React");
		Course potato = new Course(2, "Patates doğramada inovatif yaklaşımlar");

		// Assign instructors to courses
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.assign(javaReact, engin);
		instructorManager.assign(potato, cafer);

		// Register students to courses
		StudentManager studentManager = new StudentManager();
		studentManager.register(javaReact, arya);
		studentManager.register(javaReact, cafer);

		// List users registered courses
		studentManager.getAssignedCourses(arya);

		// Get student details
		studentManager.getDetails(arya);
	}

}
