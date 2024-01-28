package javy;

//this class we make it to hold each Account
public class Account {

	private User user;				//this reference hold object from its subClasses that Extends from it
	private String bloodGroup;		//this reference hold the blood group
	private String age;				//this reference hold the age
	private String numberOfCase;	//this reference hold the numberOfCase
	private String country;			//this reference hold the country
	private String category;		//this reference hold the category
	private String nationalID;		//this reference hold the nationalID

	private String username;		//this reference hold the username
	private String AccountUsername;	//this reference hold the AccountUsername
	private String AccountNID;		//this reference hold the AccountNID
	private String confirm;			//this reference hold the confirm

	//this contractor take the data and put it in the global references and set the default values
	public Account(User user, String bloodGroup, String age, String numberOfCase, String country, String category,
			String nationalID) {
		this.user = user;
		this.bloodGroup = bloodGroup;
		this.age = age;
		this.numberOfCase = numberOfCase;
		this.country = country;
		this.category = category;
		this.nationalID = nationalID;

		this.username = user.getUsername();

		this.confirm = "false";
	}
	//and this bunch of getters and setter to each reference
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getNumberOfCase() {
		return numberOfCase;
	}
	public void setNumberOfCase(String numberOfCase) {
		this.numberOfCase = numberOfCase;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getNationalID() {
		return nationalID;
	}
	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getAccountUsername() {
		return AccountUsername;
	}

	public void setAccountUsername(String accountUsername) {
		AccountUsername = accountUsername;
	}

	public String getAccountNID() {
		return AccountNID;
	}

	public void setAccountNID(String accountNID) {
		AccountNID = accountNID;
	}

	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	//and here override method from the parent class (object)
	@Override
	public String toString() {
		return "Account [user=" + user + ", bloodGroup=" + bloodGroup + ", age=" + age + ", numberOfCase="
				+ numberOfCase + ", country=" + country + ", category=" + category + ", nationalID=" + nationalID + "]";
	}
}
