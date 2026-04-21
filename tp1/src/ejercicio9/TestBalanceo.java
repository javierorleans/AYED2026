package ejercicio9;

import ejercicio8.Stack;

public class TestBalanceo {

	public static void main(String[] args) {
		// Resolución presente en la clase 2.2 Herencia en colas - Pilas y Java list

		//String exp = "{()[()]}"; // Está balanceada
		String exp = "([)]";// NO está balanceada
		// suponemos que la expresión sólo contiene paréntesis
		// la expresión puede contener los caracteres ( , ) , [ , ] , { , }
		System.out.println("La expresión está balanceada? " + validar(exp));
	}

	//HAY QUE ARREGLARLA PARA ESTE PROBLEMA
	private static boolean validar(String expresion) {
		Stack<Character> stack = new Stack<Character>();
		// boolean balanceada = true;
		for (int i = 0; i < expresion.length(); i++) {
			char car = expresion.charAt(i);
			if ((car == '(') || (car == '[') || (car == '{')) {
				// Si es cualquiera de los carácteres que ABREN
				stack.push(car);
			} else {
				if (stack.isEmpty()) {
					// Es un caracter que CIERRA y la lista está vacía
					return false;
				} else {
					switch (stack.top()) {
					case '(' -> {if(car == ')' ) {stack.pop();} else return false;}
					case '[' -> {if(car == ']' ) {stack.pop();} else return false;}
					case '{' -> {if(car == '}' ) {stack.pop();} else return false;}					
					}
				}
			}
		}
		return stack.isEmpty();
	}
}
