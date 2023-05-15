package exercise2;

public class NegativeSecondsException extends Exception{
	
	@Override
	public String getMessage() {
		return "The following value of seconds is not valid!";
	}
	
}
