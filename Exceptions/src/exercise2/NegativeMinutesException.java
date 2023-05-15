package exercise2;

public class NegativeMinutesException extends Exception{
	
	@Override
	public String getMessage() {
		return "\nThe following value of minutes is not valid!";
	}
	
}
