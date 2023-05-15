package exercise2;

public class NegativeMinutesException extends Exception{
	
	@Override
	public String getMessage() {
		return "The following value of minutes is not valid!";
	}
	
}
