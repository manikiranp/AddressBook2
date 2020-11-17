package Addressbook;

import java.util.Scanner;


public class Addressbook {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		addcontact();
		
	}

	private static void addcontact() {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the firstName:");
		String firstName = inp.nextLine();
		System.out.println("Enter the LastName:");
		String lastName = inp.nextLine();
		System.out.println("Enter the phone:");
		String phonenum = inp.nextLine();
		System.out.println("\nAddress:");
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
		System.out.println(p.toString());
	}

}
