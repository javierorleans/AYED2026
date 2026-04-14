package ejercicio7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		
		/*
		 * Comento la linea siguiente para ver si responde igual. Inc. B: al programar
		 * contra interfaces, no contra implementaciones me da mas flexibilidad
		 * esto es, hacer List<integer> nombre =..... en vez de ArrayList<integer> nombre =... 
		 * o LinkedList<integer> nombre =... 
		 * List<Integer> numeros = new ArrayList<>();
		 */
		List<Integer> numeros = new LinkedList<>();
		
		
		
		numeros.add(10);
		numeros.add(33);
		numeros.add(-2);
		numeros.add(24);
		
		System.out.println("Recorrido con FOR: ");
		for (int i = 0; i < numeros.size(); i++) {
			System.out.print(" | " + numeros.get(i));
		}
		System.out.println();
		System.out.println();
		System.out.println("Recorrido con FOR-EACH clásico: ");
		for (Integer elemento : numeros) {
			System.out.print(" | " + elemento);
		}		
		System.out.println();
		System.out.println();
		
		System.out.println("Recorrido con FOR-EACH Lambda: ");
		numeros.forEach(elemento -> {
			System.out.print(" | " + elemento);
		});
		System.out.println();
		System.out.println();
		
		System.out.println("Recorrido con FOR-EACH Lambda y usando referencia a métodos: ");
		numeros.forEach(System.out::println);
		System.out.println();
		System.out.println();
		
		
		
		
		
	}

}
