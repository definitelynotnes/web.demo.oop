
public class User {
	protected String username;
	protected String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
	
	protected void displayDetails() {
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}
}
