package homework3;

public class Instructor extends User {

	private String skills;

	public Instructor(int id, String username, String password, String firstName, String familyName) {
		super(id, username, password, firstName, familyName);
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

}
