package ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class EjercicioSucesion {

	public static List<Integer> calcularSucesion(int n) {
		List<Integer> nueva = new ArrayList<>();
		nueva.add(n);
		recursivo(nueva, n);
		return nueva;
	}

	private static void recursivo(List<Integer> lista, int n) {
		if (n == 1) {
			// Caso base. Finaliza recursión
		} else {
			if (n % 2 == 0) {
				// Si es par;
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
			lista.add(n);
			recursivo(lista, n);
		}
	}
}