package Addressbook;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class AddressbookManager implements AddressbookInterface {
	public static ArrayList<Person>  contacts = new ArrayList<Person> ();
	private Scanner inp = new Scanner(System.in);
	
	
	public void Addcontact() {
		
		inp = new Scanner(System.in);
		System.out.println("Enter the firstName:");
		String firstName = inp.nextLine();
		boolean isfound=false;
		for (Person p : contacts) {
			if (p.firstname.equals(firstName)) { 
			isfound=true; 
			System.out.println("Name already present");
			}
		}
			if(isfound==false) {
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
			Person p1 = new Person(firstName, lastName, phonenum,city,state,zipcode,email);
			contacts.add(p1);
			}

		}

		public void display() {
		
		for (Person p : contacts) {
			System.out.println(p.toString());
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
		public void search() {
			int cond=1; 
			while (cond == 1) {
			Searching menu = new Searching();
			Stream.of(contacts);
			System.out.println("Searching order:\n"
				+ "1) Search by Person\n"
				+ "2) Search by City\n"
				+ "3) Search by State\n"
				+ "0) Close");
			
		System.out.println("Select an option:");
		int num=inp.nextInt();
		switch (num) {
		
		case 1:
			menu.searchperson();
			break;
		case 2:
			menu.searchcity();
			break;
		case 3:
			menu.searchstate();
			break;
		case 0:
			cond=0;
			break;
		default:
			System.out.println("Wrong option");
			break;
			}
				}
				
			}
		
	
}
