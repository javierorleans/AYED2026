package ejercicio7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import ejercicio3.Estudiante;

public class TestArrayList {

	public static void main(String[] args) {
				
		String respuesta;
		Scanner s = new Scanner(System.in);
		System.out.print("Ejecutar inciso a, b, d, e, f, g, h, i, j: ");		
		respuesta = s.nextLine();
		switch (respuesta) {
			case "a", "b", "c" -> metodosIncABC();
			case "d", "e" -> metodosIncDE(respuesta);				
			default -> System.out.println("Error...");			
		}
					
	//System.out.println("Ya salí");
		
	}
	
	private static void metodosIncABC() {
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
	
	public static void metodosIncDE(String resp) {
		
		
		List<Estudiante> lista1 = new ArrayList<>();
		
		lista1.add(new Estudiante("Javier", "Orleans", "39A", "javi@gmail.com", "69 699"));
		lista1.add(new Estudiante("Mariana", "Girardell", "12", "mariaaaaana@gmail.com", "69 601"));
		lista1.add(new Estudiante("Ernesto", "Guevara", "10", "che@gmail.com", "cuba 1950"));
		
		List<Estudiante> lista2 = new ArrayList<>();
		
		lista2 = lista1;
		
		System.out.println("Lista original: ");
		imprimirLista(lista1);
		System.out.println();
		System.out.println("Lista copia: ");
		imprimirLista(lista2);
		
		// cambio dato en copia
		for(Estudiante e: lista2) {
			e.setNombre("Maaaaaaaariiii");
		}
		
		if (resp.equals("d")) {
			System.out.println("Nombres cambiados en lista2... ver si se cambió lista1:");
			System.out.println("Lista original: ");
			imprimirLista(lista1);
			System.out.println();
			System.out.println("Lista copia: ");
			imprimirLista(lista2);			
		}
		
		/*
		 * Esta forma de copia, lista2 = lista1; es una COPIA SUPERFICIAL. Copia la estructura pero comparten los objetos.
		 * Por lo tanto, cualquier cambio en una de las listas se ve reflejado en la otra.
		 * A grosso modo, las referencias a cada objeto estan copiadas en las dos listas. 
		 * Por dar un ejemplo, en cada lista, en su primer elemento est{a guardada la misma referencia a un estudiante.
		 * Formas de copiar: 
		 * Varias, muchas son superficiales, y algunas profundas:
		 * Superficiales: 
		 * 1 - La que hice
		 * 2 - Constructor de copia: List<String> copia = new ArrayList<>(original);
		 * 3 - List<String> copia = new ArrayList<>();
		 * 	   copia.addAll(original);
		 * 4 - Collections.copy(destino, origen); hay que tener en cuenta varias cosas que no voy a exponer acá
		 * 5 - List<String> copia = original.stream().toList(); toList() puede devolver lista inmutable (según versión)
		 * 6 - List<String> copia = original.stream().collect(Collectors.toList()); toList() puede devolver lista inmutable (según versión)
		 * 7 - List<String> copia = List.copyOf(original); inmutable
		 * 
		 * Profundas:
		 * 1 - Constructor copia: 
		 * 		List<Persona> copia = new ArrayList<>();
		 *		for (Persona p : original) {
    	 *			copia.add(new Persona(p)); // constructor copia
		 *		}
		 *		teniendo en cuenta que hay que hacer
		 *		class Persona {
    	 *			String nombre;
    	 *			int edad;
    	 *			Direccion direccion;
		 * 
    	 *			public Persona(Persona otra) {
         *				this.nombre = otra.nombre;
         *				this.edad = otra.edad;
         *				this.direccion = new Direccion(otra.direccion);
    	 *			}
         *      }
		 * 2 - Con Streams
		 * 	List<Persona> copia = original.stream().map(p -> new Persona(p)).toList();		 * 
		 * */
		
		
	}
	
	public static void imprimirLista(List<Estudiante> estu) {
		for(Estudiante e: estu) {
			System.out.println(e.tusDatos());
			System.out.println("--------------");
		}
	}

}
