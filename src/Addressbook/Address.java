package Addressbook;

public class Address {
	String city,state,zipcode,email;
	
	public Address(String city, String state, String zipcode, String email) {
	this.city=city;
	this.state=state;
	this.email=email;
	this.zipcode=zipcode;
	
	}


	

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", zipcode=" + zipcode + ", email=" + email + "]";
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

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}
	
}
