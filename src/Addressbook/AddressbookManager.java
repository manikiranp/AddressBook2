package Addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;



public class  AddressbookManager implements AddressbookInterface {
	public static ArrayList<Person>  contacts = new ArrayList<Person> ();
	private Scanner inp;
	
	static String temp;
	
	
	public void Addcontact() {
		Regexpattern pattern=new Regexpattern();
		inp = new Scanner(System.in);
		System.out.println("Enter the firstName:");
		String firstName = inp.nextLine();
		temp=firstName;
		try {
			pattern.validateName(firstName);
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
				
		}
	
public void adding() {
	inp = new Scanner(System.in); 
	Regexpattern pattern=new Regexpattern();
	boolean isfound=false;
	for (Person p : contacts) {
		if (p.firstname.equals(temp)) { 
		isfound=true; 
		System.out.println("Name already present");
		}
	}
		
		
		if(isfound==false) {
		
		System.out.println("Enter the LastName:");
		String lastName = inp.nextLine();
		try {
			pattern.validateaddress(lastName);
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Enter the phone:");
		String phonenum = inp.nextLine();
		try {
			pattern.validatephone(phonenum);
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nAddress Details:");
		System.out.println("Enter the city:");
		String city = inp.nextLine();
		try {
			pattern.validateaddress(city);
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter the state:");
		String state = inp.nextLine();
		try {
			pattern.validateaddress(state);
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter the zipcode:");
		String zipcode = inp.nextLine();
		try {
			pattern.validatezipcode(zipcode);
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter the email-id:");
		String email = inp.nextLine();
		try {
			pattern.validateName(email);
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Person p1 = new Person(temp, lastName, phonenum,city,state,zipcode,email);
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
						System.out.println("\nSelect an option to edit:\n"
							+ "1) Phonenumber\n"
							+ "2) Address\n"						
							+ "3) Quit"); 
					int numb = inp.nextInt();
					//inp = new Scanner(System.in);
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
			
			
			
		public void Searching() {
			inp = new Scanner(System.in); 
			int cond=1; 
			while (cond == 1) {
			System.out.println("Searching order:\n"
				+ "1) Search by Person\n"
				+ "2) Search by City\n"
				+ "3) Search  State\n"
				+ "0) Close");
		System.out.println("Select an option:");
		int numb=inp.nextInt();
		switch (numb) {
		case 1: 
			System.out.println("Enter Name to search");
			String names=inp.next();
			contacts.forEach(n -> {if(names.equalsIgnoreCase(n.firstname))	
				System.out.println(n);
				});
			if(!contacts.contains(names))
			System.out.println("Name not present");
			break;
		
		case 2: 
			  
			System.out.println("Enter city to search");
			String city=inp.next();
			long count1 = contacts.stream().filter(n -> (city.equalsIgnoreCase(n.city))).count();
			System.out.println("No. of contact persons by city: "+count1);
			contacts.forEach(n -> {if(city.equalsIgnoreCase(n.city))
				System.out.println(n.firstname+" "+n.lastname); });
			if(count1==0) System.out.println("City not found");
			break;
		
		case 3: 
			
			System.out.println("Enter State to search");
		String state=inp.next();
			long count2 = contacts.stream().filter(n -> (state.equalsIgnoreCase(n.state))).count();
			System.out.println("No. of contact persons by city: "+count2);
			contacts.forEach(n -> {if(state.equalsIgnoreCase(n.state))
			System.out.println(n.firstname+" "+n.lastname); });
			if(count2==0) System.out.println("State Not found");
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

		
	