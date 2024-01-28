package javy;

//this class will hold the user of any type
public abstract class User implements UserData{

	protected String nID;				//this reference hold the nID
	protected String username;			//this reference hold the username
	protected String password;			//this reference hold the password
	protected String phoneNumber;		//this reference hold the phoneNumber
	protected String email;				//this reference hold the email

	//this contractor take the data and put it in the global references and set the default values
	public User(String nID, String username, String password, String phoneNumber, String email) {
		this.nID = nID;
		this.username = username;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	//this it protected to make the subClass can use it and prevent others to use it
	protected User() {}

	//and this bunch of getters and setter to each reference
	public String getnID() {
		return nID;
	}
	public void setnID(String nID) {
		this.nID = nID;
	}
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//and here override method from the parent class (object)
	@Override
	public String toString() {
		return "User [nID=" + nID + ", username=" + username + ", password=" + password + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + "]";
	}


}
