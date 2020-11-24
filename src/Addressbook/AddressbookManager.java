package Addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressbookManager implements AddressbookInterface {
	public static ArrayList<Person>  contacts = new ArrayList<Person> ();
	
	private Scanner inp;
	
	public void Addcontact() {
		
		inp = new Scanner(System.in);
		System.out.println("Enter the firstName:");
		String firstName = inp.nextLine();
		System.out.println("Enter the LastName:");
		String lastName = inp.nextLine();
		System.out.println("Enter the phone:");
		String phonenum = inp.nextLine();
		System.out.println("\nAddress Details:");
		System.out.println("Enter the city:");
		String city = inp.nextLine();
		System.out.println("Enter the state:");
		String state = inp.nextLine();
		System.out.println("Enter the zipcode:");
		String zipcode = inp.nextLine();
		System.out.println("Enter the email-id:");
		String email = inp.nextLine();
		Person p = new Person(firstName, lastName, phonenum,city,state,zipcode,email);
		contacts.add(p);
		
		
	}
		public void display() {
		for (Person person : contacts) {
			System.out.println(person.toString());
			
		}
		
	}
		public void editperson() {
			inp = new Scanner(System.in); 
			int cond=1;
			System.out.println("Enter firstname to update details");
			String name = inp.nextLine();
			for (Person person : contacts) {
				if (name.equals(person.firstname)) {
					while (cond==1)  {
						System.out.println("\"Select an option to edit:\n"
							+ "1) Phonenumber\n"
							+ "2) Address\n"						
							+ "3) Quit"); 
					int numb = inp.nextInt();
					inp = new Scanner(System.in);
					switch (numb) {
					case 1:
						System.out.println("Enter new phone number:");
						String phn = inp.nextLine();
						person.setPhonenumber(phn);
						break;
					case 2:
						System.out.println("Enter new city:");
						String city = inp.nextLine();
						System.out.println("Enter new state:");
						String state = inp.nextLine();
						System.out.println("Enter new zipcode:");
						String zipcode = inp.nextLine();
						System.out.println("Enter new email:");
						String email = inp.nextLine();
						person.setCity(city);
						person.setState(state);
						person.setZipcode(zipcode);
						person.setEmail(email);
						break;
						
					case 3:
						cond = 0;
					     	break;
					default:
						System.out.println("Wrong choice");
						break;
						}
					}
				}
					else  {
						System.out.println("Name not found");
					}
			}
				
			}
			public void deleteperson() {
			inp = new Scanner(System.in);
				System.out.println("Enter firstname to delete its entries");
				String name1 = inp.nextLine();
				for (int i=0; i<contacts.size(); i++) {
					String personName = contacts.get(i).firstname;
					if (name1.equals(personName)) {
						contacts.remove(i);
						System.out.println("Entry deleted");
					}
					else  {
						System.out.println("Name not found");
					}
				}
			}
			
		
	
}
