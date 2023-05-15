package exercise2;

public class NegativeHoursException extends Exception{
	
	@Override
	public String getMessage() {
		return "\nThe following value of hours is not valid!";
	}
	
}
