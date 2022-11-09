
public class AdminUser extends User{
	private String secretKey;
	
	public AdminUser() {
		username = "";
		password = "";
		secretKey = "";
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
	
	protected void displayDetails() {
		super.displayDetails();
		System.out.println("Secret Key: " + secretKey);
	}
	
}
