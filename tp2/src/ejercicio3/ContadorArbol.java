package ejercicio3;

import java.util.LinkedList;
import java.util.List;

import ejercicio1.BinaryTree;

public class ContadorArbol {
	/*
	 * Si el árbol está vacío devuelve null; * Si el árbol no tiene numeros pares,
	 * devuelve null; * Si el árbol tiene números pares, los devuelve en una
	 * LinkedList.
	 */
	private BinaryTree<Integer> arbol;

	public List<Integer> numerosParesInOrden() {
		if (arbol == null || arbol.isEmpty()) {
			return null;
		}
		List<Integer> listaDePares = new LinkedList<Integer>();
		recorridoInOrden(arbol, listaDePares);
		return listaDePares;
	}
	
	public List<Integer> numerosParesPostOrden() {
		if (arbol == null || arbol.isEmpty()) {
			return null;
		}
		List<Integer> listaDePares = new LinkedList<Integer>();
		recorridoPostOrden(arbol, listaDePares);
		return listaDePares;
	}	

	private void recorridoInOrden(BinaryTree<Integer> arbol, List<Integer> lista) {
		if (arbol.hasLeftChild()) {
			recorridoInOrden(arbol.getLeftChild(), lista);
		}
		// Acá aplico la lógica
		if (arbol.getData() % 2 == 0) {
			// Si entra, el entero es par, entonces lo guardo en la lista
			lista.add(arbol.getData());
		}
		if (arbol.hasRightChild()) {
			recorridoInOrden(arbol.getRightChild(), lista);
		}
	}

	private void recorridoPostOrden(BinaryTree<Integer> arbol, List<Integer> lista) {
		if (arbol.hasLeftChild()) {
			recorridoPostOrden(arbol.getLeftChild(), lista);
		}
		if (arbol.hasRightChild()) {
			recorridoPostOrden(arbol.getRightChild(), lista);
		}
		// Acá aplico la lógica
		if (arbol.getData() % 2 == 0) {
			// Si entra, el entero es par, entonces lo guardo en la lista
			lista.add(arbol.getData());
		}
	}

	public void setArbol(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}

}

/*
 * Falta un método para cargar el árbol Falta un método para revisar si un
 * numero es par
 * 
 */
