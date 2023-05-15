package exercise2;

public class NegativeSecondsException extends Exception{
	
	@Override
	public String getMessage() {
		return "\nThe following value of seconds is not valid!";
	}
	
}
