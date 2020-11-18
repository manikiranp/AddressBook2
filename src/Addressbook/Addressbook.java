package Addressbook;

import java.util.Scanner;




public class Addressbook {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");	
			int cond = 1;
			while (cond == 1) {
				AddressbookManager menu = new AddressbookManager();
				System.out.println("Address Book:\n"
						+ "1) Add Person\n"
						+ "2) Display\n"
						+ "0) Close");
				Scanner inp = new Scanner(System.in);
				System.out.println("Select an option:");
				int num=inp.nextInt();
				switch (num) {
				case 1:
					menu.Addcontact();
					break;
				case 2:
					menu.display();
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
