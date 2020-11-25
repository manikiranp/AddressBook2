package Addressbook;


public class ValidationException extends Exception {
	enum ExceptionType{
		ENTEREDNULL,ENTERED_EMPTY
	}
	
	public ExceptionType type;
	
	
	public ValidationException(ExceptionType type, String s) {
		super(s);
		this.type=type;
	}

	public ExceptionType getType() {
		return type;
	}

}
