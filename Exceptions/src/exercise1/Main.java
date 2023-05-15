package exercise1;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(Utils.readInt(sc));
		System.out.println(Utils.readDouble(sc));
		sc.close();
	}
}

/*
Implementa dos funciones, readDouble y readInt, que reciben como parámetro un objeto de tipo Scanner
(para poder leer datos dentro de las funciones).
Estas funciones devuelven un tipo double y un tipo int respectivamente.
Captura dentro de las funciones la excepción InputMismatchException,
de forma que en caso de que tenga lugar la excepción se imprima el mensaje
“El valor introducido no es de tipo XXX” y sustituye XXX por el tipo que se está leyendo.
Si el valor introducido no es correcto se devolverá 0 en el caso de readInt y 0.0 en el caso de readDouble.
En cualquier otro caso, se devolverá el valor leído por teclado.
Crea estas funciones en una clase de nombre Utils.java y decláralas como estáticas.
En otra clase distinta, crea una función main desde la cual se lean datos de teclado de tipo double y de tipo int.
Llama para ello a las funciones que te acabas de crear, y prueba a introducir valores erróneos para provocar
que se lance la excepción y así comprobar que se captura correctamente
y elprograma es capaz de devolver un valor aunque sea 0 para esos casos.
*/