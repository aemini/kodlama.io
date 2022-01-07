package homework3;

public class InstructorManager {

	public void assign(Course course, User instructor) {
		System.out.println("'" + instructor.getFullName() + "' assigned to '" + course.getName() + "' as instructor.");
	}

}
