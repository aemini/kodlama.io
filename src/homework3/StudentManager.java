package homework3;

public class StudentManager {

	public void getDetails(User student) {
		System.out.println(student.getFullName() + "'s details:");
		System.out.println("Id         : " + student.getId());
		System.out.println("Username   : " + student.getUsername());
		System.out.println("Password   : <secret>");
		System.out.println("First Name : " + student.getFirstName());
		System.out.println("Family Name: " + student.getFamilyName());
	}

	public void getAssignedCourses(User student) {
		System.out.println("List " + student.getFirstName() + "'s courses.");
	}

	public void register(Course course, User student) {
		System.out.println("'" + student.getFullName() + "' is registered to '" + course.getName() + "' as student.");
	}

}
