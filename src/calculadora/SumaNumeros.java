package calculadora;
import java.util.*;
public class SumaNumeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa el primer número: ");
		int numero1 = scanner.nextInt();
		System.out.print("Ingresa el segundo número: ");
		int numero2 = scanner.nextInt();
		int suma = numero1 + numero2;
		System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
		System.out.println("Ese es el total");
		/*El Programa suma dos numeros introducidos por el usuario*/
		}
	
}
