package homework3;

public class UserManager {

	public void register(User user) {
		System.out.println("User '" + user.getFullName() + "' registered successfully.");
	}

	public void register(User[] users) {
		for (User user : users) {
			register(user);
		}
	}

}
