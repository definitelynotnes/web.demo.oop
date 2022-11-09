
public class UserTest {
	public static void main(String[] args) {
		AdminUser user = new AdminUser();
		user.setUsername("user1");
		user.setPassword("pass123");
		user.setSecretKey("secret_123");
		user.displayDetails();
	}
	
}

