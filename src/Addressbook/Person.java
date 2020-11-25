package Addressbook;

public class Person {
	//attributes
	  String firstname;  
	  String lastname;
	  String phonenumber;
	  String city,state,zipcode,email;
	  

	  //constructor
	  public Person(String firstname, String lastname, String phonenumber, String city, String state,String zipcode,String email) {
	    this.firstname = firstname;
	    this.lastname = lastname;
	    this.phonenumber = phonenumber;
	    this.city=city;
		this.state=state;
		this.zipcode=zipcode;
		this.email=email;
	   
	  }
	  
	  
	  
	  
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", phonenumber=" + phonenumber + ", city="
				+ city + ", state=" + state + ", zipcode=" + zipcode + ", email=" + email + "]";
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}

