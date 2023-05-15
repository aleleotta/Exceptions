package exercise2;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		long hour = -1;
		long minute = -1;
		long second = -1;
		Scanner sc = new Scanner(System.in);
		while(hour < 0 || minute < 0 || second < 0) {
			System.out.println("Introduce the following parameters.");
			System.out.print("Hours: ");
			hour = sc.nextLong();
			System.out.print("Minutes: ");
			minute = sc.nextLong();
			System.out.print("Seconds: ");
			second = sc.nextLong();
			if(hour < 0 || minute < 0 || second < 0) {
				System.out.println("\nMake sure all parameters are not negative!\n");
			}
		}
		Hour time = new Hour(hour, minute, second);
		int option = 0;
		while(option != 3) {
			System.out.print("\nOptions\n1) Print time\n2) Add seconds to time\n3) Exit program\n\nIntroduce an option: ");
			option = sc.nextInt();
			switch(option) {
			case 1: //Print
				System.out.print(time.toString());
				break;
			case 2: //Add seconds
				long addedSeconds = 0;
				System.out.print("\nIntroduce the seconds you want to add to the time: ");
				addedSeconds = sc.nextLong();
				if(time.secondsIncrement(addedSeconds) == false) {
					System.out.println("Make sure the seconds are positive and above 0 otherwise no seconds will be added.");
				}
				System.out.print(time.toString());
				break;
			case 3:
				break;
			default: //Error
				System.out.println("Introduce a valid option!");
				break;
			}
		}
		System.out.println("\nExiting program...\n\nProgram terminated.");
		sc.close();
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