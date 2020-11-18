package Addressbook;

import java.util.ArrayList;
import java.util.Scanner;
public class AddressbookManager {
	public static ArrayList<Person> contatcs = new ArrayList<Person>();
	
	public void Addcontact() {
		
		Scanner inp = new Scanner(System.in);
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
		Address a = new Address(city,state,zipcode,email);
		Person p = new Person(firstName, lastName, phonenum, a);
		contatcs.add(p);
	}
		public void display() {
		for (Person person : contatcs) {
			System.out.println(person.toString());
		}
		
	}
	
}
