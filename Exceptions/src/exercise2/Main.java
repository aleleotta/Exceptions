package exercise2;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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