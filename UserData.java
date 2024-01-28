package javy;

//this interface we use it to build the user data and to use to make the class that will use this interface must implement this method
public interface UserData {

	//this bunch of getters and setter
	public String getnID();

	public void setnID(String nID);

	public String getUsername();

	public void setUsername(String username);

	public String getPassword();

	public void setPassword(String password);

	public String getPhoneNumber();

	public void setPhoneNumber(String phoneNumber);

	public String getEmail();

	public void setEmail(String email);


}
