package Addressbook;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.*;



public class Multipleaddressbook  {
	private Scanner inp = new Scanner(System.in);
	String name,filename; 

	public void Createaddressbook() {	 
		System.out.println("Enter new addressbook name:");
		name = inp.nextLine();
		try {	
			File obj = new File(name+".csv");
			if (obj.createNewFile())
				System.out.println("New Addressbook created: " + obj.getName()); 
				else 
				System.out.println("Addressbook already exists."); 
			}catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
				}
		
	}
		 
	
	public void Openaddressbook() {
		File dirpath = new File(".");	//current directory
		System.out.println("All addressbooks files");
	 	File[] files = dirpath.listFiles(new FilenameFilter() {
	 			public boolean accept(File dirpath, String name) {
				return name.endsWith(".csv");
			}
		});	
		for (File file : files) {
	System.out.println(file.getName());
		}
		
		System.out.println("Enter the addressbook to open:");
		filename = inp.nextLine();
		boolean filefound = false;
		for (File file :files) {
			if(file.getName().equals(filename)) {
				filefound = true;
				int cond=1; 
				while (cond == 1) {
				AddressbookManager menu = new AddressbookManager();
			System.out.println("Address Book:\n"
				+ "1) Add Person\n"
				+ "2) Display\n"
				+ "3) Edit Person\n"
				+ "4) Delete Person\n"
				+ "0) Close");
		
		System.out.println("Select an option:");
		int num=inp.nextInt();
		switch (num) {
		case 1:
			menu.Addcontact();
			break;
		case 2:
			menu.display();
			break;
		case 3:
			menu.editperson();
			break;
		case 4:
			menu.deleteperson();
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
	 if (filefound==false) {
		 System.out.println("Addressbook not found");
		 }
		
		}
	}
}
