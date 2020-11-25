package Addressbook;

import java.util.regex.Pattern;
public class Regexpattern {
	
		
		AddressbookManager book=new AddressbookManager();


		public boolean validateName(String name) throws ValidationException {
//			
			String regex = "^[A-Z][a-z]{2,}$";
			try {
			if (name.length()==0) 
			throw new ValidationException(ValidationException.ExceptionType.ENTERED_EMPTY,"Follow proper pattern");
			if (name.matches(regex)) {
				book.adding();
				return true;
			}
			else {
				System.out.println("Invalid format");
				return false;
			}
			}
			catch (NullPointerException e) {
				System.out.println("Invalid Input");
				throw new ValidationException(ValidationException.ExceptionType.ENTEREDNULL,"No Input, Enter Proper Input");
				}
		}
		
		public boolean validateaddress(String name2) throws ValidationException {
//			
			String regex = "^[a-z]{3,}$";
			try {
			if (name2.length()==0) 
			throw new ValidationException(ValidationException.ExceptionType.ENTERED_EMPTY,"Follow proper pattern");
			if (name2.matches(regex)) {
				return true;
			}
			else {
				System.out.println("Invalid format");
				return false;
			}
			}
			catch (NullPointerException e) {
				System.out.println("Invalid Input");
				throw new ValidationException(ValidationException.ExceptionType.ENTEREDNULL,"No Input, Enter Proper Input");
				}
		}
		
		public boolean validatephone(String phonenum) throws ValidationException {
			String regex = "^[+][1-9]{1}[0-9]{0,2} [1-9]{1}[0-9]{9}$";
			try {
				if (phonenum.length()==0) 
					throw new ValidationException(ValidationException.ExceptionType.ENTERED_EMPTY,"Follow proper pattern");
				if (phonenum.matches(regex)) 
					return true;
				else
					System.out.println("Invalid format");
					return false;
			}
			catch (NullPointerException e) {
				System.out.println("Invalid Input");
				throw new ValidationException(ValidationException.ExceptionType.ENTEREDNULL,"No Input, Enter Proper Input");
				
			}
			
		}

		public boolean validatezipcode(String zipcode) throws ValidationException {

			String regex = "^[1-9]{1}[0-9]{5}$";
			try {
				if (zipcode.length()==0) 
				throw new ValidationException(ValidationException.ExceptionType.ENTERED_EMPTY,"Follow proper pattern");
				if (zipcode.matches(regex)) 
					return true;
				else
					System.out.println("Invalid format");
				return false;
				}
			catch (NullPointerException e) {
				System.out.println("Invalid Input");
				throw new ValidationException(ValidationException.ExceptionType.ENTEREDNULL,"No Input, Enter Proper Input");
				
			}
		}

		public boolean validateEmail(String email) throws ValidationException {
			
				String regex = "^([a-z]+)([_+.-]?)([a-z0-9]+)@([A-Za-z0-9]+).([a-z]{2,3})((.[a-z]{2,3})?)$";
				try {
					if (email.length()==0) 
					throw new ValidationException(ValidationException.ExceptionType.ENTERED_EMPTY,"Follow proper pattern");
				if (email.matches(regex)) 
					return true;
				else
					return false;
				}
				catch (NullPointerException e) {
					System.out.println("Invalid Input");
					throw new ValidationException(ValidationException.ExceptionType.ENTEREDNULL,"No Input, Enter Proper Input");
				}
				
		}
	

}
