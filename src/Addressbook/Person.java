package Addressbook;

public class Person {
	//attributes
	  String firstname;  
	  String lastname;
	  String phonenumber;
	  Address address;
	  

	  //constructor
	  public Person(String firstname, String lastname, String phonenumber, Address address) {
	    this.firstname = firstname;
	    this.lastname = lastname;
	    this.phonenumber = phonenumber;
	    this.address=address;
	   
	  }
	  
	
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", phonenumber=" + phonenumber
				+ ", address=" + address + "]";
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

	
	
}

