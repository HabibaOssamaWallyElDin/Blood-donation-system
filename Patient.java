package javy;

public class Patient extends User{


	//this contractor take the data and put it in the inhered global references and set the default values
	public Patient(String nID, String username, String passWord, String phoneNumber, String email) {
		super(nID, username, passWord, phoneNumber, email);
	}

	//this contractor make a default donar object and we make it private to prevent to make a direct object from it
	private Patient(){}
	//this method make a default donar object
	public static Patient getInstance() {
		return new Patient();
	}



}
