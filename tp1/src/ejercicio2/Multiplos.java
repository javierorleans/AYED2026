package ejercicio2;

import java.util.Scanner;

public class Multiplos {

	/* Para probar Scanner
	 * public static int contar42() { Scanner s = new Scanner(System.in); int
	 * cantidad = 1; System.out.println("Ingresar numero. ¿42?"); while (s.nextInt()
	 * != 42) { cantidad++; } return cantidad; }
	 */
	
	public static void multi() {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingresará un número n y se mostraran los primeros n múltiplos de n");
		System.out.print("Ingrese el número: ");				
		int num = s.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println(i * num);
		}
		s.close();
	}

}
