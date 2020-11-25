package Addressbook;


import java.util.Scanner;
import java.util.stream.Stream;

public class Searching {
	private Scanner inp = new Scanner(System.in);
	String name;
	boolean found=false;
	
	
	AddressbookManager p =new AddressbookManager();
	public void searchperson() {
		System.out.println("Enter firstname to search");
		name=inp.nextLine();
		for (Person p:AddressbookManager.contacts) {
			if(p.firstname.toLowerCase().equals(name.toLowerCase())) {
				found=true;
				System.out.println(p.toString());
			}
		}
			if(found==false) {
				System.out.println("Not found");
			}	
			
	}
	public void searchcity() {
		System.out.println("Enter City to search");
		name=inp.nextLine();
		int count=0;
		for (Person p:AddressbookManager.contacts) {
			if(p.city.toLowerCase().equals(name.toLowerCase())) {
				found=true;
				count++;
				System.out.println(p.toString());
			}
			
		}
		System.out.println("\nNo. of contact persons by city:"+name+" "+count);
			if(found==false) {
				System.out.println("\nNot found");
			}
		
	}
	public void searchstate() {
		System.out.println("Enter State to search");
		name=inp.nextLine();
		int count=0;
		for (Person p:AddressbookManager.contacts) {
			if(p.state.toLowerCase().equals(name.toLowerCase())) {
				found=true; 
				count++;
				System.out.println(p.toString());
			}
		}
		System.out.println("\nNo. of contact persons by State:"+name+" "+count);
			if(found==false) {
				System.out.println("\nNot found");
			}
	}
	
	
}
