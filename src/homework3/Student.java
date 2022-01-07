package homework3;

public class Student extends User {

	private Course course;

	public Student(int id, String username, String password, String firstName, String familyName) {
		super(id, username, password, firstName, familyName);
		/* OR
		 * setId(id);
		 * setUsername(username);
		 * setPassword(password);
		 * setFirstName(firstName);
		 * setFamilyName(familyName);
		 */
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

}
