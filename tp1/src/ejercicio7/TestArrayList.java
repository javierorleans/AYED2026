package ejercicio7;

import java.util.ArrayList;
import java.util.Arrays;
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
			case "f" -> metodoIncF();
			case "g" -> metodoIncG();
			case "h" -> metodoIncH();
			case "i" -> metodoIncI();
			case "j" -> metodoIncJ();
			default -> System.out.println("Error...");			
		}
					
	//System.out.println("Ya salí");
		
		s.close();
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
		
		
		
		if (resp.equals("d")) {
			// cambio dato en copia		
			for(Estudiante e: lista2) {
				e.setNombre("Maaaaaaaariiii");
			}
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
		
		if(resp.equals("e")) {
			
			boolean existe = false;
			//Estudiante nuevo = new Estudiante("Lemmy", "Kilmister", "666ABC", "lemmydeath@gmail.com", "overkill 321");
			Estudiante nuevo = new Estudiante("Mariana", "Girardell", "12", "mariaaaaana@gmail.com", "69 601");
			for(Estudiante e: lista1) {
				if ((e.equals(nuevo)) && (!existe)) {
					existe= true;
				}
			}
			if(!existe) {
				lista1.add(nuevo);
				System.out.println("-----------Estudiante agregado al final ");
				imprimirLista(lista1);
			}else {
				System.out.println("El estudiante ya existe....");
			}
			
		}
		
	}
	
	public static void metodoIncF() {
		ArrayList<Integer> secuencia = new ArrayList<>(List.of(2, 5, 3, 7, 4, 7, 3, 5, 12));
		System.out.println("Secuencia de números:");
		imprimirSecuenciaInt(secuencia);
		// Borrar despues
		secuencia.add(2, 2222);
		imprimirSecuenciaInt(secuencia);
		
		boolean esCapi = esCapicua(secuencia);
		if(esCapi) {
			System.out.println("Es capicua.");
		}else {
			System.out.println("NO es capicua...");
		}
	}
	
	public static void metodoIncG() {
		List<Integer> suce = new ArrayList<>();
		suce = EjercicioSucesion.calcularSucesion(6);
		imprimirSecuenciaInt(suce);	
	}
	
	public static void metodoIncH() {
		List<Integer> unaLista = new ArrayList<>(Arrays.asList(3, 24, 43, 5, 12, 10, 1121));
		System.out.println("Lista original: ");
		imprimirSecuenciaInt(unaLista);
		invertirArrayList(unaLista);
		System.out.println("Lista Modificada: ");
		imprimirSecuenciaInt(unaLista);		
	}
	
	public static void metodoIncI() {
		List<Integer> unaLista = new LinkedList<>(List.of(3, 24, 43, 5, 12, 10, 1121));
		System.out.println("Lista a sumar: ");
		int suma = sumarLinkedList(unaLista);
		System.out.println("Suma = " + suma);
	}
	
	public static void metodoIncJ() {
		ArrayList<Integer> lista1 = new ArrayList<>(Arrays.asList(1,4,55,66,89,101));
		ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(3,24,43,969));
		ArrayList<Integer> combinada = new ArrayList<>();
		combinada = combinarOrdenado(lista1, lista2);
		System.out.println("Lista combinada: ");
		imprimirSecuenciaInt(combinada);
	}
	
	public static void imprimirLista(List<Estudiante> estu) {
		for(Estudiante e: estu) {
			System.out.println(e.tusDatos());
			System.out.println("--------------");
		}
	}
	
	public static void imprimirSecuenciaInt(List<Integer> lista) {
		for (Integer num : lista) { 
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	public static boolean esCapicua(ArrayList<Integer> lista) {
		//NOTA: deberia hacer una copia del array ya que lo voy a modificar
		boolean sigue = true;
		while ((lista.size() > 1) && (sigue)) {
			//Comparo primer elemento con el último
			if(lista.get(0) != (lista.get(lista.size() - 1))) {
				//si son distintos, no es capicua
				sigue = false; 
			}else{
				//si sigue siendo capicua, acorto la lista para seguir revisando
				lista.remove(0);
				lista.remove(lista.size() - 1);
			}
		}
		return sigue;
	}
	
	public static void invertirArrayList(List<Integer> unaLista) {
		if(unaLista.size() != 0) {
			Integer aux = unaLista.getFirst();
			unaLista.removeFirst();
			invertirArrayList(unaLista);
			unaLista.add(aux);
		}
	}
	
	public static int sumarLinkedList(List<Integer> unaLista) {
		if(unaLista.size() == 0) {
			return 0;
		} else {
			int aux = unaLista.getFirst();
			unaLista.removeFirst();
			aux += sumarLinkedList(unaLista);
			return aux;
		}		
	}

	public static ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
		ArrayList<Integer> combinada = new ArrayList<>();
		while (!lista1.isEmpty() || !lista2.isEmpty()) {
			if (!lista1.isEmpty()) {
				if (!lista2.isEmpty()) {
					// Si llego acá es que las dos listas tienen elementos
					if (lista1.get(0) < lista2.get(0)) {
						// el primer elemento de la lista 1 es el mas pequeño
						combinada.add(lista1.get(0));
						lista1.removeFirst();
					} else {
						// el primer elemento de la lista 2 es el mas pequeño
						combinada.add(lista2.get(0));
						lista2.removeFirst();
					}
				} else {
					// La lista 2 está vacia, por lo que ya guardamos el elemento de la lista 1
					combinada.add(lista1.get(0));
					lista1.removeFirst();
				}
			} else {
				// La lista 1 está vacia, por lo que ya guardamos el elemento de la lista 2
				combinada.add(lista2.get(0));
				lista2.removeFirst();
			}

		}
		return combinada;
	}
	
	
	/* optimizado por CHATGPT: utiliza indices porque removeFirst no es óptimo, debe mover 
	 * todo el resto de elementos.
	 * 
	 * public static ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
    ArrayList<Integer> combinada = new ArrayList<>(lista1.size() + lista2.size());

    int i = 0, j = 0;

    while (i < lista1.size() && j < lista2.size()) {
        if (lista1.get(i) < lista2.get(j)) {
            combinada.add(lista1.get(i));
            i++;
        } else {
            combinada.add(lista2.get(j));
            j++;
        }
    }

	// Agregar lo que sobra
	
    while (i < lista1.size()) {
        combinada.add(lista1.get(i));
        i++;
    }

    while (j < lista2.size()) {
        combinada.add(lista2.get(j));
        j++;
    }

    return combinada;
}
	 * 
	 * */
}
