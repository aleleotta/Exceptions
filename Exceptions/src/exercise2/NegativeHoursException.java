package exercise2;

public class NegativeHoursException extends Exception{
	
	@Override
	public String getMessage() {
		return "The following value of hours is not valid!";
	}
	
}
