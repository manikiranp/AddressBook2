package Addressbook;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Searching {
	private Scanner inp = new Scanner(System.in);
	String name;
	
	public static ArrayList<Person>  contacts = new ArrayList<Person> ();
	
	public void searchperson() {
		System.out.println("Enter firstname to search");
		name=inp.nextLine();
		Stream.of(contacts);
		
	}
	public void searchcity() {
		
	}
	public void searchstate() {
	}
	
}
