package javy;
//this class we make it to hold each Admin
public class Admin {
	private String username;		//this reference hold the username
	private String password;		//this reference hold the password



	//this contractor take the data and put it in the global references and set the default values
	public Admin(String username, String password) {
		this.username = username;
		this.password = password;
	}
	//and this bunch of getters and setter to each reference
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



}
