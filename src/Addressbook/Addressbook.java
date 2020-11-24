package Addressbook;

import java.util.Scanner;


public class Addressbook {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
			int cond = 1;
			while (cond == 1) {
				Multipleaddressbook menu = new Multipleaddressbook(); 
				System.out.println("Address Book Manager:\n"
						+ "1) New Addressbook\n"
						+ "2) Open Addressbook\n"
						+ "0) Close");
				Scanner inp = new Scanner(System.in);
				System.out.println("Select an option:");
				int num=inp.nextInt();
				switch (num) {
				case 1:
					menu.Createaddressbook();
					break;
				case 2:
					menu.Openaddressbook();
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
