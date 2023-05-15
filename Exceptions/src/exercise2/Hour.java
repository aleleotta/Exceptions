package exercise2;
import java.util.*;

public class Hour {
	private long hour = 0;
	private long minute = 0;
	private long second = 0;
	
	public Hour() {}
	
	public Hour(long hour, long minute, long second) throws NegativeSecondsException, NegativeMinutesException, NegativeHoursException {
		if(hour >= 0) {
			this.hour = hour;
		} else {
			throw new NegativeHoursException();
		}
		if(minute >= 0) {
			this.minute = minute;
		} else {
			throw new NegativeMinutesException();
		}
		if(second >= 0) {
			this.second = second;
		} else {
			throw new NegativeSecondsException();
		}
	}
	
	public boolean secondsIncrement(long second) {
		boolean confirm = true;
		if(second > 0) {
			this.second = this.second + second;
			while(this.second >= 60) {
				this.minute++;
				this.second = this.second - 60;
			}
			while(this.minute >= 60) {
				this.hour++;
				this.minute = this.minute - 60;
			}
		} else {
			confirm = false;
		}
		return confirm;
	}
	
	@Override
	public String toString() {
		return "\t" + getHour() + ":" + getMinute() + ":" + getSecond() + "\n";
	}
	
	public long getHour() {
		return hour;
	}

	public void setHour(long hour) throws NegativeHoursException {
		this.hour = hour;
	}

	public long getMinute() {
		return minute;
	}

	public void setMinute(long minute) throws NegativeMinutesException {
		this.minute = minute;
	}

	public long getSecond() {
		return second;
	}

	public void setSecond(long second) throws NegativeSecondsException {
		this.second = second;
	}
	
}

/*
Crea tres excepciones nuevas de nombre NegativeSecondException, NegativeMinuteException y NegativeHourException.
Las tres tienen que heredar de Exception.
Partiendo de la clase Hora que diseñaste en el Tema 7, modifica los setter y los constructores para que:
En caso de que se introduzca un segundo negativo se lance la excepción NegativeSecondException.
En caso de que se introduzca un minuto negativo se lance la excepción NegativeMinuteException.
En caso de que se introduzca una hora negativa se lance la excepción NegativeHourException.
Crea una clase con un método main en donde se creen objetos de tipo Hora y se modifiquen sus atributos con los setters.
Mete el código en un bloque try-catch que se encargue de capturar las excepciones creadas.
Debe haber en este caso tres bloques catch, uno por excepción.
*/