package coreBankConsole;

public class User {

	private String username;
	private String password;
	private BankAccount account;
	
	public User( String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setAccount(BankAccount account) {
		this.account = account;
	}
	
	
	
	
}
